package za;
public final class h implements ia.d {
    public static final h f48809a = new Object();
    public static final ia.c f48810b = ia.c.c("sessionId");
    public static final ia.c f48811c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c e = ia.c.c("eventTimestampUs");
    public static final ia.c f48812f = ia.c.c("dataCollectionStatus");
    public static final ia.c f48813g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48810b, j0Var.f48824a);
        eVar.a(f48811c, j0Var.f48825b);
        eVar.e(d, j0Var.f48826c);
        eVar.f(e, j0Var.d);
        eVar.a(f48812f, j0Var.e);
        eVar.a(f48813g, j0Var.f48827f);
    }
}
