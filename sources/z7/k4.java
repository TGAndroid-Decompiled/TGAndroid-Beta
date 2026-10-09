package z7;
public final class k4 implements ia.d {
    public static final k4 f53941a = new Object();
    public static final ia.c f53942b = new ia.c("maxMs", hg.c.m(sc.v.o(w.class, new s(1))));
    public static final ia.c f53943c = new ia.c("minMs", hg.c.m(sc.v.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(sc.v.o(w.class, new s(3))));
    public static final ia.c f53944e = new ia.c("firstQuartileMs", hg.c.m(sc.v.o(w.class, new s(4))));
    public static final ia.c f53945f = new ia.c("medianMs", hg.c.m(sc.v.o(w.class, new s(5))));
    public static final ia.c f53946g = new ia.c("thirdQuartileMs", hg.c.m(sc.v.o(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53942b, maVar.f53971a);
        eVar.a(f53943c, maVar.f53972b);
        eVar.a(d, maVar.f53973c);
        eVar.a(f53944e, maVar.d);
        eVar.a(f53945f, maVar.f53974e);
        eVar.a(f53946g, maVar.f53975f);
    }
}
