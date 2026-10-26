package y7;

import org.telegram.ui.Components.b10;
public final class j3 implements ka.d {
    public static final j3 f52186a = new Object();
    public static final ka.c f52187b = new ka.c("imageFormat", ic.a.m(b10.o(b0.class, new y(1))));
    public static final ka.c f52188c = new ka.c("originalImageSize", ic.a.m(b10.o(b0.class, new y(2))));
    public static final ka.c d = new ka.c("compressedImageSize", ic.a.m(b10.o(b0.class, new y(3))));
    public static final ka.c e = new ka.c("isOdmlImage", ic.a.m(b10.o(b0.class, new y(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        c7 c7Var = (c7) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(f52187b, c7Var.f52096a);
        eVar.a(f52188c, c7Var.f52097b);
        eVar.a(d, null);
        eVar.a(e, null);
    }
}
