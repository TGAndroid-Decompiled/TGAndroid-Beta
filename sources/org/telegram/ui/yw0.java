package org.telegram.ui;
public final class yw0 implements Runnable {
    public final int f39119a;
    public final PremiumPreviewFragment f39120b;

    public yw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f39119a = i10;
        this.f39120b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f39119a) {
            case 0:
                this.f39120b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f39120b;
                premiumPreviewFragment.f30267a.postOnAnimation(new yw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f39120b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
