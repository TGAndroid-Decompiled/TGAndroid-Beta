package z7;
public final class k4 implements ia.d {
    public static final k4 f48773a = new Object();
    public static final ia.c f48774b = new ia.c("maxMs", hg.k0.m(t8.b.o(w.class, new s(1))));
    public static final ia.c f48775c = new ia.c("minMs", hg.k0.m(t8.b.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.k0.m(t8.b.o(w.class, new s(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.k0.m(t8.b.o(w.class, new s(4))));
    public static final ia.c f48776f = new ia.c("medianMs", hg.k0.m(t8.b.o(w.class, new s(5))));
    public static final ia.c f48777g = new ia.c("thirdQuartileMs", hg.k0.m(t8.b.o(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48774b, maVar.f48801a);
        eVar.a(f48775c, maVar.f48802b);
        eVar.a(d, maVar.f48803c);
        eVar.a(e, maVar.d);
        eVar.a(f48776f, maVar.e);
        eVar.a(f48777g, maVar.f48804f);
    }
}
