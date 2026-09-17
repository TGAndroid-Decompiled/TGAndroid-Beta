package org.telegram.ui;
public final class yw0 implements Runnable {
    public final int f40028a;
    public final PremiumPreviewFragment f40029b;

    public yw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f40028a = i10;
        this.f40029b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f40028a) {
            case 0:
                this.f40029b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f40029b;
                premiumPreviewFragment.f31168a.postOnAnimation(new yw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f40029b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
