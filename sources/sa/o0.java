package sa;

import java.net.URI;
import java.net.URISyntaxException;
public class o0 extends pa.u {
    @Override
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            String v = aVar.v();
            if (v.equals("null")) {
                return null;
            }
            return new URI(v);
        } catch (URISyntaxException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        String aSCIIString;
        URI uri = (URI) obj;
        if (uri == null) {
            aSCIIString = null;
        } else {
            aSCIIString = uri.toASCIIString();
        }
        bVar.r(aSCIIString);
    }
}
