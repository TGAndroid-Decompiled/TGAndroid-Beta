package za;
public final class h implements ia.d {
    public static final h f54354a = new Object();
    public static final ia.c f54355b = ia.c.c("sessionId");
    public static final ia.c f54356c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c f54357e = ia.c.c("eventTimestampUs");
    public static final ia.c f54358f = ia.c.c("dataCollectionStatus");
    public static final ia.c f54359g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54355b, k0Var.f54379a);
        eVar.a(f54356c, k0Var.f54380b);
        eVar.e(d, k0Var.f54381c);
        eVar.f(f54357e, k0Var.d);
        eVar.a(f54358f, k0Var.f54382e);
        eVar.a(f54359g, k0Var.f54383f);
    }
}
