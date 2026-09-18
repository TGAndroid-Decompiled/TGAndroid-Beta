package org.telegram.ui;
public final class yw0 implements Runnable {
    public final int f40033a;
    public final PremiumPreviewFragment f40034b;

    public yw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f40033a = i10;
        this.f40034b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f40033a) {
            case 0:
                this.f40034b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f40034b;
                premiumPreviewFragment.f31172a.postOnAnimation(new yw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f40034b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
