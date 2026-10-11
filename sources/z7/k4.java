package z7;
public final class k4 implements ia.d {
    public static final k4 f54066a = new Object();
    public static final ia.c f54067b = new ia.c("maxMs", hg.c.m(sc.v.o(w.class, new s(1))));
    public static final ia.c f54068c = new ia.c("minMs", hg.c.m(sc.v.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(sc.v.o(w.class, new s(3))));
    public static final ia.c f54069e = new ia.c("firstQuartileMs", hg.c.m(sc.v.o(w.class, new s(4))));
    public static final ia.c f54070f = new ia.c("medianMs", hg.c.m(sc.v.o(w.class, new s(5))));
    public static final ia.c f54071g = new ia.c("thirdQuartileMs", hg.c.m(sc.v.o(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54067b, maVar.f54099a);
        eVar.a(f54068c, maVar.f54100b);
        eVar.a(d, maVar.f54101c);
        eVar.a(f54069e, maVar.d);
        eVar.a(f54070f, maVar.f54102e);
        eVar.a(f54071g, maVar.f54103f);
    }
}
