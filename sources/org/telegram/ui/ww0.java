package org.telegram.ui;
public final class ww0 implements Runnable {
    public final int f43806a;
    public final PremiumPreviewFragment f43807b;

    public ww0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f43806a = i10;
        this.f43807b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f43806a) {
            case 0:
                this.f43807b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f43807b;
                premiumPreviewFragment.f34163a.postOnAnimation(new ww0(premiumPreviewFragment, 0));
                return;
            default:
                this.f43807b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
