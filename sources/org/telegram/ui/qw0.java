package org.telegram.ui;
public final class qw0 implements Runnable {
    public final int f39898a;
    public final PremiumPreviewFragment f39899b;

    public qw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f39898a = i10;
        this.f39899b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f39898a) {
            case 0:
                this.f39899b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f39899b;
                premiumPreviewFragment.f34135a.postOnAnimation(new qw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f39899b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
