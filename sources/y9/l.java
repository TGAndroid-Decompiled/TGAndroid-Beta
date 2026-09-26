package y9;
public final class l implements ia.d {
    public static final l f46848a = new Object();
    public static final ia.c f46849b = ia.c.c("baseAddress");
    public static final ia.c f46850c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f46849b, o0Var.f46874a);
        eVar.f(f46850c, o0Var.f46875b);
        eVar.a(d, o0Var.f46876c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f46786a);
        } else {
            bArr = null;
        }
        eVar.a(e, bArr);
    }
}
