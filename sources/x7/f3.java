package x7;
public final class f3 implements ia.d {
    public static final f3 f45687a = new Object();
    public static final ia.c f45688b = new ia.c("maxMs", hg.c.m(v7.j.l(c0.class, new z(1))));
    public static final ia.c f45689c = new ia.c("minMs", hg.c.m(v7.j.l(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(v7.j.l(c0.class, new z(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.c.m(v7.j.l(c0.class, new z(4))));
    public static final ia.c f45690f = new ia.c("medianMs", hg.c.m(v7.j.l(c0.class, new z(5))));
    public static final ia.c f45691g = new ia.c("thirdQuartileMs", hg.c.m(v7.j.l(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f45688b, a7Var.f45638a);
        eVar.a(f45689c, a7Var.f45639b);
        eVar.a(d, a7Var.f45640c);
        eVar.a(e, a7Var.d);
        eVar.a(f45690f, a7Var.e);
        eVar.a(f45691g, a7Var.f45641f);
    }
}
