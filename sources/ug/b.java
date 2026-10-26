package ug;
public final class b implements Runnable {
    public final int f49758a;
    public final f f49759b;
    public final int f49760c;

    public b(f fVar, int i10, int i11) {
        this.f49758a = i11;
        this.f49759b = fVar;
        this.f49760c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49758a) {
            case 0:
                f fVar = this.f49759b;
                fVar.postOnAnimation(new b(fVar, this.f49760c, 1));
                return;
            default:
                f fVar2 = this.f49759b;
                int i10 = this.f49760c;
                if (fVar2.e && !fVar2.f49774r && i10 == fVar2.E) {
                    fVar2.f49777x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
