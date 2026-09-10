package vh;
public final class f implements Runnable {
    public final int f43370a;
    public final p f43371b;

    public f(p pVar, int i10) {
        this.f43370a = i10;
        this.f43371b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f43370a) {
            case 0:
                this.f43371b.e();
                return;
            case 1:
                p.k(this.f43371b.f43411q, true, true);
                return;
            default:
                this.f43371b.e();
                return;
        }
    }
}
