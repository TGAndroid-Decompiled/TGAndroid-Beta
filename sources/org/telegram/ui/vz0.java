package org.telegram.ui;
public final class vz0 extends a71 {
    public final ProfileActivity e;

    public vz0(ProfileActivity profileActivity, uz0 uz0Var) {
        super(uz0Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.B5 = null;
    }
}
