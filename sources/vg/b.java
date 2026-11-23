package vg;
public final class b implements Runnable {
    public final int f59410a;
    public final f f59411b;
    public final int f59412c;

    public b(f fVar, int i7, int i10) {
        this.f59410a = i10;
        this.f59411b = fVar;
        this.f59412c = i7;
    }

    @Override
    public final void run() {
        switch (this.f59410a) {
            case 0:
                f fVar = this.f59411b;
                fVar.postOnAnimation(new b(fVar, this.f59412c, 1));
                return;
            default:
                f fVar2 = this.f59411b;
                int i7 = this.f59412c;
                if (fVar2.f59424e && !fVar2.f59427r && i7 == fVar2.F) {
                    fVar2.f59431y = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
