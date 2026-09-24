package org.telegram.ui;
public final class zz0 implements Runnable {
    public final int f40594a;
    public final a01 f40595b;

    public zz0(a01 a01Var, int i10) {
        this.f40594a = i10;
        this.f40595b = a01Var;
    }

    @Override
    public final void run() {
        switch (this.f40594a) {
            case 0:
                ProfileActivity profileActivity = this.f40595b.D0;
                mz0 mz0Var = profileActivity.B5;
                if (mz0Var != null) {
                    mz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.wl0 currentListView = this.f40595b.f31922x0.O.getCurrentListView();
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
