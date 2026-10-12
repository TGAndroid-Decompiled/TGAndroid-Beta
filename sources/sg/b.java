package sg;
public final class b implements Runnable {
    public final int f48257a;
    public final f f48258b;
    public final int f48259c;

    public b(f fVar, int i10, int i11) {
        this.f48257a = i11;
        this.f48258b = fVar;
        this.f48259c = i10;
    }

    @Override
    public final void run() {
        switch (this.f48257a) {
            case 0:
                f fVar = this.f48258b;
                fVar.postOnAnimation(new b(fVar, this.f48259c, 1));
                return;
            default:
                f fVar2 = this.f48258b;
                int i10 = this.f48259c;
                if (fVar2.f48271e && !fVar2.f48274r && i10 == fVar2.E) {
                    fVar2.f48277x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
