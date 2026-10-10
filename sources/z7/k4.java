package z7;
public final class k4 implements ia.d {
    public static final k4 f53987a = new Object();
    public static final ia.c f53988b = new ia.c("maxMs", hg.c.m(sc.v.o(w.class, new s(1))));
    public static final ia.c f53989c = new ia.c("minMs", hg.c.m(sc.v.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(sc.v.o(w.class, new s(3))));
    public static final ia.c f53990e = new ia.c("firstQuartileMs", hg.c.m(sc.v.o(w.class, new s(4))));
    public static final ia.c f53991f = new ia.c("medianMs", hg.c.m(sc.v.o(w.class, new s(5))));
    public static final ia.c f53992g = new ia.c("thirdQuartileMs", hg.c.m(sc.v.o(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53988b, maVar.f54017a);
        eVar.a(f53989c, maVar.f54018b);
        eVar.a(d, maVar.f54019c);
        eVar.a(f53990e, maVar.d);
        eVar.a(f53991f, maVar.f54020e);
        eVar.a(f53992g, maVar.f54021f);
    }
}
