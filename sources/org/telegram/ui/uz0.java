package org.telegram.ui;
public final class uz0 extends a71 {
    public final ProfileActivity f42809e;

    public uz0(ProfileActivity profileActivity, tz0 tz0Var) {
        super(tz0Var);
        this.f42809e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f42809e.B5 = null;
    }
}
