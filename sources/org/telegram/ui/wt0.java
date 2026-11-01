package org.telegram.ui;
public final class wt0 extends x21 {
    public final PremiumPreviewFragment e;

    public wt0(PremiumPreviewFragment premiumPreviewFragment, vt0 vt0Var) {
        super(vt0Var);
        this.e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f33722u0 = null;
    }
}
