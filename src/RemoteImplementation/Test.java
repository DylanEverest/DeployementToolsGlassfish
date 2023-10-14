package RemoteImplementation;

import Remote.ITest;
import Response.ResponseString;
import jakarta.ejb.Remote;
import jakarta.ejb.Stateless;

@Stateless
@Remote(ITest.class)
public class Test implements ITest{

    @Override
    public ResponseString getName() 
    {
        return new ResponseString("Tafiditra") ;
    }
    
}
