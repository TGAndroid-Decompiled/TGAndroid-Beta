package y9;
public final class l implements ia.d {
    public static final l f52225a = new Object();
    public static final ia.c f52226b = ia.c.c("baseAddress");
    public static final ia.c f52227c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c f52228e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f52226b, o0Var.f52257a);
        eVar.f(f52227c, o0Var.f52258b);
        eVar.a(d, o0Var.f52259c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f52155a);
        } else {
            bArr = null;
        }
        eVar.a(f52228e, bArr);
    }
}
