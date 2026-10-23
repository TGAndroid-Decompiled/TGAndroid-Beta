package tg;
public final class b implements Runnable {
    public final int f47054a;
    public final f f47055b;
    public final int f47056c;

    public b(f fVar, int i10, int i11) {
        this.f47054a = i11;
        this.f47055b = fVar;
        this.f47056c = i10;
    }

    @Override
    public final void run() {
        switch (this.f47054a) {
            case 0:
                f fVar = this.f47055b;
                fVar.postOnAnimation(new b(fVar, this.f47056c, 1));
                return;
            default:
                f fVar2 = this.f47055b;
                int i10 = this.f47056c;
                if (fVar2.e && !fVar2.f47070r && i10 == fVar2.E) {
                    fVar2.f47073x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
