import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Administrator on 5/4/2017.
 */
public class MyServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(final HttpServletRequest req,
                         final HttpServletResponse res) throws ServletException, IOException
    {
        res.getWriter()
                .append(String.format("It's %s now\n\n\n\nwww.hascode.com",
                        new Date()));
    }
}
