package te;
public final class g {
    public final d f55500a;
    public final k f55501b = new k(0.0f);
    public final k f55502c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k f55503e = new k(0.0f);
    public final k f55504f = new k(0.0f);
    public final k f55505g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f55500a = dVar;
    }

    public static void a(g gVar, int i7, boolean z9) {
        k kVar = gVar.f55502c;
        k kVar2 = gVar.f55501b;
        float f10 = 0.0f;
        if (z9) {
            kVar2.f55514c = i7;
            if (i7 > 0) {
                f10 = 1.0f;
            }
            kVar.f55514c = f10;
            return;
        }
        kVar2.d(i7);
        if (i7 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
