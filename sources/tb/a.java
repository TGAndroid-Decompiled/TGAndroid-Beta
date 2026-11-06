package tb;

import y7.b9;
import y7.e9;
import y7.g9;
public final class a {
    public final e9 f55353a;
    public final e f55354b;
    public final pb.d f55355c;

    public a(e eVar, pb.d dVar) {
        String str;
        e9 a10;
        this.f55354b = eVar;
        this.f55355c = dVar;
        if (true != eVar.f55365g) {
            str = "play-services-mlkit-language-id";
        } else {
            str = "language-id";
        }
        synchronized (g9.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a10 = g9.a(new b9(str));
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
        this.f55353a = a10;
    }
}
