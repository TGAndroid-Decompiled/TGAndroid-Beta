package org.telegram.ui;
public final class ww0 implements Runnable {
    public final int f43760a;
    public final PremiumPreviewFragment f43761b;

    public ww0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f43760a = i10;
        this.f43761b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f43760a) {
            case 0:
                this.f43761b.k0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f43761b;
                premiumPreviewFragment.f34125a.postOnAnimation(new ww0(premiumPreviewFragment, 0));
                return;
            default:
                this.f43761b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
