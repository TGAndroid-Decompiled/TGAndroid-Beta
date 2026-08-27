package rh;

public final class j2 implements Runnable {

    public final int f47220a;

    public final p3 f47221b;

    public final int f47222c;
    public final int d;

    public j2(p3 p3Var, int i10, int i11, int i12) {
        this.f47220a = i12;
        this.f47221b = p3Var;
        this.f47222c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f47220a) {
            case 0:
                this.f47221b.Y1(this.f47222c, this.d);
                break;
            default:
                this.f47221b.g4(this.f47222c, this.d);
                break;
        }
    }
}
