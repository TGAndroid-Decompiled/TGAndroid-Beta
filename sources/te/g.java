package te;
public final class g {
    public final d f55409a;
    public final k f55410b = new k(0.0f);
    public final k f55411c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k f55412e = new k(0.0f);
    public final k f55413f = new k(0.0f);
    public final k f55414g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f55409a = dVar;
    }

    public static void a(g gVar, int i7, boolean z9) {
        k kVar = gVar.f55411c;
        k kVar2 = gVar.f55410b;
        float f10 = 0.0f;
        if (z9) {
            kVar2.f55423c = i7;
            if (i7 > 0) {
                f10 = 1.0f;
            }
            kVar.f55423c = f10;
            return;
        }
        kVar2.d(i7);
        if (i7 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
