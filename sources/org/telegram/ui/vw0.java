package org.telegram.ui;
public final class vw0 implements Runnable {
    public final int f43178a;
    public final PremiumPreviewFragment f43179b;

    public vw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f43178a = i10;
        this.f43179b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f43178a) {
            case 0:
                this.f43179b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f43179b;
                premiumPreviewFragment.f34187a.postOnAnimation(new vw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f43179b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
