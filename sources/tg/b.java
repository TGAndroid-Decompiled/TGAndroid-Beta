package tg;
public final class b implements Runnable {
    public final int f47045a;
    public final f f47046b;
    public final int f47047c;

    public b(f fVar, int i10, int i11) {
        this.f47045a = i11;
        this.f47046b = fVar;
        this.f47047c = i10;
    }

    @Override
    public final void run() {
        switch (this.f47045a) {
            case 0:
                f fVar = this.f47046b;
                fVar.postOnAnimation(new b(fVar, this.f47047c, 1));
                return;
            default:
                f fVar2 = this.f47046b;
                int i10 = this.f47047c;
                if (fVar2.e && !fVar2.f47061r && i10 == fVar2.E) {
                    fVar2.f47064x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
