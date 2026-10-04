package org.telegram.ui;
public final class qw0 implements Runnable {
    public final int f39831a;
    public final PremiumPreviewFragment f39832b;

    public qw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f39831a = i10;
        this.f39832b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f39831a) {
            case 0:
                this.f39832b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f39832b;
                premiumPreviewFragment.f34115a.postOnAnimation(new qw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f39832b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
