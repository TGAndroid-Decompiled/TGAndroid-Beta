package org.telegram.ui;
public final class rv0 implements Runnable {
    public final int f51899a;
    public final sv0 f51900b;

    public rv0(sv0 sv0Var, int i7) {
        this.f51899a = i7;
        this.f51900b = sv0Var;
    }

    @Override
    public final void run() {
        switch (this.f51899a) {
            case 0:
                ProfileActivity profileActivity = this.f51900b.f52162n0;
                gv0 gv0Var = profileActivity.T5;
                if (gv0Var != null) {
                    gv0Var.dismiss();
                    profileActivity.T5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.ek0 currentListView = this.f51900b.f52157h0.O.getCurrentListView();
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
