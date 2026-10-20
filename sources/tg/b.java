package tg;
public final class b implements Runnable {
    public final int f47050a;
    public final f f47051b;
    public final int f47052c;

    public b(f fVar, int i10, int i11) {
        this.f47050a = i11;
        this.f47051b = fVar;
        this.f47052c = i10;
    }

    @Override
    public final void run() {
        switch (this.f47050a) {
            case 0:
                f fVar = this.f47051b;
                fVar.postOnAnimation(new b(fVar, this.f47052c, 1));
                return;
            default:
                f fVar2 = this.f47051b;
                int i10 = this.f47052c;
                if (fVar2.e && !fVar2.f47066r && i10 == fVar2.E) {
                    fVar2.f47069x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
