package org.telegram.ui;
public final class ww0 implements Runnable {
    public final int f39262a;
    public final PremiumPreviewFragment f39263b;

    public ww0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f39262a = i10;
        this.f39263b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f39262a) {
            case 0:
                this.f39263b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f39263b;
                premiumPreviewFragment.f31399a.postOnAnimation(new ww0(premiumPreviewFragment, 0));
                return;
            default:
                this.f39263b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
