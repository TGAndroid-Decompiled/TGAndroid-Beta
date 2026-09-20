package org.telegram.ui;
public final class ww0 implements Runnable {
    public final int f39252a;
    public final PremiumPreviewFragment f39253b;

    public ww0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f39252a = i10;
        this.f39253b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f39252a) {
            case 0:
                this.f39253b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f39253b;
                premiumPreviewFragment.f31439a.postOnAnimation(new ww0(premiumPreviewFragment, 0));
                return;
            default:
                this.f39253b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
