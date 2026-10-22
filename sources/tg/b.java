package tg;
public final class b implements Runnable {
    public final int f47053a;
    public final f f47054b;
    public final int f47055c;

    public b(f fVar, int i10, int i11) {
        this.f47053a = i11;
        this.f47054b = fVar;
        this.f47055c = i10;
    }

    @Override
    public final void run() {
        switch (this.f47053a) {
            case 0:
                f fVar = this.f47054b;
                fVar.postOnAnimation(new b(fVar, this.f47055c, 1));
                return;
            default:
                f fVar2 = this.f47054b;
                int i10 = this.f47055c;
                if (fVar2.e && !fVar2.f47069r && i10 == fVar2.E) {
                    fVar2.f47072x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
