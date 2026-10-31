package org.telegram.ui;
public final class wy0 implements Runnable {
    public final int f43397a;
    public final zy0 f43398b;
    public final int f43399c;

    public wy0(zy0 zy0Var, int i10, int i11) {
        this.f43397a = i11;
        this.f43398b = zy0Var;
        this.f43399c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43397a) {
            case 0:
                zy0 zy0Var = this.f43398b;
                org.telegram.ui.Components.v71 v71Var = zy0Var.f44254b;
                yy0 yy0Var = zy0Var.d;
                int i10 = this.f43399c;
                v71Var.d(i10, yy0Var.i(i10));
                return;
            default:
                zy0 zy0Var2 = this.f43398b;
                org.telegram.ui.Components.v71 v71Var2 = zy0Var2.f44254b;
                yy0 yy0Var2 = zy0Var2.d;
                int i11 = this.f43399c;
                v71Var2.d(i11, yy0Var2.i(i11));
                return;
        }
    }
}
