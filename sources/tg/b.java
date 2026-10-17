package tg;
public final class b implements Runnable {
    public final int f47069a;
    public final f f47070b;
    public final int f47071c;

    public b(f fVar, int i10, int i11) {
        this.f47069a = i11;
        this.f47070b = fVar;
        this.f47071c = i10;
    }

    @Override
    public final void run() {
        switch (this.f47069a) {
            case 0:
                f fVar = this.f47070b;
                fVar.postOnAnimation(new b(fVar, this.f47071c, 1));
                return;
            default:
                f fVar2 = this.f47070b;
                int i10 = this.f47071c;
                if (fVar2.e && !fVar2.f47085r && i10 == fVar2.E) {
                    fVar2.f47088x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
