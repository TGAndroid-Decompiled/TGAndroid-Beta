package tg;
public final class b implements Runnable {
    public final int f47091a;
    public final f f47092b;
    public final int f47093c;

    public b(f fVar, int i10, int i11) {
        this.f47091a = i11;
        this.f47092b = fVar;
        this.f47093c = i10;
    }

    @Override
    public final void run() {
        switch (this.f47091a) {
            case 0:
                f fVar = this.f47092b;
                fVar.postOnAnimation(new b(fVar, this.f47093c, 1));
                return;
            default:
                f fVar2 = this.f47092b;
                int i10 = this.f47093c;
                if (fVar2.e && !fVar2.f47107r && i10 == fVar2.E) {
                    fVar2.f47110x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
