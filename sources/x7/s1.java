package x7;
public final class s1 implements ia.d {
    public static final s1 f44918a = new Object();
    public static final ia.c f44919b = new ia.c("logEventKey", hc.b.p(w.f.j(c0.class, new z(1))));
    public static final ia.c f44920c = new ia.c("eventCount", hc.b.p(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("inferenceDurationStats", hc.b.p(w.f.j(c0.class, new z(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        s0 s0Var = (s0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f44919b, s0Var.f44915a);
        eVar.a(f44920c, s0Var.f44916b);
        eVar.a(d, s0Var.f44917c);
    }
}
