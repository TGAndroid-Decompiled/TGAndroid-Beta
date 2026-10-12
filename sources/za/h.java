package za;
public final class h implements ia.d {
    public static final h f54465a = new Object();
    public static final ia.c f54466b = ia.c.c("sessionId");
    public static final ia.c f54467c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c f54468e = ia.c.c("eventTimestampUs");
    public static final ia.c f54469f = ia.c.c("dataCollectionStatus");
    public static final ia.c f54470g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54466b, k0Var.f54490a);
        eVar.a(f54467c, k0Var.f54491b);
        eVar.e(d, k0Var.f54492c);
        eVar.f(f54468e, k0Var.d);
        eVar.a(f54469f, k0Var.f54493e);
        eVar.a(f54470g, k0Var.f54494f);
    }
}
