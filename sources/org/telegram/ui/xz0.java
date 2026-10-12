package org.telegram.ui;
public final class xz0 extends e71 {
    public final ProfileActivity f44219e;

    public xz0(ProfileActivity profileActivity, wz0 wz0Var) {
        super(wz0Var);
        this.f44219e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f44219e.B5 = null;
    }
}
