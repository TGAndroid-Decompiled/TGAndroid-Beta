package z7;
public final class r4 implements ia.d {
    public static final r4 f54117a = new Object();
    public static final ia.c f54118b = new ia.c("imageFormat", hg.c.m(sc.v.o(w.class, new s(1))));
    public static final ia.c f54119c = new ia.c("originalImageSize", hg.c.m(sc.v.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("compressedImageSize", hg.c.m(sc.v.o(w.class, new s(3))));
    public static final ia.c f54120e = new ia.c("isOdmlImage", hg.c.m(sc.v.o(w.class, new s(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        ra raVar = (ra) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54118b, raVar.f54125a);
        eVar.a(f54119c, raVar.f54126b);
        eVar.a(d, null);
        eVar.a(f54120e, null);
    }
}
