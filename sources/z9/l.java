package z9;
public final class l implements ja.d {
    public static final l f51414a = new Object();
    public static final ja.c f51415b = ja.c.c("baseAddress");
    public static final ja.c f51416c = ja.c.c("size");
    public static final ja.c d = ja.c.c("name");
    public static final ja.c e = ja.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ja.e eVar = (ja.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f51415b, o0Var.f51440a);
        eVar.f(f51416c, o0Var.f51441b);
        eVar.d(d, o0Var.f51442c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f51352a);
        } else {
            bArr = null;
        }
        eVar.d(e, bArr);
    }
}
