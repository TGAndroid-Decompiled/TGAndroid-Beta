package tg;
public final class b implements Runnable {
    public final int f47041a;
    public final f f47042b;
    public final int f47043c;

    public b(f fVar, int i10, int i11) {
        this.f47041a = i11;
        this.f47042b = fVar;
        this.f47043c = i10;
    }

    @Override
    public final void run() {
        switch (this.f47041a) {
            case 0:
                f fVar = this.f47042b;
                fVar.postOnAnimation(new b(fVar, this.f47043c, 1));
                return;
            default:
                f fVar2 = this.f47042b;
                int i10 = this.f47043c;
                if (fVar2.e && !fVar2.f47057r && i10 == fVar2.E) {
                    fVar2.f47060x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
