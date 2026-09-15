package za;
public final class h implements ia.d {
    public static final h f48786a = new Object();
    public static final ia.c f48787b = ia.c.c("sessionId");
    public static final ia.c f48788c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c e = ia.c.c("eventTimestampUs");
    public static final ia.c f48789f = ia.c.c("dataCollectionStatus");
    public static final ia.c f48790g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48787b, j0Var.f48801a);
        eVar.a(f48788c, j0Var.f48802b);
        eVar.e(d, j0Var.f48803c);
        eVar.f(e, j0Var.d);
        eVar.a(f48789f, j0Var.e);
        eVar.a(f48790g, j0Var.f48804f);
    }
}
