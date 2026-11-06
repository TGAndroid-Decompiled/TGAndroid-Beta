package te;
public final class g {
    public final d f55408a;
    public final k f55409b = new k(0.0f);
    public final k f55410c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k f55411e = new k(0.0f);
    public final k f55412f = new k(0.0f);
    public final k f55413g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f55408a = dVar;
    }

    public static void a(g gVar, int i7, boolean z9) {
        k kVar = gVar.f55410c;
        k kVar2 = gVar.f55409b;
        float f10 = 0.0f;
        if (z9) {
            kVar2.f55422c = i7;
            if (i7 > 0) {
                f10 = 1.0f;
            }
            kVar.f55422c = f10;
            return;
        }
        kVar2.d(i7);
        if (i7 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
