package sg;
public final class b implements Runnable {
    public final int f48062a;
    public final f f48063b;
    public final int f48064c;

    public b(f fVar, int i10, int i11) {
        this.f48062a = i11;
        this.f48063b = fVar;
        this.f48064c = i10;
    }

    @Override
    public final void run() {
        switch (this.f48062a) {
            case 0:
                f fVar = this.f48063b;
                fVar.postOnAnimation(new b(fVar, this.f48064c, 1));
                return;
            default:
                f fVar2 = this.f48063b;
                int i10 = this.f48064c;
                if (fVar2.f48076e && !fVar2.f48079r && i10 == fVar2.E) {
                    fVar2.f48082x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
