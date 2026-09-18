package z7;
public final class k4 implements ia.d {
    public static final k4 f48547a = new Object();
    public static final ia.c f48548b = new ia.c("maxMs", hg.k0.o(w.f.k(w.class, new s(1))));
    public static final ia.c f48549c = new ia.c("minMs", hg.k0.o(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.k0.o(w.f.k(w.class, new s(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.k0.o(w.f.k(w.class, new s(4))));
    public static final ia.c f48550f = new ia.c("medianMs", hg.k0.o(w.f.k(w.class, new s(5))));
    public static final ia.c f48551g = new ia.c("thirdQuartileMs", hg.k0.o(w.f.k(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48548b, maVar.f48575a);
        eVar.a(f48549c, maVar.f48576b);
        eVar.a(d, maVar.f48577c);
        eVar.a(e, maVar.d);
        eVar.a(f48550f, maVar.e);
        eVar.a(f48551g, maVar.f48578f);
    }
}
