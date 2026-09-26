package y9;
public final class l implements ia.d {
    public static final l f46849a = new Object();
    public static final ia.c f46850b = ia.c.c("baseAddress");
    public static final ia.c f46851c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f46850b, o0Var.f46875a);
        eVar.f(f46851c, o0Var.f46876b);
        eVar.a(d, o0Var.f46877c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f46787a);
        } else {
            bArr = null;
        }
        eVar.a(e, bArr);
    }
}
