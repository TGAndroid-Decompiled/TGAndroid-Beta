package org.telegram.ui;
public final class sv0 implements Runnable {
    public final int f42771a;
    public final PremiumPreviewFragment f42772b;

    public sv0(PremiumPreviewFragment premiumPreviewFragment, int i9) {
        this.f42771a = i9;
        this.f42772b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f42771a) {
            case 0:
                this.f42772b.i0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f42772b;
                premiumPreviewFragment.f35839a.postOnAnimation(new sv0(premiumPreviewFragment, 0));
                return;
            default:
                this.f42772b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
