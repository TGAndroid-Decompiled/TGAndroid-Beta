package x7;
public final class s1 implements ia.d {
    public static final s1 f50981a = new Object();
    public static final ia.c f50982b = new ia.c("logEventKey", hg.c.m(sc.v.n(c0.class, new z(1))));
    public static final ia.c f50983c = new ia.c("eventCount", hg.c.m(sc.v.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("inferenceDurationStats", hg.c.m(sc.v.n(c0.class, new z(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        s0 s0Var = (s0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f50982b, s0Var.f50978a);
        eVar.a(f50983c, s0Var.f50979b);
        eVar.a(d, s0Var.f50980c);
    }
}
