package org.telegram.ui;
public final class ww0 implements Runnable {
    public final int f42526a;
    public final PremiumPreviewFragment f42527b;

    public ww0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f42526a = i10;
        this.f42527b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f42526a) {
            case 0:
                this.f42527b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f42527b;
                premiumPreviewFragment.f33798a.postOnAnimation(new ww0(premiumPreviewFragment, 0));
                return;
            default:
                this.f42527b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
