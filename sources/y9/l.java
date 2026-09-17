package y9;
public final class l implements ia.d {
    public static final l f49845a = new Object();
    public static final ia.c f49846b = ia.c.c("baseAddress");
    public static final ia.c f49847c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c f49848e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f49846b, o0Var.f49877a);
        eVar.f(f49847c, o0Var.f49878b);
        eVar.a(d, o0Var.f49879c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f49775a);
        } else {
            bArr = null;
        }
        eVar.a(f49848e, bArr);
    }
}
