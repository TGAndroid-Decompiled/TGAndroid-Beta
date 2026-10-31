package z9;
public final class l implements ja.d {
    public static final l f55333a = new Object();
    public static final ja.c f55334b = ja.c.c("baseAddress");
    public static final ja.c f55335c = ja.c.c("size");
    public static final ja.c d = ja.c.c("name");
    public static final ja.c e = ja.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ja.e eVar = (ja.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f55334b, o0Var.f55359a);
        eVar.f(f55335c, o0Var.f55360b);
        eVar.d(d, o0Var.f55361c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f55271a);
        } else {
            bArr = null;
        }
        eVar.d(e, bArr);
    }
}
