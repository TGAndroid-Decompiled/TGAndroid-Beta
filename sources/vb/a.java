package vb;

import v7.c9;
import v7.v8;
import v7.y8;
public final class a {
    public final y8 f48342a;
    public final e f48343b;
    public final rb.d f48344c;

    public a(e eVar, rb.d dVar) {
        String str;
        y8 b10;
        this.f48343b = eVar;
        this.f48344c = dVar;
        if (true != eVar.f48353g) {
            str = "play-services-mlkit-language-id";
        } else {
            str = "language-id";
        }
        synchronized (c9.class) {
            byte b11 = (byte) (((byte) 1) | 2);
            if (b11 == 3) {
                b10 = c9.b(new v8(str));
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
        this.f48342a = b10;
    }
}
