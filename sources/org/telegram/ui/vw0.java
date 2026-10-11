package org.telegram.ui;
public final class vw0 implements Runnable {
    public final int f43144a;
    public final PremiumPreviewFragment f43145b;

    public vw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f43144a = i10;
        this.f43145b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f43144a) {
            case 0:
                this.f43145b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f43145b;
                premiumPreviewFragment.f34153a.postOnAnimation(new vw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f43145b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
