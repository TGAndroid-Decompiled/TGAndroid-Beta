package z7;
public final class k4 implements ia.d {
    public static final k4 f52811a = new Object();
    public static final ia.c f52812b = new ia.c("maxMs", hg.k0.m(t8.b.o(w.class, new s(1))));
    public static final ia.c f52813c = new ia.c("minMs", hg.k0.m(t8.b.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.k0.m(t8.b.o(w.class, new s(3))));
    public static final ia.c f52814e = new ia.c("firstQuartileMs", hg.k0.m(t8.b.o(w.class, new s(4))));
    public static final ia.c f52815f = new ia.c("medianMs", hg.k0.m(t8.b.o(w.class, new s(5))));
    public static final ia.c f52816g = new ia.c("thirdQuartileMs", hg.k0.m(t8.b.o(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f52812b, maVar.f52841a);
        eVar.a(f52813c, maVar.f52842b);
        eVar.a(d, maVar.f52843c);
        eVar.a(f52814e, maVar.d);
        eVar.a(f52815f, maVar.f52844e);
        eVar.a(f52816g, maVar.f52845f);
    }
}
