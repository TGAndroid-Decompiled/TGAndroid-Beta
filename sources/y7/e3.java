package y7;

import org.telegram.ui.Components.b10;
public final class e3 implements ka.d {
    public static final e3 f52126a = new Object();
    public static final ka.c f52127b = new ka.c("maxMs", ic.a.m(b10.o(b0.class, new y(1))));
    public static final ka.c f52128c = new ka.c("minMs", ic.a.m(b10.o(b0.class, new y(2))));
    public static final ka.c d = new ka.c("avgMs", ic.a.m(b10.o(b0.class, new y(3))));
    public static final ka.c e = new ka.c("firstQuartileMs", ic.a.m(b10.o(b0.class, new y(4))));
    public static final ka.c f52129f = new ka.c("medianMs", ic.a.m(b10.o(b0.class, new y(5))));
    public static final ka.c f52130g = new ka.c("thirdQuartileMs", ic.a.m(b10.o(b0.class, new y(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        y6 y6Var = (y6) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(f52127b, y6Var.f52386a);
        eVar.a(f52128c, y6Var.f52387b);
        eVar.a(d, y6Var.f52388c);
        eVar.a(e, y6Var.d);
        eVar.a(f52129f, y6Var.e);
        eVar.a(f52130g, y6Var.f52389f);
    }
}
