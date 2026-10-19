package tg;
public final class b implements Runnable {
    public final int f47043a;
    public final f f47044b;
    public final int f47045c;

    public b(f fVar, int i10, int i11) {
        this.f47043a = i11;
        this.f47044b = fVar;
        this.f47045c = i10;
    }

    @Override
    public final void run() {
        switch (this.f47043a) {
            case 0:
                f fVar = this.f47044b;
                fVar.postOnAnimation(new b(fVar, this.f47045c, 1));
                return;
            default:
                f fVar2 = this.f47044b;
                int i10 = this.f47045c;
                if (fVar2.e && !fVar2.f47059r && i10 == fVar2.E) {
                    fVar2.f47062x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
