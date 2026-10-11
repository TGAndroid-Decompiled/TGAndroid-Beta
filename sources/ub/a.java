package ub;

import v7.c9;
import v7.w8;
import v7.z8;
public final class a {
    public final z8 f48969a;
    public final e f48970b;
    public final qb.d f48971c;

    public a(e eVar, qb.d dVar) {
        String str;
        z8 b10;
        this.f48970b = eVar;
        this.f48971c = dVar;
        if (true != eVar.f48981g) {
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
        this.f48969a = b10;
    }
}
