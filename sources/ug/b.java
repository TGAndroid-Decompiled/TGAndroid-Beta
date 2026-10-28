package ug;
public final class b implements Runnable {
    public final int f49793a;
    public final f f49794b;
    public final int f49795c;

    public b(f fVar, int i10, int i11) {
        this.f49793a = i11;
        this.f49794b = fVar;
        this.f49795c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49793a) {
            case 0:
                f fVar = this.f49794b;
                fVar.postOnAnimation(new b(fVar, this.f49795c, 1));
                return;
            default:
                f fVar2 = this.f49794b;
                int i10 = this.f49795c;
                if (fVar2.e && !fVar2.f49809r && i10 == fVar2.E) {
                    fVar2.f49812x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
