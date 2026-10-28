package y7;

import org.telegram.ui.Components.b10;
public final class e3 implements ka.d {
    public static final e3 f52184a = new Object();
    public static final ka.c f52185b = new ka.c("maxMs", ic.a.m(b10.o(b0.class, new y(1))));
    public static final ka.c f52186c = new ka.c("minMs", ic.a.m(b10.o(b0.class, new y(2))));
    public static final ka.c d = new ka.c("avgMs", ic.a.m(b10.o(b0.class, new y(3))));
    public static final ka.c e = new ka.c("firstQuartileMs", ic.a.m(b10.o(b0.class, new y(4))));
    public static final ka.c f52187f = new ka.c("medianMs", ic.a.m(b10.o(b0.class, new y(5))));
    public static final ka.c f52188g = new ka.c("thirdQuartileMs", ic.a.m(b10.o(b0.class, new y(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        y6 y6Var = (y6) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(f52185b, y6Var.f52444a);
        eVar.a(f52186c, y6Var.f52445b);
        eVar.a(d, y6Var.f52446c);
        eVar.a(e, y6Var.d);
        eVar.a(f52187f, y6Var.e);
        eVar.a(f52188g, y6Var.f52447f);
    }
}
