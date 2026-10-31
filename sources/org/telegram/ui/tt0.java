package org.telegram.ui;
public final class tt0 implements Runnable {
    public final int f41939a;
    public final PremiumPreviewFragment f41940b;

    public tt0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f41939a = i10;
        this.f41940b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f41939a) {
            case 0:
                this.f41940b.n0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f41940b;
                premiumPreviewFragment.f33689a.postOnAnimation(new tt0(premiumPreviewFragment, 0));
                return;
            default:
                this.f41940b.getMediaDataController().R0(false);
                return;
        }
    }
}
