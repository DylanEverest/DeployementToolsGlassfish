import Jersey.Get;
import Jersey.Post;
import response.ResponseEmploye;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Get get = new Get("http://dylan-aspireek571g:8080/Projet/resources/Emp/employ");

        System.out.println(get.getObject(ResponseEmploye[].class));  ;

        Post<ResponseEmploye> post = new Post<ResponseEmploye> ("http://dylan-aspireek571g:8080/Projet/resources/Emp/Testemploy");

        System.out.println(post.getObject(new ResponseEmploye("tay", 456), boolean.class));
         
    }
}
