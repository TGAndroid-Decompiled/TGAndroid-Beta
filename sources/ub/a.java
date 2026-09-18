package ub;

import v7.c9;
import v7.v8;
import v7.y8;
public final class a {
    public final y8 f43904a;
    public final e f43905b;
    public final qb.d f43906c;

    public a(e eVar, qb.d dVar) {
        String str;
        y8 c10;
        this.f43905b = eVar;
        this.f43906c = dVar;
        if (true != eVar.f43915g) {
            str = "play-services-mlkit-language-id";
        } else {
            str = "language-id";
        }
        synchronized (c9.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                c10 = c9.c(new v8(str));
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
        this.f43904a = c10;
    }
}
