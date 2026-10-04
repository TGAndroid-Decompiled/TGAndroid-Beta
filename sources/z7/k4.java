package z7;
public final class k4 implements ia.d {
    public static final k4 f52816a = new Object();
    public static final ia.c f52817b = new ia.c("maxMs", hg.c.m(sa.e.o(w.class, new s(1))));
    public static final ia.c f52818c = new ia.c("minMs", hg.c.m(sa.e.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(sa.e.o(w.class, new s(3))));
    public static final ia.c f52819e = new ia.c("firstQuartileMs", hg.c.m(sa.e.o(w.class, new s(4))));
    public static final ia.c f52820f = new ia.c("medianMs", hg.c.m(sa.e.o(w.class, new s(5))));
    public static final ia.c f52821g = new ia.c("thirdQuartileMs", hg.c.m(sa.e.o(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f52817b, maVar.f52846a);
        eVar.a(f52818c, maVar.f52847b);
        eVar.a(d, maVar.f52848c);
        eVar.a(f52819e, maVar.d);
        eVar.a(f52820f, maVar.f52849e);
        eVar.a(f52821g, maVar.f52850f);
    }
}
