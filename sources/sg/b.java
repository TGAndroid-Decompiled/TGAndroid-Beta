package sg;
public final class b implements Runnable {
    public final int f48018a;
    public final f f48019b;
    public final int f48020c;

    public b(f fVar, int i10, int i11) {
        this.f48018a = i11;
        this.f48019b = fVar;
        this.f48020c = i10;
    }

    @Override
    public final void run() {
        switch (this.f48018a) {
            case 0:
                f fVar = this.f48019b;
                fVar.postOnAnimation(new b(fVar, this.f48020c, 1));
                return;
            default:
                f fVar2 = this.f48019b;
                int i10 = this.f48020c;
                if (fVar2.f48032e && !fVar2.f48035r && i10 == fVar2.E) {
                    fVar2.f48038x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
