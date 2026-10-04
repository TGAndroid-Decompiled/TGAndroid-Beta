package za;
public final class h implements ia.d {
    public static final h f53102a = new Object();
    public static final ia.c f53103b = ia.c.c("sessionId");
    public static final ia.c f53104c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c f53105e = ia.c.c("eventTimestampUs");
    public static final ia.c f53106f = ia.c.c("dataCollectionStatus");
    public static final ia.c f53107g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53103b, j0Var.f53120a);
        eVar.a(f53104c, j0Var.f53121b);
        eVar.e(d, j0Var.f53122c);
        eVar.f(f53105e, j0Var.d);
        eVar.a(f53106f, j0Var.f53123e);
        eVar.a(f53107g, j0Var.f53124f);
    }
}
