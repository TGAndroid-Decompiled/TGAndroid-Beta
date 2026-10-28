package org.telegram.ui;
public final class uz0 implements Runnable {
    public final int f44145a;
    public final vz0 f44146b;

    public uz0(vz0 vz0Var, int i10) {
        this.f44145a = i10;
        this.f44146b = vz0Var;
    }

    @Override
    public final void run() {
        switch (this.f44145a) {
            case 0:
                ProfileActivity profileActivity = this.f44146b.f44465s0;
                hz0 hz0Var = profileActivity.H5;
                if (hz0Var != null) {
                    hz0Var.dismiss();
                    profileActivity.H5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.nm0 currentListView = this.f44146b.m0.N.getCurrentListView();
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
