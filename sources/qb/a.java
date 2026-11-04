package qb;

import x7.b9;
import x7.d9;
import x7.y8;
public final class a {
    public final b9 f53823a;
    public final e f53824b;
    public final mb.d f53825c;

    public a(e eVar, mb.d dVar) {
        String str;
        b9 a10;
        this.f53824b = eVar;
        this.f53825c = dVar;
        if (true != eVar.f53835g) {
            str = "play-services-mlkit-language-id";
        } else {
            str = "language-id";
        }
        synchronized (d9.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a10 = d9.a(new y8(str));
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
        this.f53823a = a10;
    }
}
