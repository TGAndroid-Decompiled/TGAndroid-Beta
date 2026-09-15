package org.telegram.ui;
public final class ww0 implements Runnable {
    public final int f39398a;
    public final PremiumPreviewFragment f39399b;

    public ww0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f39398a = i10;
        this.f39399b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f39398a) {
            case 0:
                this.f39399b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f39399b;
                premiumPreviewFragment.f31154a.postOnAnimation(new ww0(premiumPreviewFragment, 0));
                return;
            default:
                this.f39399b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
