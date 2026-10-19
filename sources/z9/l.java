package z9;
public final class l implements ja.d {
    public static final l f51416a = new Object();
    public static final ja.c f51417b = ja.c.c("baseAddress");
    public static final ja.c f51418c = ja.c.c("size");
    public static final ja.c d = ja.c.c("name");
    public static final ja.c e = ja.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ja.e eVar = (ja.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f51417b, o0Var.f51442a);
        eVar.f(f51418c, o0Var.f51443b);
        eVar.d(d, o0Var.f51444c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f51354a);
        } else {
            bArr = null;
        }
        eVar.d(e, bArr);
    }
}
