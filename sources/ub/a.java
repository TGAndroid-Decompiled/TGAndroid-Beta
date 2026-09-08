package ub;

import v7.c9;
import v7.v8;
import v7.y8;
public final class a {
    public final y8 f47009a;
    public final e f47010b;
    public final qb.d f47011c;

    public a(e eVar, qb.d dVar) {
        String str;
        y8 e7;
        this.f47010b = eVar;
        this.f47011c = dVar;
        if (true != eVar.f47021g) {
            str = "play-services-mlkit-language-id";
        } else {
            str = "language-id";
        }
        synchronized (c9.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                e7 = c9.e(new v8(str));
            } else {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
        }
        this.f47009a = e7;
    }
}
