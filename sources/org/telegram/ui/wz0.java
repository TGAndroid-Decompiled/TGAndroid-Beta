package org.telegram.ui;
public final class wz0 extends a71 {
    public final ProfileActivity f42547e;

    public wz0(ProfileActivity profileActivity, vz0 vz0Var) {
        super(vz0Var);
        this.f42547e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f42547e.B5 = null;
    }
}
