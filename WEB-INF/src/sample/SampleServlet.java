package sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		//super.doGet(req, resp);
		
        // ↓ ここから追加
        // 日本語の文字化け対策のため、文字エンコーディングを行う
        resp.setContentType("text/html; charset=UTF-8");

        // クライアントの WEB ブラウザに表示する WEB 画面を作成する
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>sample</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello こんにちは</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
        // ↑ ここまで追加
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		super.doPost(req, resp);
	}

}
