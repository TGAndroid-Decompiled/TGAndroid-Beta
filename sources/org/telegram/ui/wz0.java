package org.telegram.ui;
public final class wz0 extends y61 {
    public final ProfileActivity e;

    public wz0(ProfileActivity profileActivity, vz0 vz0Var) {
        super(vz0Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.B5 = null;
    }
}
