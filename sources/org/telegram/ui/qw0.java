package org.telegram.ui;
public final class qw0 implements Runnable {
    public final int f39832a;
    public final PremiumPreviewFragment f39833b;

    public qw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f39832a = i10;
        this.f39833b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f39832a) {
            case 0:
                this.f39833b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f39833b;
                premiumPreviewFragment.f34116a.postOnAnimation(new qw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f39833b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
