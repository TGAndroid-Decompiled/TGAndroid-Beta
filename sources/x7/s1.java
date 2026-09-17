package x7;
public final class s1 implements ia.d {
    public static final s1 f49163a = new Object();
    public static final ia.c f49164b = new ia.c("logEventKey", i2.g.n(w.f.j(c0.class, new z(1))));
    public static final ia.c f49165c = new ia.c("eventCount", i2.g.n(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("inferenceDurationStats", i2.g.n(w.f.j(c0.class, new z(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        s0 s0Var = (s0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49164b, s0Var.f49160a);
        eVar.a(f49165c, s0Var.f49161b);
        eVar.a(d, s0Var.f49162c);
    }
}
