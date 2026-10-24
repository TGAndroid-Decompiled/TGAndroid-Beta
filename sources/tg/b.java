package tg;
public final class b implements Runnable {
    public final int f47488a;
    public final f f47489b;
    public final int f47490c;

    public b(f fVar, int i10, int i11) {
        this.f47488a = i11;
        this.f47489b = fVar;
        this.f47490c = i10;
    }

    @Override
    public final void run() {
        switch (this.f47488a) {
            case 0:
                f fVar = this.f47489b;
                fVar.postOnAnimation(new b(fVar, this.f47490c, 1));
                return;
            default:
                f fVar2 = this.f47489b;
                int i10 = this.f47490c;
                if (fVar2.e && !fVar2.f47504r && i10 == fVar2.E) {
                    fVar2.f47507x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
