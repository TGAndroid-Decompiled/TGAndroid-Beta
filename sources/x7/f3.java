package x7;
public final class f3 implements ia.d {
    public static final f3 f45674a = new Object();
    public static final ia.c f45675b = new ia.c("maxMs", hg.c.m(v7.j.l(c0.class, new z(1))));
    public static final ia.c f45676c = new ia.c("minMs", hg.c.m(v7.j.l(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(v7.j.l(c0.class, new z(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.c.m(v7.j.l(c0.class, new z(4))));
    public static final ia.c f45677f = new ia.c("medianMs", hg.c.m(v7.j.l(c0.class, new z(5))));
    public static final ia.c f45678g = new ia.c("thirdQuartileMs", hg.c.m(v7.j.l(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f45675b, a7Var.f45625a);
        eVar.a(f45676c, a7Var.f45626b);
        eVar.a(d, a7Var.f45627c);
        eVar.a(e, a7Var.d);
        eVar.a(f45677f, a7Var.e);
        eVar.a(f45678g, a7Var.f45628f);
    }
}
