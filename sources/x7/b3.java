package x7;

import org.telegram.ui.Components.b10;
public final class b3 implements ka.d {
    public static final b3 f51417a = new Object();
    public static final ka.c f51418b = new ka.c("durationMs", ic.a.m(b10.n(d.class, new a(1))));
    public static final ka.c f51419c = new ka.c("imageSource", ic.a.m(b10.n(d.class, new a(2))));
    public static final ka.c d = new ka.c("imageFormat", ic.a.m(b10.n(d.class, new a(3))));
    public static final ka.c e = new ka.c("imageByteSize", ic.a.m(b10.n(d.class, new a(4))));
    public static final ka.c f51420f = new ka.c("imageWidth", ic.a.m(b10.n(d.class, new a(5))));
    public static final ka.c f51421g = new ka.c("imageHeight", ic.a.m(b10.n(d.class, new a(6))));
    public static final ka.c h = new ka.c("rotationDegrees", ic.a.m(b10.n(d.class, new a(7))));

    @Override
    public final void a(Object obj, Object obj2) {
        f7 f7Var = (f7) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(f51418b, f7Var.f51458a);
        eVar.a(f51419c, f7Var.f51459b);
        eVar.a(d, f7Var.f51460c);
        eVar.a(e, f7Var.d);
        eVar.a(f51420f, f7Var.e);
        eVar.a(f51421g, f7Var.f51461f);
        eVar.a(h, f7Var.f51462g);
    }
}
