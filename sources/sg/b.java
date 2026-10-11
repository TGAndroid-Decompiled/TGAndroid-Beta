package sg;
public final class b implements Runnable {
    public final int f48108a;
    public final f f48109b;
    public final int f48110c;

    public b(f fVar, int i10, int i11) {
        this.f48108a = i11;
        this.f48109b = fVar;
        this.f48110c = i10;
    }

    @Override
    public final void run() {
        switch (this.f48108a) {
            case 0:
                f fVar = this.f48109b;
                fVar.postOnAnimation(new b(fVar, this.f48110c, 1));
                return;
            default:
                f fVar2 = this.f48109b;
                int i10 = this.f48110c;
                if (fVar2.f48122e && !fVar2.f48125r && i10 == fVar2.E) {
                    fVar2.f48128x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
