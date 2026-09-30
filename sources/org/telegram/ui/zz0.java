package org.telegram.ui;
public final class zz0 implements Runnable {
    public final int f40707a;
    public final a01 f40708b;

    public zz0(a01 a01Var, int i10) {
        this.f40707a = i10;
        this.f40708b = a01Var;
    }

    @Override
    public final void run() {
        switch (this.f40707a) {
            case 0:
                ProfileActivity profileActivity = this.f40708b.D0;
                mz0 mz0Var = profileActivity.B5;
                if (mz0Var != null) {
                    mz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.zl0 currentListView = this.f40708b.f32010x0.O.getCurrentListView();
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
