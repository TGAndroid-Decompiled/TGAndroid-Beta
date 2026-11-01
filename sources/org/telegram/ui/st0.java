package org.telegram.ui;
public final class st0 implements Runnable {
    public final int f41459a;
    public final PremiumPreviewFragment f41460b;

    public st0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f41459a = i10;
        this.f41460b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f41459a) {
            case 0:
                this.f41460b.o0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f41460b;
                premiumPreviewFragment.f33696a.postOnAnimation(new st0(premiumPreviewFragment, 0));
                return;
            default:
                this.f41460b.getMediaDataController().R0(false);
                return;
        }
    }
}
