package sg;
public final class b implements Runnable {
    public final int f48249a;
    public final f f48250b;
    public final int f48251c;

    public b(f fVar, int i10, int i11) {
        this.f48249a = i11;
        this.f48250b = fVar;
        this.f48251c = i10;
    }

    @Override
    public final void run() {
        switch (this.f48249a) {
            case 0:
                f fVar = this.f48250b;
                fVar.postOnAnimation(new b(fVar, this.f48251c, 1));
                return;
            default:
                f fVar2 = this.f48250b;
                int i10 = this.f48251c;
                if (fVar2.f48263e && !fVar2.f48266r && i10 == fVar2.E) {
                    fVar2.f48269x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
