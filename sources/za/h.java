package za;
public final class h implements ia.d {
    public static final h f54277a = new Object();
    public static final ia.c f54278b = ia.c.c("sessionId");
    public static final ia.c f54279c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c f54280e = ia.c.c("eventTimestampUs");
    public static final ia.c f54281f = ia.c.c("dataCollectionStatus");
    public static final ia.c f54282g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54278b, l0Var.f54308a);
        eVar.a(f54279c, l0Var.f54309b);
        eVar.e(d, l0Var.f54310c);
        eVar.f(f54280e, l0Var.d);
        eVar.a(f54281f, l0Var.f54311e);
        eVar.a(f54282g, l0Var.f54312f);
    }
}
