package y9;
public final class l implements ia.d {
    public static final l f50696a = new Object();
    public static final ia.c f50697b = ia.c.c("baseAddress");
    public static final ia.c f50698c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c f50699e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f50697b, o0Var.f50728a);
        eVar.f(f50698c, o0Var.f50729b);
        eVar.a(d, o0Var.f50730c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f50626a);
        } else {
            bArr = null;
        }
        eVar.a(f50699e, bArr);
    }
}
