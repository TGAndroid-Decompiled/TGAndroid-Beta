package org.telegram.ui;
public final class ww0 implements Runnable {
    public final int f42498a;
    public final PremiumPreviewFragment f42499b;

    public ww0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f42498a = i10;
        this.f42499b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f42498a) {
            case 0:
                this.f42499b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f42499b;
                premiumPreviewFragment.f33770a.postOnAnimation(new ww0(premiumPreviewFragment, 0));
                return;
            default:
                this.f42499b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
