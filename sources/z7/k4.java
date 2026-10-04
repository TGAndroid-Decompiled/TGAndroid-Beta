package z7;
public final class k4 implements ia.d {
    public static final k4 f52810a = new Object();
    public static final ia.c f52811b = new ia.c("maxMs", hg.k0.m(t8.b.o(w.class, new s(1))));
    public static final ia.c f52812c = new ia.c("minMs", hg.k0.m(t8.b.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.k0.m(t8.b.o(w.class, new s(3))));
    public static final ia.c f52813e = new ia.c("firstQuartileMs", hg.k0.m(t8.b.o(w.class, new s(4))));
    public static final ia.c f52814f = new ia.c("medianMs", hg.k0.m(t8.b.o(w.class, new s(5))));
    public static final ia.c f52815g = new ia.c("thirdQuartileMs", hg.k0.m(t8.b.o(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f52811b, maVar.f52840a);
        eVar.a(f52812c, maVar.f52841b);
        eVar.a(d, maVar.f52842c);
        eVar.a(f52813e, maVar.d);
        eVar.a(f52814f, maVar.f52843e);
        eVar.a(f52815g, maVar.f52844f);
    }
}
