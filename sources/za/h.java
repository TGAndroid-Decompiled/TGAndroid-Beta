package za;
public final class h implements ia.d {
    public static final h f53103a = new Object();
    public static final ia.c f53104b = ia.c.c("sessionId");
    public static final ia.c f53105c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c f53106e = ia.c.c("eventTimestampUs");
    public static final ia.c f53107f = ia.c.c("dataCollectionStatus");
    public static final ia.c f53108g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53104b, j0Var.f53121a);
        eVar.a(f53105c, j0Var.f53122b);
        eVar.e(d, j0Var.f53123c);
        eVar.f(f53106e, j0Var.d);
        eVar.a(f53107f, j0Var.f53124e);
        eVar.a(f53108g, j0Var.f53125f);
    }
}
