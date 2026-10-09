package org.telegram.ui;
public final class vz0 extends b71 {
    public final ProfileActivity f43023e;

    public vz0(ProfileActivity profileActivity, uz0 uz0Var) {
        super(uz0Var);
        this.f43023e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f43023e.B5 = null;
    }
}
