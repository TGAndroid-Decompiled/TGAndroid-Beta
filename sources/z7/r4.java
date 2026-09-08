package z7;
public final class r4 implements ia.d {
    public static final r4 f51250a = new Object();
    public static final ia.c f51251b = new ia.c("imageFormat", i2.g.n(w.f.k(w.class, new s(1))));
    public static final ia.c f51252c = new ia.c("originalImageSize", i2.g.n(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("compressedImageSize", i2.g.n(w.f.k(w.class, new s(3))));
    public static final ia.c f51253e = new ia.c("isOdmlImage", i2.g.n(w.f.k(w.class, new s(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        ra raVar = (ra) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51251b, raVar.f51258a);
        eVar.a(f51252c, raVar.f51259b);
        eVar.a(d, null);
        eVar.a(f51253e, null);
    }
}
