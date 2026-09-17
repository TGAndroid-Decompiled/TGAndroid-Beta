package z7;
public final class k4 implements ia.d {
    public static final k4 f48542a = new Object();
    public static final ia.c f48543b = new ia.c("maxMs", hg.k0.o(w.f.k(w.class, new s(1))));
    public static final ia.c f48544c = new ia.c("minMs", hg.k0.o(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.k0.o(w.f.k(w.class, new s(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.k0.o(w.f.k(w.class, new s(4))));
    public static final ia.c f48545f = new ia.c("medianMs", hg.k0.o(w.f.k(w.class, new s(5))));
    public static final ia.c f48546g = new ia.c("thirdQuartileMs", hg.k0.o(w.f.k(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48543b, maVar.f48570a);
        eVar.a(f48544c, maVar.f48571b);
        eVar.a(d, maVar.f48572c);
        eVar.a(e, maVar.d);
        eVar.a(f48545f, maVar.e);
        eVar.a(f48546g, maVar.f48573f);
    }
}
