package org.telegram.ui;
public final class rv0 implements Runnable {
    public final int f51029a;
    public final sv0 f51030b;

    public rv0(sv0 sv0Var, int i7) {
        this.f51029a = i7;
        this.f51030b = sv0Var;
    }

    @Override
    public final void run() {
        switch (this.f51029a) {
            case 0:
                ProfileActivity profileActivity = this.f51030b.f51286n0;
                fv0 fv0Var = profileActivity.R5;
                if (fv0Var != null) {
                    fv0Var.dismiss();
                    profileActivity.R5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.uj0 currentListView = this.f51030b.f51281h0.O.getCurrentListView();
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
