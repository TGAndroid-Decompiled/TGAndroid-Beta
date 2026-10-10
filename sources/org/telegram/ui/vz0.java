package org.telegram.ui;
public final class vz0 extends b71 {
    public final ProfileActivity f43067e;

    public vz0(ProfileActivity profileActivity, uz0 uz0Var) {
        super(uz0Var);
        this.f43067e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f43067e.B5 = null;
    }
}
