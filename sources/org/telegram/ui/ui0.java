package org.telegram.ui;
public final class ui0 implements Runnable {
    public final int f41993a;
    public final aj0 f41994b;

    public ui0(aj0 aj0Var, int i10) {
        this.f41993a = i10;
        this.f41994b = aj0Var;
    }

    @Override
    public final void run() {
        switch (this.f41993a) {
            case 0:
                this.f41994b.dismiss();
                return;
            case 1:
                this.f41994b.V(true, false);
                return;
            default:
                this.f41994b.V(true, false);
                return;
        }
    }
}
