package za;
public final class h implements ia.d {
    public static final h f51462a = new Object();
    public static final ia.c f51463b = ia.c.c("sessionId");
    public static final ia.c f51464c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c f51465e = ia.c.c("eventTimestampUs");
    public static final ia.c f51466f = ia.c.c("dataCollectionStatus");
    public static final ia.c f51467g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51463b, j0Var.f51480a);
        eVar.a(f51464c, j0Var.f51481b);
        eVar.e(d, j0Var.f51482c);
        eVar.f(f51465e, j0Var.d);
        eVar.a(f51466f, j0Var.f51483e);
        eVar.a(f51467g, j0Var.f51484f);
    }
}
