package org.telegram.ui;
public final class t91 implements Runnable {
    public final int f42932a;
    public final StickersActivity f42933b;

    public t91(StickersActivity stickersActivity, int i9) {
        this.f42932a = i9;
        this.f42933b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f42932a) {
            case 0:
                this.f42933b.l0();
                return;
            default:
                StickersActivity stickersActivity = this.f42933b;
                stickersActivity.f36192r--;
                return;
        }
    }
}
