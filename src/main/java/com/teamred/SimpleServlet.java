package com.teamred;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "SimpleServlet", urlPatterns = { "/servlet" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

                request.getContextPath();
                request.getRequestURI();
                request.getContextPath();
                request.getPathInfo();
            
                try {
                    String json = "{\"text\":\"nothing here\"}";

                    if (request.getMethod().equals("GET")) {
                        json = "";
                        //String json = new Gson().toJson(someObject);
                        json = json.concat("")
                        .concat("{")
                        .concat("\"glossary\":{")
                        .concat("\"title\":\"exampleglossary\",")
                        .concat("\"GlossDiv\":{")
                        .concat("\"title\":\"S\",")
                        .concat("\"GlossList\":{")
                        .concat("\"GlossEntry\":{")
                        .concat("\"ID\":\"SGML\",")
                        .concat("\"SortAs\":\"SGML\",")
                        .concat("\"GlossTerm\":\"StandardGeneralizedMarkupLanguage\",")
                        .concat("\"Acronym\":\"SGML\",")
                        .concat("\"Abbrev\":\"ISO8879:1986\",")
                        .concat("\"GlossDef\":{")
                        .concat("\"para\":\"Ameta-markuplanguage,usedtocreatemarkuplanguagessuchasDocBook.\",")
                        .concat("\"GlossSeeAlso\":[\"GML\",\"XML\"]")
                        .concat("},")
                        .concat("\"GlossSee\":\"markup\"")
                        .concat("}")
                        .concat("}")
                        .concat("}")
                        .concat("}")
                        .concat("}");                        ;

                        response.setContentType("application/json");
                        response.setCharacterEncoding("UTF-8");
                        response.getWriter().write(json);
        
                    } else {
                        json = "";
                        json = json.concat("")
                        .concat("{")
                        .concat("\"glossary\":{")
                        .concat("\"title\":\"exampleglossary\",")
                        .concat("\"GlossDiv\":{")
                        .concat("\"title\":\"S\",")
                        .concat("\"GlossList\":{")
                        .concat("\"GlossEntry\":{")
                        .concat("\"ID\":\"SGML\",")
                        .concat("\"SortAs\":\"SGML\",")
                        .concat("\"GlossTerm\":\"StandardGeneralizedMarkupLanguage\",")
                        .concat("\"Acronym\":\"SGML\",")
                        .concat("\"Abbrev\":\"ISO8879:1986\",")
                        .concat("\"GlossDef\":{")
                        .concat("\"para\":\"Ameta-markuplanguage,usedtocreatemarkuplanguagessuchasDocBook.\",")
                        .concat("\"GlossSeeAlso\":[\"GML\",\"XML\"]")
                        .concat("},")
                        .concat("\"GlossSee\":\"markup\"")
                        .concat("}")
                        .concat("}")
                        .concat("}")
                        .concat("}")
                        .concat("}");                      ;

                        response.setContentType("application/json");
                        response.setCharacterEncoding("UTF-8");
                        response.getWriter().write(json);
                    }
                } catch (Exception e) {
                    throw new ServletException("Executing action failed.", e);
                }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	public String getServletInfo() {
		return "Dispatcher servlet for the UserApp";
	}
}