// package com.example.booksite.filter;

// import java.io.IOException;

// import org.springframework.stereotype.Controller;

// import jakarta.servlet.Filter;
// import jakarta.servlet.FilterChain;
// import jakarta.servlet.ServletException;
// import jakarta.servlet.ServletRequest;
// import jakarta.servlet.ServletResponse;

// @Controller
// public class CorsFilter implements Filter {

//     @Override
//     public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//             throws IOException, ServletException {

//         HttpServletRequest request = (HttpServletRequest) req;
//         HttpServletResponse response = (HttpServletResponse) res;

//         response.setHeader("Access-Control-Allow-Origin", "http://localhost:3000");
//         response.setHeader("Access-Control-Allow-Credentials", "true");
//         response.setHeader("Access-Control-Allow-Methods","*");
//         response.setHeader("Access-Control-Max-Age", "3600");
//         response.setHeader("Access-Control-Allow-Headers",
//                 "Origin, X-Requested-With, Content-Type, Accept, Authorization");

//         if("OPTIONS".equalsIgnoreCase(request.getMethod())) {
//             response.setStatus(HttpServletResponse.SC_OK);
//         }else {
//             chain.doFilter(req, res);
//         }
//     }
// }
