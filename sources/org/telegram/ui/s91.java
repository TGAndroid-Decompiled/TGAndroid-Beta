package org.telegram.ui;
public final class s91 implements Runnable {
    public final int f41026a;
    public final StickersActivity f41027b;

    public s91(StickersActivity stickersActivity, int i10) {
        this.f41026a = i10;
        this.f41027b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f41026a) {
            case 0:
                this.f41027b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f41027b;
                stickersActivity.f33846r--;
                return;
        }
    }
}
