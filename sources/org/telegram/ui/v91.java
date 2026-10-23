package org.telegram.ui;
public final class v91 implements Runnable {
    public final int f42670a;
    public final StickersActivity f42671b;

    public v91(StickersActivity stickersActivity, int i10) {
        this.f42670a = i10;
        this.f42671b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f42670a) {
            case 0:
                this.f42671b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f42671b;
                stickersActivity.f34162r--;
                return;
        }
    }
}
