package td;
public final class g {
    public final d f47788a;
    public final k f47789b = new k(0.0f);
    public final k f47790c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k f47791e = new k(0.0f);
    public final k f47792f = new k(0.0f);
    public final k f47793g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f47788a = dVar;
    }

    public static void a(g gVar, int i9, boolean z10) {
        k kVar = gVar.f47790c;
        k kVar2 = gVar.f47789b;
        float f10 = 0.0f;
        if (z10) {
            kVar2.f47802c = i9;
            if (i9 > 0) {
                f10 = 1.0f;
            }
            kVar.f47802c = f10;
            return;
        }
        kVar2.d(i9);
        if (i9 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
