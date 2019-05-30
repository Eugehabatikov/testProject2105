
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class CoinmarketcapTest
{
     public static class Test
     {
         public static void main(String[] args)
         {

             ArrayList<Double> elementArrayList = new ArrayList<>();

             Document doc = null;
             try {
                 doc = Jsoup.connect("https://coinmarketcap.com/").get();
             } catch (IOException e) {
                 e.printStackTrace();
             }
             Elements t1Elements = doc.getElementsByAttributeValue("class", "no-wrap text-right");

             t1Elements.forEach(t1Element ->
             {
                 Element aElement = t1Element.child(0);
                 Double sum = Double.valueOf(aElement.text().substring(1).replace(",", ""));
                 elementArrayList.add(sum);
             });

             for (int i = 0; i < elementArrayList.size(); i++)
             {
                 System.out.println(elementArrayList.get(i));
             }

         }
         public Test() throws IOException
         {

         }
     }


}
