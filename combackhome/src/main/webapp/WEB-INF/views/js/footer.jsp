<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <div class="container">
            <div class="row align-items-center">
                <!-- Single Widget Area -->
                <div class="col-12 col-lg-4">
                    <div class="single_widget_area">
                        <!-- Logo -->
                        <div class="footer-logo mr-50">
                           <a href="${path}/team_join/login.do"><img src="${path}/img/core-img/logo2.png" alt=""></a>
                        </div>
                        <!-- Copywrite Text -->
                        <p class="copywrite"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
                    </div>
                </div>
                <!-- Single Widget Area -->
                <div class="col-12 col-lg-8">
                    <div class="single_widget_area">
                        <!-- Footer Menu -->
                        <div class="footer_menu">
                            <nav class="navbar navbar-expand-lg justify-content-end">
                                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#footerNavContent" aria-controls="footerNavContent" aria-expanded="false" aria-label="Toggle navigation"><i class="fa fa-bars"></i></button>
                                <div class="collapse navbar-collapse" id="footerNavContent">
                                    <ul class="navbar-nav ml-auto">
                                        <li class="nav-item active">
                                           <a  class="nav-link" href="${path}/team_join/login.do">메인</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="${path}/shop/product/list.do">상점</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="${path}/carts/list.do">장바구니</a>
                                        </li>
                                         <li class="nav-item">
                                           <a class="nav-link" href="${path}/qna/list.do">고객센터</a>
                                        </li>
                                         <li class="nav-item">
                                           <a class="nav-link" href="${path}/board/list.do">공지사항</a>
                                        </li>
                                        <c:if test="${sessionScope.userid == 'admin' }">
                                        <li class="nav-item">
                                            <a class="nav-link" href="${path}/home2.do">관리자</a>
                                        </li>
                                        </c:if>
                                        
                                        
                                    </ul>
                                </div>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>