package z7;
public final class y2 implements ia.d {
    public static final y2 f47821a = new Object();
    public static final ia.c f47822b = new ia.c("logEventKey", hc.b.p(w.f.k(w.class, new s(1))));
    public static final ia.c f47823c = new ia.c("eventCount", hc.b.p(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("inferenceDurationStats", hc.b.p(w.f.k(w.class, new s(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        j1 j1Var = (j1) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f47822b, j1Var.f47620a);
        eVar.a(f47823c, j1Var.f47621b);
        eVar.a(d, j1Var.f47622c);
    }
}
