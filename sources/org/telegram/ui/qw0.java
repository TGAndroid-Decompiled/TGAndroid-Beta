package org.telegram.ui;
public final class qw0 implements Runnable {
    public final int f39837a;
    public final PremiumPreviewFragment f39838b;

    public qw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f39837a = i10;
        this.f39838b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f39837a) {
            case 0:
                this.f39838b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f39838b;
                premiumPreviewFragment.f34122a.postOnAnimation(new qw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f39838b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
