package ub;

import v7.d9;
import v7.w8;
import v7.z8;
public final class a {
    public final z8 f43951a;
    public final e f43952b;
    public final qb.d f43953c;

    public a(e eVar, qb.d dVar) {
        String str;
        z8 c10;
        this.f43952b = eVar;
        this.f43953c = dVar;
        if (true != eVar.f43962g) {
            str = "play-services-mlkit-language-id";
        } else {
            str = "language-id";
        }
        synchronized (d9.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                c10 = d9.c(new w8(str));
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
        this.f43951a = c10;
    }
}
