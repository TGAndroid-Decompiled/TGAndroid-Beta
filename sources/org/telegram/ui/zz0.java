package org.telegram.ui;
public final class zz0 implements Runnable {
    public final int f40608a;
    public final a01 f40609b;

    public zz0(a01 a01Var, int i10) {
        this.f40608a = i10;
        this.f40609b = a01Var;
    }

    @Override
    public final void run() {
        switch (this.f40608a) {
            case 0:
                ProfileActivity profileActivity = this.f40609b.D0;
                mz0 mz0Var = profileActivity.B5;
                if (mz0Var != null) {
                    mz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.wl0 currentListView = this.f40609b.f31936x0.O.getCurrentListView();
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
