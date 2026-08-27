package z3;

import e4.i;
import h3.t0;
import h7.p8;

public final class d {

    public static final d f50190a = new d();

    public final p8 a(t0 t0Var) {
        String str = t0Var.B;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new a4.b(0);
                case "application/x-icy":
                    return new d4.a();
                case "application/id3":
                    return new i(null);
                case "application/x-emsg":
                    return new a4.b(1);
                case "application/x-scte35":
                    return new g4.c();
            }
        }
        throw new IllegalArgumentException(s3.c.e("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(t0 t0Var) {
        String str = t0Var.B;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
