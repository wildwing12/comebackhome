package com.example.combackhome.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//HandlerInterceptorAdapter �߻�Ŭ���� ���
// preHandle(), postHandle() �������̵�
public class LoginInterceptor 
extends HandlerInterceptorAdapter{

	//���� �׼��� ����Ǳ� ��(��ó��)
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//���� ��ü ����
		HttpSession session=request.getSession();
		//������ ������(�α��ε��� ���� ����)
		if(session.getAttribute("userid")==null) {
			//views/member/login.jsp �������� �̵��ϸ鼭 nologin�޽����� ������.
			response.sendRedirect(request.getContextPath()
					+"/team_join/login.do?message=nologin");
			return false; //���� �׼����� ���� ����
		}else {
			return true; //���� �׼����� �̵�
		}
	}
	
	//���� �׼��� ����� ��
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}

}
