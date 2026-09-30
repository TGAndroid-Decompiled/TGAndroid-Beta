package org.telegram.ui;
public final class zz0 implements Runnable {
    public final int f40610a;
    public final a01 f40611b;

    public zz0(a01 a01Var, int i10) {
        this.f40610a = i10;
        this.f40611b = a01Var;
    }

    @Override
    public final void run() {
        switch (this.f40610a) {
            case 0:
                ProfileActivity profileActivity = this.f40611b.D0;
                mz0 mz0Var = profileActivity.B5;
                if (mz0Var != null) {
                    mz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.yl0 currentListView = this.f40611b.f31938x0.O.getCurrentListView();
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
