package z7;
public final class y2 implements ia.d {
    public static final y2 f51339a = new Object();
    public static final ia.c f51340b = new ia.c("logEventKey", i2.g.n(w.f.k(w.class, new s(1))));
    public static final ia.c f51341c = new ia.c("eventCount", i2.g.n(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("inferenceDurationStats", i2.g.n(w.f.k(w.class, new s(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        j1 j1Var = (j1) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51340b, j1Var.f51122a);
        eVar.a(f51341c, j1Var.f51123b);
        eVar.a(d, j1Var.f51124c);
    }
}
