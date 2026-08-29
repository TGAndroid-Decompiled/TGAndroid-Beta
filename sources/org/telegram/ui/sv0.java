package org.telegram.ui;
public final class sv0 implements Runnable {
    public final int f42471a;
    public final PremiumPreviewFragment f42472b;

    public sv0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f42471a = i10;
        this.f42472b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f42471a) {
            case 0:
                this.f42472b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f42472b;
                premiumPreviewFragment.f35905a.postOnAnimation(new sv0(premiumPreviewFragment, 0));
                return;
            default:
                this.f42472b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
