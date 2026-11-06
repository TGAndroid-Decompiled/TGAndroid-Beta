package te;
public final class g {
    public final d f55384a;
    public final k f55385b = new k(0.0f);
    public final k f55386c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k f55387e = new k(0.0f);
    public final k f55388f = new k(0.0f);
    public final k f55389g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f55384a = dVar;
    }

    public static void a(g gVar, int i7, boolean z9) {
        k kVar = gVar.f55386c;
        k kVar2 = gVar.f55385b;
        float f10 = 0.0f;
        if (z9) {
            kVar2.f55398c = i7;
            if (i7 > 0) {
                f10 = 1.0f;
            }
            kVar.f55398c = f10;
            return;
        }
        kVar2.d(i7);
        if (i7 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
