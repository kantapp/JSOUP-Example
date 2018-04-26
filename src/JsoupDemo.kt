import org.jsoup.Jsoup
import java.awt.SystemColor.text



fun main(args:Array<String>)
{
    val document = Jsoup.connect("https://www.drikpanchang.com/calendars/indian/indiancalendar.html?year=2020").timeout(6000).get()
    val ele=document.select("table.festInnerTbl")

    for (tr in ele.select("tr"))
    {
        val date=tr.select("td")[0].text()
        val day=tr.select("td")[1].text()
        val fastive=tr.select("td")[2].text()
        println("$date $day $fastive")
        println(tr.select("td")[2].select("div").attr("class"))
        println("\n..........................................................\n")


    }

//    for (element in ele.select("div.result"))
//    {
//        val img_url = element.select("div.result_thumb img").attr("src")
//        println(img_url)
//
//        val title = element.select("div.result_data a").text()
//        println(title)
//    }
}