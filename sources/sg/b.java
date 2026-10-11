package sg;
public final class b implements Runnable {
    public final int f48142a;
    public final f f48143b;
    public final int f48144c;

    public b(f fVar, int i10, int i11) {
        this.f48142a = i11;
        this.f48143b = fVar;
        this.f48144c = i10;
    }

    @Override
    public final void run() {
        switch (this.f48142a) {
            case 0:
                f fVar = this.f48143b;
                fVar.postOnAnimation(new b(fVar, this.f48144c, 1));
                return;
            default:
                f fVar2 = this.f48143b;
                int i10 = this.f48144c;
                if (fVar2.f48156e && !fVar2.f48159r && i10 == fVar2.E) {
                    fVar2.f48162x = true;
                    fVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
