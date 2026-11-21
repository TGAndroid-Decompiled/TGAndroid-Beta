package org.telegram.ui;
public final class sv0 implements Runnable {
    public final int f52138a;
    public final tv0 f52139b;

    public sv0(tv0 tv0Var, int i7) {
        this.f52138a = i7;
        this.f52139b = tv0Var;
    }

    @Override
    public final void run() {
        switch (this.f52138a) {
            case 0:
                ProfileActivity profileActivity = this.f52139b.f52399n0;
                hv0 hv0Var = profileActivity.T5;
                if (hv0Var != null) {
                    hv0Var.dismiss();
                    profileActivity.T5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.ek0 currentListView = this.f52139b.f52394h0.O.getCurrentListView();
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
