package org.telegram.ui;
public final class yw0 implements Runnable {
    public final int f44567a;
    public final PremiumPreviewFragment f44568b;

    public yw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f44567a = i10;
        this.f44568b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f44567a) {
            case 0:
                this.f44568b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f44568b;
                premiumPreviewFragment.f33964a.postOnAnimation(new yw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f44568b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
