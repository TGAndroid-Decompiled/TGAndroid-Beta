package org.telegram.ui;
public final class ww0 implements Runnable {
    public final int f39276a;
    public final PremiumPreviewFragment f39277b;

    public ww0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f39276a = i10;
        this.f39277b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f39276a) {
            case 0:
                this.f39277b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f39277b;
                premiumPreviewFragment.f31460a.postOnAnimation(new ww0(premiumPreviewFragment, 0));
                return;
            default:
                this.f39277b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
