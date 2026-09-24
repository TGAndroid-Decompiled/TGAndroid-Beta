package y9;
public final class l implements ia.d {
    public static final l f46838a = new Object();
    public static final ia.c f46839b = ia.c.c("baseAddress");
    public static final ia.c f46840c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f46839b, o0Var.f46864a);
        eVar.f(f46840c, o0Var.f46865b);
        eVar.a(d, o0Var.f46866c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f46776a);
        } else {
            bArr = null;
        }
        eVar.a(e, bArr);
    }
}
