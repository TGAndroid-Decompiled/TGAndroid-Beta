package za;
public final class h implements ia.d {
    public static final h f49045a = new Object();
    public static final ia.c f49046b = ia.c.c("sessionId");
    public static final ia.c f49047c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c e = ia.c.c("eventTimestampUs");
    public static final ia.c f49048f = ia.c.c("dataCollectionStatus");
    public static final ia.c f49049g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49046b, l0Var.f49072a);
        eVar.a(f49047c, l0Var.f49073b);
        eVar.e(d, l0Var.f49074c);
        eVar.f(e, l0Var.d);
        eVar.a(f49048f, l0Var.e);
        eVar.a(f49049g, l0Var.f49075f);
    }
}
