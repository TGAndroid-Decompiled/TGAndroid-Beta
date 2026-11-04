package org.telegram.ui;
public final class zr0 implements Runnable {
    public final int f52743a;
    public final PremiumPreviewFragment f52744b;

    public zr0(PremiumPreviewFragment premiumPreviewFragment, int i3) {
        this.f52743a = i3;
        this.f52744b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f52743a) {
            case 0:
                this.f52744b.o0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f52744b;
                premiumPreviewFragment.f41632a.postOnAnimation(new zr0(premiumPreviewFragment, 0));
                return;
            default:
                this.f52744b.getMediaDataController().R0(false);
                return;
        }
    }
}
