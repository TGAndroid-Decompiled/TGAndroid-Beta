package org.telegram.ui;
public final class ww0 implements Runnable {
    public final int f43762a;
    public final PremiumPreviewFragment f43763b;

    public ww0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f43762a = i10;
        this.f43763b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f43762a) {
            case 0:
                this.f43763b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f43763b;
                premiumPreviewFragment.f34125a.postOnAnimation(new ww0(premiumPreviewFragment, 0));
                return;
            default:
                this.f43763b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
