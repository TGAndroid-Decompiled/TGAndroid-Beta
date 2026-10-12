package z7;
public final class k4 implements ia.d {
    public static final k4 f54169a = new Object();
    public static final ia.c f54170b = new ia.c("maxMs", hg.c.o(sc.v.o(w.class, new s(1))));
    public static final ia.c f54171c = new ia.c("minMs", hg.c.o(sc.v.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.o(sc.v.o(w.class, new s(3))));
    public static final ia.c f54172e = new ia.c("firstQuartileMs", hg.c.o(sc.v.o(w.class, new s(4))));
    public static final ia.c f54173f = new ia.c("medianMs", hg.c.o(sc.v.o(w.class, new s(5))));
    public static final ia.c f54174g = new ia.c("thirdQuartileMs", hg.c.o(sc.v.o(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54170b, maVar.f54202a);
        eVar.a(f54171c, maVar.f54203b);
        eVar.a(d, maVar.f54204c);
        eVar.a(f54172e, maVar.d);
        eVar.a(f54173f, maVar.f54205e);
        eVar.a(f54174g, maVar.f54206f);
    }
}
