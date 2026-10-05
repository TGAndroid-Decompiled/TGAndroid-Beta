package x7;
public final class s1 implements ia.d {
    public static final s1 f49659a = new Object();
    public static final ia.c f49660b = new ia.c("logEventKey", hg.c.m(sa.e.n(c0.class, new z(1))));
    public static final ia.c f49661c = new ia.c("eventCount", hg.c.m(sa.e.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("inferenceDurationStats", hg.c.m(sa.e.n(c0.class, new z(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        s0 s0Var = (s0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49660b, s0Var.f49656a);
        eVar.a(f49661c, s0Var.f49657b);
        eVar.a(d, s0Var.f49658c);
    }
}
