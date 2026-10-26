package org.telegram.ui;
public final class sz0 implements Runnable {
    public final int f43632a;
    public final tz0 f43633b;

    public sz0(tz0 tz0Var, int i10) {
        this.f43632a = i10;
        this.f43633b = tz0Var;
    }

    @Override
    public final void run() {
        switch (this.f43632a) {
            case 0:
                ProfileActivity profileActivity = this.f43633b.f43959s0;
                fz0 fz0Var = profileActivity.H5;
                if (fz0Var != null) {
                    fz0Var.dismiss();
                    profileActivity.H5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.mm0 currentListView = this.f43633b.m0.N.getCurrentListView();
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
