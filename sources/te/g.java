package te;
public final class g {
    public final d f57714a;
    public final k f57715b = new k(0.0f);
    public final k f57716c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k f57717e = new k(0.0f);
    public final k f57718f = new k(0.0f);
    public final k f57719g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f57714a = dVar;
    }

    public static void a(g gVar, int i7, boolean z10) {
        k kVar = gVar.f57716c;
        k kVar2 = gVar.f57715b;
        float f10 = 0.0f;
        if (z10) {
            kVar2.f57728c = i7;
            if (i7 > 0) {
                f10 = 1.0f;
            }
            kVar.f57728c = f10;
            return;
        }
        kVar2.d(i7);
        if (i7 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
