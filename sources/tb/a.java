package tb;

import y7.a9;
import y7.d9;
import y7.f9;
public final class a {
    public final d9 f57648a;
    public final e f57649b;
    public final pb.d f57650c;

    public a(e eVar, pb.d dVar) {
        String str;
        d9 a10;
        this.f57649b = eVar;
        this.f57650c = dVar;
        if (true != eVar.f57660g) {
            str = "play-services-mlkit-language-id";
        } else {
            str = "language-id";
        }
        synchronized (f9.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a10 = f9.a(new a9(str));
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
        this.f57648a = a10;
    }
}
