package y7;

import org.telegram.ui.Components.b10;
public final class m4 implements ka.d {
    public static final m4 f52228a = new Object();
    public static final ka.c f52229b = new ka.c("inferenceCommonLogEvent", ic.a.m(b10.o(b0.class, new y(1))));
    public static final ka.c f52230c = new ka.c("options", ic.a.m(b10.o(b0.class, new y(2))));
    public static final ka.c d = new ka.c("imageInfo", ic.a.m(b10.o(b0.class, new y(3))));
    public static final ka.c e = new ka.c("labelCount", ic.a.m(b10.o(b0.class, new y(4))));
    public static final ka.c f52231f = new ka.c("highestConfidence", ic.a.m(b10.o(b0.class, new y(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        d8 d8Var = (d8) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(f52229b, d8Var.f52119a);
        eVar.a(f52230c, d8Var.f52120b);
        eVar.a(d, d8Var.f52121c);
        eVar.a(e, null);
        eVar.a(f52231f, null);
    }
}
