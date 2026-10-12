package org.telegram.ui;
public final class yw0 implements Runnable {
    public final int f44562a;
    public final PremiumPreviewFragment f44563b;

    public yw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f44562a = i10;
        this.f44563b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f44562a) {
            case 0:
                this.f44563b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f44563b;
                premiumPreviewFragment.f33962a.postOnAnimation(new yw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f44563b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
