package org.telegram.ui;
public final class ww0 implements Runnable {
    public final int f39394a;
    public final PremiumPreviewFragment f39395b;

    public ww0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f39394a = i10;
        this.f39395b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f39394a) {
            case 0:
                this.f39395b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f39395b;
                premiumPreviewFragment.f31152a.postOnAnimation(new ww0(premiumPreviewFragment, 0));
                return;
            default:
                this.f39395b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
