package org.telegram.ui;
public final class vd1 implements Runnable {
    public final int f42739a;
    public final ye1 f42740b;

    public vd1(ye1 ye1Var, int i10) {
        this.f42739a = i10;
        this.f42740b = ye1Var;
    }

    @Override
    public final void run() {
        switch (this.f42739a) {
            case 0:
                ye1 ye1Var = this.f42740b;
                ye1Var.w0();
                ye1Var.A0();
                return;
            case 1:
                this.f42740b.w0();
                return;
            case 2:
                this.f42740b.N0(true);
                return;
            case 3:
                this.f42740b.finishPreviewFragment();
                return;
            case 4:
                ye1 ye1Var2 = this.f42740b;
                ye1Var2.A0 = null;
                ye1Var2.U0(true, false);
                return;
            default:
                ye1 ye1Var3 = this.f42740b;
                ye1Var3.N.postOnAnimation(new vd1(ye1Var3, 1));
                return;
        }
    }
}
