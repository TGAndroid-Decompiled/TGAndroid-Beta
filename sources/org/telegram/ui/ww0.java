package org.telegram.ui;
public final class ww0 implements Runnable {
    public final int f42499a;
    public final PremiumPreviewFragment f42500b;

    public ww0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f42499a = i10;
        this.f42500b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f42499a) {
            case 0:
                this.f42500b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f42500b;
                premiumPreviewFragment.f33771a.postOnAnimation(new ww0(premiumPreviewFragment, 0));
                return;
            default:
                this.f42500b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
