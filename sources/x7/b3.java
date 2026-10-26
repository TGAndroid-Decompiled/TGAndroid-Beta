package x7;

import org.telegram.ui.Components.b10;
public final class b3 implements ka.d {
    public static final b3 f51420a = new Object();
    public static final ka.c f51421b = new ka.c("durationMs", ic.a.m(b10.n(d.class, new a(1))));
    public static final ka.c f51422c = new ka.c("imageSource", ic.a.m(b10.n(d.class, new a(2))));
    public static final ka.c d = new ka.c("imageFormat", ic.a.m(b10.n(d.class, new a(3))));
    public static final ka.c e = new ka.c("imageByteSize", ic.a.m(b10.n(d.class, new a(4))));
    public static final ka.c f51423f = new ka.c("imageWidth", ic.a.m(b10.n(d.class, new a(5))));
    public static final ka.c f51424g = new ka.c("imageHeight", ic.a.m(b10.n(d.class, new a(6))));
    public static final ka.c h = new ka.c("rotationDegrees", ic.a.m(b10.n(d.class, new a(7))));

    @Override
    public final void a(Object obj, Object obj2) {
        f7 f7Var = (f7) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(f51421b, f7Var.f51461a);
        eVar.a(f51422c, f7Var.f51462b);
        eVar.a(d, f7Var.f51463c);
        eVar.a(e, f7Var.d);
        eVar.a(f51423f, f7Var.e);
        eVar.a(f51424g, f7Var.f51464f);
        eVar.a(h, f7Var.f51465g);
    }
}
