package z9;
public final class l implements ja.d {
    public static final l f51885a = new Object();
    public static final ja.c f51886b = ja.c.c("baseAddress");
    public static final ja.c f51887c = ja.c.c("size");
    public static final ja.c d = ja.c.c("name");
    public static final ja.c e = ja.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ja.e eVar = (ja.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f51886b, o0Var.f51911a);
        eVar.f(f51887c, o0Var.f51912b);
        eVar.d(d, o0Var.f51913c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f51823a);
        } else {
            bArr = null;
        }
        eVar.d(e, bArr);
    }
}
