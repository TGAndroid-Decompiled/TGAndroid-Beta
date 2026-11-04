package z7;
public final class f3 implements ma.d {
    public static final f3 f59861a = new Object();
    public static final ma.c f59862b = new ma.c("maxMs", k2.p1.o(t4.c.k(b0.class, new y(1))));
    public static final ma.c f59863c = new ma.c("minMs", k2.p1.o(t4.c.k(b0.class, new y(2))));
    public static final ma.c d = new ma.c("avgMs", k2.p1.o(t4.c.k(b0.class, new y(3))));
    public static final ma.c f59864e = new ma.c("firstQuartileMs", k2.p1.o(t4.c.k(b0.class, new y(4))));
    public static final ma.c f59865f = new ma.c("medianMs", k2.p1.o(t4.c.k(b0.class, new y(5))));
    public static final ma.c f59866g = new ma.c("thirdQuartileMs", k2.p1.o(t4.c.k(b0.class, new y(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        z6 z6Var = (z6) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.a(f59862b, z6Var.f60143a);
        eVar.a(f59863c, z6Var.f60144b);
        eVar.a(d, z6Var.f60145c);
        eVar.a(f59864e, z6Var.d);
        eVar.a(f59865f, z6Var.f60146e);
        eVar.a(f59866g, z6Var.f60147f);
    }
}
