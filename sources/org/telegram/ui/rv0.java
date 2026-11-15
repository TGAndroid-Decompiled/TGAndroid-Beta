package org.telegram.ui;
public final class rv0 implements Runnable {
    public final int f51033a;
    public final sv0 f51034b;

    public rv0(sv0 sv0Var, int i7) {
        this.f51033a = i7;
        this.f51034b = sv0Var;
    }

    @Override
    public final void run() {
        switch (this.f51033a) {
            case 0:
                ProfileActivity profileActivity = this.f51034b.f51285n0;
                fv0 fv0Var = profileActivity.R5;
                if (fv0Var != null) {
                    fv0Var.dismiss();
                    profileActivity.R5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.uj0 currentListView = this.f51034b.f51280h0.O.getCurrentListView();
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
