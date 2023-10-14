package Remote;
import Response.ResponseString;
import jakarta.ejb.Remote;

@Remote()
public interface ITest 
{
    
    public abstract ResponseString getName() ;

}
