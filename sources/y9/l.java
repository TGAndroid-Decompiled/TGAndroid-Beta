package y9;
public final class l implements ia.d {
    public static final l f49844a = new Object();
    public static final ia.c f49845b = ia.c.c("baseAddress");
    public static final ia.c f49846c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c f49847e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f49845b, o0Var.f49876a);
        eVar.f(f49846c, o0Var.f49877b);
        eVar.a(d, o0Var.f49878c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f49774a);
        } else {
            bArr = null;
        }
        eVar.a(f49847e, bArr);
    }
}
