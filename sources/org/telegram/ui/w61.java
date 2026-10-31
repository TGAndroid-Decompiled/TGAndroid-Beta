package org.telegram.ui;
public final class w61 implements Runnable {
    public final int f42888a;
    public final StickersActivity f42889b;

    public w61(StickersActivity stickersActivity, int i10) {
        this.f42888a = i10;
        this.f42889b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f42888a) {
            case 0:
                this.f42889b.q0();
                return;
            default:
                StickersActivity stickersActivity = this.f42889b;
                stickersActivity.f34050n--;
                return;
        }
    }
}
