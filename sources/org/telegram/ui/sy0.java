package org.telegram.ui;
public final class sy0 extends u51 {
    public final ProfileActivity f42481e;

    public sy0(ProfileActivity profileActivity, ry0 ry0Var) {
        super(ry0Var);
        this.f42481e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f42481e.f36147x5 = null;
    }
}
