package x7;
public final class f3 implements ia.d {
    public static final f3 f45688a = new Object();
    public static final ia.c f45689b = new ia.c("maxMs", hg.c.m(v7.j.l(c0.class, new z(1))));
    public static final ia.c f45690c = new ia.c("minMs", hg.c.m(v7.j.l(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(v7.j.l(c0.class, new z(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.c.m(v7.j.l(c0.class, new z(4))));
    public static final ia.c f45691f = new ia.c("medianMs", hg.c.m(v7.j.l(c0.class, new z(5))));
    public static final ia.c f45692g = new ia.c("thirdQuartileMs", hg.c.m(v7.j.l(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f45689b, a7Var.f45639a);
        eVar.a(f45690c, a7Var.f45640b);
        eVar.a(d, a7Var.f45641c);
        eVar.a(e, a7Var.d);
        eVar.a(f45691f, a7Var.e);
        eVar.a(f45692g, a7Var.f45642f);
    }
}
