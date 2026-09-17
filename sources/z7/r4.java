package z7;
public final class r4 implements ia.d {
    public static final r4 f48616a = new Object();
    public static final ia.c f48617b = new ia.c("imageFormat", hg.k0.o(w.f.k(w.class, new s(1))));
    public static final ia.c f48618c = new ia.c("originalImageSize", hg.k0.o(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("compressedImageSize", hg.k0.o(w.f.k(w.class, new s(3))));
    public static final ia.c e = new ia.c("isOdmlImage", hg.k0.o(w.f.k(w.class, new s(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        ra raVar = (ra) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48617b, raVar.f48623a);
        eVar.a(f48618c, raVar.f48624b);
        eVar.a(d, null);
        eVar.a(e, null);
    }
}
