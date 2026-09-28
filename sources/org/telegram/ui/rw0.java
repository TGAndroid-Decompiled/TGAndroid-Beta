package org.telegram.ui;
public final class rw0 extends r61 {
    public final PremiumPreviewFragment e;

    public rw0(PremiumPreviewFragment premiumPreviewFragment, qw0 qw0Var) {
        super(qw0Var);
        this.e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f31465s0 = null;
    }
}
