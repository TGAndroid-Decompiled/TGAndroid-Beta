package org.telegram.ui;
public final class sz0 implements Runnable {
    public final int f43629a;
    public final tz0 f43630b;

    public sz0(tz0 tz0Var, int i10) {
        this.f43629a = i10;
        this.f43630b = tz0Var;
    }

    @Override
    public final void run() {
        switch (this.f43629a) {
            case 0:
                ProfileActivity profileActivity = this.f43630b.f43956s0;
                fz0 fz0Var = profileActivity.H5;
                if (fz0Var != null) {
                    fz0Var.dismiss();
                    profileActivity.H5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.mm0 currentListView = this.f43630b.m0.N.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
        }
    }
}
