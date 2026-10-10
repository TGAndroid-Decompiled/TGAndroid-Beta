package ub;

import v7.c9;
import v7.w8;
import v7.z8;
public final class a {
    public final z8 f48926a;
    public final e f48927b;
    public final qb.d f48928c;

    public a(e eVar, qb.d dVar) {
        String str;
        z8 b10;
        this.f48927b = eVar;
        this.f48928c = dVar;
        if (true != eVar.f48938g) {
            str = "play-services-mlkit-language-id";
        } else {
            str = "language-id";
        }
        synchronized (c9.class) {
            byte b11 = (byte) (((byte) 1) | 2);
            if (b11 == 3) {
                b10 = c9.b(new w8(str));
            } else {
                StringBuilder sb2 = new StringBuilder();
                if ((b11 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b11 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
        }
        this.f48926a = b10;
    }
}
