package org.telegram.ui;

public final class r91 implements Runnable {

    public final int f41877a;

    public final StickersActivity f41878b;

    public r91(StickersActivity stickersActivity, int i10) {
        this.f41877a = i10;
        this.f41878b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f41877a) {
            case 0:
                this.f41878b.m0();
                break;
            default:
                this.f41878b.f36195r--;
                break;
        }
    }
}
