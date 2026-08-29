package vd;
public final class h {
    public final e f49519a;
    public final l f49520b = new l(0.0f);
    public final l f49521c = new l(0.0f);
    public final l d = new l(0.0f);
    public final l f49522e = new l(0.0f);
    public final l f49523f = new l(0.0f);
    public final l f49524g = new l(0.0f);

    public h(i iVar, e eVar) {
        this.f49519a = eVar;
    }

    public static void a(h hVar, int i10, boolean z10) {
        l lVar = hVar.f49521c;
        l lVar2 = hVar.f49520b;
        float f9 = 0.0f;
        if (z10) {
            lVar2.f49533c = i10;
            if (i10 > 0) {
                f9 = 1.0f;
            }
            lVar.f49533c = f9;
            return;
        }
        lVar2.d(i10);
        if (i10 > 0) {
            f9 = 1.0f;
        }
        lVar.d(f9);
    }
}
