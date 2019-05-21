import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * in this class i want to open more client of different company in one queue
 * you should get:
 *                 can;
 *                 can't;
 *                 can't;
 *                 can;
 *                 can;
 */

public class testOfOpen
{
    public static void main(String[] args)
    {
        Desktop d = Desktop.getDesktop();

        try {
            d.browse(new URI("http://some_domain.com/company/779/users?name=Svetoshka"));
            d.browse(new URI("http://some_domain.com/company/777/users?name=Izergil"));
            d.browse(new URI("http://some_domain.com/company/700/users?name=Jack"));
            d.browse(new URI("http://some_domain.com/company/779/users?name=BigBoss"));
            d.browse(new URI("http://some_domain.com/company/779/users?name=SmallBoss"));
        } catch (URISyntaxException | IOException use) {
            use.printStackTrace();
        }
    }
}