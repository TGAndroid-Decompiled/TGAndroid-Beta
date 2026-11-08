package org.telegram.ui;
public final class sv0 implements Runnable {
    public final int f49829a;
    public final tv0 f49830b;

    public sv0(tv0 tv0Var, int i7) {
        this.f49829a = i7;
        this.f49830b = tv0Var;
    }

    @Override
    public final void run() {
        switch (this.f49829a) {
            case 0:
                ProfileActivity profileActivity = this.f49830b.m0;
                hv0 hv0Var = profileActivity.N5;
                if (hv0Var != null) {
                    hv0Var.dismiss();
                    profileActivity.N5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.pj0 currentListView = this.f49830b.f50150g0.N.getCurrentListView();
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
