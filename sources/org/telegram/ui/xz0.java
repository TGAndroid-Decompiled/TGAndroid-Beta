package org.telegram.ui;
public final class xz0 extends z61 {
    public final ProfileActivity e;

    public xz0(ProfileActivity profileActivity, wz0 wz0Var) {
        super(wz0Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.B5 = null;
    }
}
