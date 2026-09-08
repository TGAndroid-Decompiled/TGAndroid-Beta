package org.telegram.ui;
public final class ww0 implements Runnable {
    public final int f42525a;
    public final PremiumPreviewFragment f42526b;

    public ww0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f42525a = i10;
        this.f42526b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f42525a) {
            case 0:
                this.f42526b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f42526b;
                premiumPreviewFragment.f33797a.postOnAnimation(new ww0(premiumPreviewFragment, 0));
                return;
            default:
                this.f42526b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
