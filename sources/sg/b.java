package sg;
public final class b implements Runnable {
    public final int f48016a;
    public final f f48017b;
    public final int f48018c;

    public b(f fVar, int i10, int i11) {
        this.f48016a = i11;
        this.f48017b = fVar;
        this.f48018c = i10;
    }

    @Override
    public final void run() {
        switch (this.f48016a) {
            case 0:
                f fVar = this.f48017b;
                fVar.postOnAnimation(new b(fVar, this.f48018c, 1));
                return;
            default:
                f fVar2 = this.f48017b;
                int i10 = this.f48018c;
                if (fVar2.f48030e && !fVar2.f48033r && i10 == fVar2.E) {
                    fVar2.f48036x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
