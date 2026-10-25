package ug;
public final class b implements Runnable {
    public final int f49755a;
    public final f f49756b;
    public final int f49757c;

    public b(f fVar, int i10, int i11) {
        this.f49755a = i11;
        this.f49756b = fVar;
        this.f49757c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49755a) {
            case 0:
                f fVar = this.f49756b;
                fVar.postOnAnimation(new b(fVar, this.f49757c, 1));
                return;
            default:
                f fVar2 = this.f49756b;
                int i10 = this.f49757c;
                if (fVar2.e && !fVar2.f49771r && i10 == fVar2.E) {
                    fVar2.f49774x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
