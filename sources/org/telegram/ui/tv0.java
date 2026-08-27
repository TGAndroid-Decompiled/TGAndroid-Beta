package org.telegram.ui;

public final class tv0 implements Runnable {

    public final int f43020a;

    public final PremiumPreviewFragment f43021b;

    public tv0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f43020a = i10;
        this.f43021b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f43020a) {
            case 0:
                this.f43021b.j0();
                break;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f43021b;
                premiumPreviewFragment.f35842a.postOnAnimation(new tv0(premiumPreviewFragment, 0));
                break;
            default:
                this.f43021b.getMediaDataController().loadPremiumPromo(false);
                break;
        }
    }
}
