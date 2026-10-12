package org.telegram.ui;
public final class xz0 extends e71 {
    public final ProfileActivity f44214e;

    public xz0(ProfileActivity profileActivity, wz0 wz0Var) {
        super(wz0Var);
        this.f44214e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f44214e.B5 = null;
    }
}
