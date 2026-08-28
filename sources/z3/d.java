package z3;

import e4.i;
import g7.y8;
import h3.t0;
public final class d {
    public static final d f50290a = new Object();

    public final y8 a(t0 t0Var) {
        String str = t0Var.B;
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
                    return new a4.b(0);
                case 1:
                    return new d4.a();
                case 2:
                    return new i(null);
                case 3:
                    return new a4.b(1);
                case 4:
                    return new g4.c();
            }
        }
        throw new IllegalArgumentException(ta.b.d("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(t0 t0Var) {
        String str = t0Var.B;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return false;
        }
        return true;
    }
}
