package pa;

import java.net.URL;

public class n0 extends ma.u {
    @Override
    public final Object read(ua.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String strV = aVar.v();
        if (strV.equals("null")) {
            return null;
        }
        return new URL(strV);
    }

    @Override
    public final void write(ua.b bVar, Object obj) {
        URL url = (URL) obj;
        bVar.r(url == null ? null : url.toExternalForm());
    }
}
