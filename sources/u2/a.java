package u2;

import b8.te;
import d2.v;
import s3.h;
import u3.c;
public final class a {
    public static final a f55473a = new Object();

    public final te a(v vVar) {
        String str = vVar.f8489s;
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    return new o3.b(0);
                case 1:
                    return new r3.a();
                case 2:
                    return new h(null);
                case 3:
                    return new o3.b(1);
                case 4:
                    return new c();
            }
        }
        throw new IllegalArgumentException(t4.c.f("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(v vVar) {
        String str = vVar.f8489s;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return false;
        }
        return true;
    }
}
