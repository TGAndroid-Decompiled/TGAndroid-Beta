package org.telegram.ui;
public final class sv0 implements Runnable {
    public final int f49838a;
    public final tv0 f49839b;

    public sv0(tv0 tv0Var, int i7) {
        this.f49838a = i7;
        this.f49839b = tv0Var;
    }

    @Override
    public final void run() {
        switch (this.f49838a) {
            case 0:
                ProfileActivity profileActivity = this.f49839b.m0;
                hv0 hv0Var = profileActivity.N5;
                if (hv0Var != null) {
                    hv0Var.dismiss();
                    profileActivity.N5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.pj0 currentListView = this.f49839b.f50158g0.N.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
        }
    }
}
