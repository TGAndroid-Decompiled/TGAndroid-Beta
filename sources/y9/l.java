package y9;
public final class l implements ia.d {
    public static final l f51993a = new Object();
    public static final ia.c f51994b = ia.c.c("baseAddress");
    public static final ia.c f51995c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c f51996e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f51994b, o0Var.f52025a);
        eVar.f(f51995c, o0Var.f52026b);
        eVar.a(d, o0Var.f52027c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f51923a);
        } else {
            bArr = null;
        }
        eVar.a(f51996e, bArr);
    }
}
