package z7;
public final class k4 implements ia.d {
    public static final k4 f53943a = new Object();
    public static final ia.c f53944b = new ia.c("maxMs", hg.c.m(sc.v.o(w.class, new s(1))));
    public static final ia.c f53945c = new ia.c("minMs", hg.c.m(sc.v.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(sc.v.o(w.class, new s(3))));
    public static final ia.c f53946e = new ia.c("firstQuartileMs", hg.c.m(sc.v.o(w.class, new s(4))));
    public static final ia.c f53947f = new ia.c("medianMs", hg.c.m(sc.v.o(w.class, new s(5))));
    public static final ia.c f53948g = new ia.c("thirdQuartileMs", hg.c.m(sc.v.o(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53944b, maVar.f53973a);
        eVar.a(f53945c, maVar.f53974b);
        eVar.a(d, maVar.f53975c);
        eVar.a(f53946e, maVar.d);
        eVar.a(f53947f, maVar.f53976e);
        eVar.a(f53948g, maVar.f53977f);
    }
}
