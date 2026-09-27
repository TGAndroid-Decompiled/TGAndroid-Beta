package org.telegram.ui;
public final class qw0 implements Runnable {
    public final int f36916a;
    public final PremiumPreviewFragment f36917b;

    public qw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f36916a = i10;
        this.f36917b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f36916a) {
            case 0:
                this.f36917b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f36917b;
                premiumPreviewFragment.f31443a.postOnAnimation(new qw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f36917b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
