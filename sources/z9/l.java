package z9;
public final class l implements ja.d {
    public static final l f51425a = new Object();
    public static final ja.c f51426b = ja.c.c("baseAddress");
    public static final ja.c f51427c = ja.c.c("size");
    public static final ja.c d = ja.c.c("name");
    public static final ja.c e = ja.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ja.e eVar = (ja.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f51426b, o0Var.f51451a);
        eVar.f(f51427c, o0Var.f51452b);
        eVar.d(d, o0Var.f51453c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f51363a);
        } else {
            bArr = null;
        }
        eVar.d(e, bArr);
    }
}
