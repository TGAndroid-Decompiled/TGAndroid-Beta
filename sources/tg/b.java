package tg;
public final class b implements Runnable {
    public final int f45682a;
    public final f f45683b;
    public final int f45684c;

    public b(f fVar, int i10, int i11) {
        this.f45682a = i11;
        this.f45683b = fVar;
        this.f45684c = i10;
    }

    @Override
    public final void run() {
        switch (this.f45682a) {
            case 0:
                f fVar = this.f45683b;
                fVar.postOnAnimation(new b(fVar, this.f45684c, 1));
                return;
            default:
                f fVar2 = this.f45683b;
                int i10 = this.f45684c;
                if (fVar2.e && !fVar2.f45698r && i10 == fVar2.E) {
                    fVar2.f45701x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
