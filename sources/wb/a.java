package wb;

import w7.a9;
import w7.d9;
import w7.f9;
public final class a {
    public final d9 f51143a;
    public final e f51144b;
    public final sb.d f51145c;

    public a(e eVar, sb.d dVar) {
        String str;
        d9 a2;
        this.f51144b = eVar;
        this.f51145c = dVar;
        if (true != eVar.f51154g) {
            str = "play-services-mlkit-language-id";
        } else {
            str = "language-id";
        }
        synchronized (f9.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a2 = f9.a(new a9(str));
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
        this.f51143a = a2;
    }
}
