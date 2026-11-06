package org.telegram.ui;
public final class sv0 implements Runnable {
    public final int f49811a;
    public final tv0 f49812b;

    public sv0(tv0 tv0Var, int i7) {
        this.f49811a = i7;
        this.f49812b = tv0Var;
    }

    @Override
    public final void run() {
        switch (this.f49811a) {
            case 0:
                ProfileActivity profileActivity = this.f49812b.m0;
                gv0 gv0Var = profileActivity.N5;
                if (gv0Var != null) {
                    gv0Var.dismiss();
                    profileActivity.N5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.pj0 currentListView = this.f49812b.f50137g0.N.getCurrentListView();
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
