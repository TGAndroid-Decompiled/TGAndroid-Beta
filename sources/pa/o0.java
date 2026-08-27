package pa;

import java.net.URI;
import java.net.URISyntaxException;

public class o0 extends ma.u {
    @Override
    public final Object read(ua.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            String strV = aVar.v();
            if (strV.equals("null")) {
                return null;
            }
            return new URI(strV);
        } catch (URISyntaxException e9) {
            throw new ma.j(e9);
        }
    }

    @Override
    public final void write(ua.b bVar, Object obj) {
        URI uri = (URI) obj;
        bVar.r(uri == null ? null : uri.toASCIIString());
    }
}
