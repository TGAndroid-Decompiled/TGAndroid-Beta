package x7;

import org.telegram.ui.Components.b10;
public final class b3 implements ka.d {
    public static final b3 f51478a = new Object();
    public static final ka.c f51479b = new ka.c("durationMs", ic.a.m(b10.n(d.class, new a(1))));
    public static final ka.c f51480c = new ka.c("imageSource", ic.a.m(b10.n(d.class, new a(2))));
    public static final ka.c d = new ka.c("imageFormat", ic.a.m(b10.n(d.class, new a(3))));
    public static final ka.c e = new ka.c("imageByteSize", ic.a.m(b10.n(d.class, new a(4))));
    public static final ka.c f51481f = new ka.c("imageWidth", ic.a.m(b10.n(d.class, new a(5))));
    public static final ka.c f51482g = new ka.c("imageHeight", ic.a.m(b10.n(d.class, new a(6))));
    public static final ka.c h = new ka.c("rotationDegrees", ic.a.m(b10.n(d.class, new a(7))));

    @Override
    public final void a(Object obj, Object obj2) {
        f7 f7Var = (f7) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(f51479b, f7Var.f51519a);
        eVar.a(f51480c, f7Var.f51520b);
        eVar.a(d, f7Var.f51521c);
        eVar.a(e, f7Var.d);
        eVar.a(f51481f, f7Var.e);
        eVar.a(f51482g, f7Var.f51522f);
        eVar.a(h, f7Var.f51523g);
    }
}
