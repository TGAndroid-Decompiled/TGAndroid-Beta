package x7;
public final class s1 implements ia.d {
    public static final s1 f45528a = new Object();
    public static final ia.c f45529b = new ia.c("logEventKey", hg.c.o(w.c.k(c0.class, new z(1))));
    public static final ia.c f45530c = new ia.c("eventCount", hg.c.o(w.c.k(c0.class, new z(2))));
    public static final ia.c d = new ia.c("inferenceDurationStats", hg.c.o(w.c.k(c0.class, new z(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        s0 s0Var = (s0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f45529b, s0Var.f45525a);
        eVar.a(f45530c, s0Var.f45526b);
        eVar.a(d, s0Var.f45527c);
    }
}
