package te;
public final class g {
    public final d f57099a;
    public final k f57100b = new k(0.0f);
    public final k f57101c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k f57102e = new k(0.0f);
    public final k f57103f = new k(0.0f);
    public final k f57104g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f57099a = dVar;
    }

    public static void a(g gVar, int i7, boolean z10) {
        k kVar = gVar.f57101c;
        k kVar2 = gVar.f57100b;
        float f10 = 0.0f;
        if (z10) {
            kVar2.f57113c = i7;
            if (i7 > 0) {
                f10 = 1.0f;
            }
            kVar.f57113c = f10;
            return;
        }
        kVar2.d(i7);
        if (i7 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
