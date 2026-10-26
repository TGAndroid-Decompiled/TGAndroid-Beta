package s2;

import a8.wd;
import b2.x;
import org.telegram.ui.Components.b10;
import q3.h;
import s3.c;
public final class a {
    public static final a f47657a = new Object();

    public final wd a(x xVar) {
        String str = xVar.f3586s;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new m3.b(0);
                case 1:
                    return new p3.a();
                case 2:
                    return new h(null);
                case 3:
                    return new m3.b(1);
                case 4:
                    return new c();
            }
        }
        throw new IllegalArgumentException(b10.j("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(x xVar) {
        String str = xVar.f3586s;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return false;
        }
        return true;
    }
}
