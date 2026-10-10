package y9;
public final class l implements ia.d {
    public static final l f52037a = new Object();
    public static final ia.c f52038b = ia.c.c("baseAddress");
    public static final ia.c f52039c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c f52040e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f52038b, o0Var.f52069a);
        eVar.f(f52039c, o0Var.f52070b);
        eVar.a(d, o0Var.f52071c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f51967a);
        } else {
            bArr = null;
        }
        eVar.a(f52040e, bArr);
    }
}
