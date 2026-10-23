package tg;
public final class b implements Runnable {
    public final int f47489a;
    public final f f47490b;
    public final int f47491c;

    public b(f fVar, int i10, int i11) {
        this.f47489a = i11;
        this.f47490b = fVar;
        this.f47491c = i10;
    }

    @Override
    public final void run() {
        switch (this.f47489a) {
            case 0:
                f fVar = this.f47490b;
                fVar.postOnAnimation(new b(fVar, this.f47491c, 1));
                return;
            default:
                f fVar2 = this.f47490b;
                int i10 = this.f47491c;
                if (fVar2.e && !fVar2.f47505r && i10 == fVar2.E) {
                    fVar2.f47508x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
