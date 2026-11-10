package org.telegram.ui;
public final class qs0 extends k11 {
    public final PremiumPreviewFragment f49146e;

    public qs0(PremiumPreviewFragment premiumPreviewFragment, ps0 ps0Var) {
        super(ps0Var);
        this.f49146e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f49146e.f41630u0 = null;
    }
}
