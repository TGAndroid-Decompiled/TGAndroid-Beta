package org.telegram.ui;
public final class sv0 implements Runnable {
    public final int f52088a;
    public final tv0 f52089b;

    public sv0(tv0 tv0Var, int i7) {
        this.f52088a = i7;
        this.f52089b = tv0Var;
    }

    @Override
    public final void run() {
        switch (this.f52088a) {
            case 0:
                ProfileActivity profileActivity = this.f52089b.f52366n0;
                hv0 hv0Var = profileActivity.T5;
                if (hv0Var != null) {
                    hv0Var.dismiss();
                    profileActivity.T5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.ck0 currentListView = this.f52089b.f52361h0.O.getCurrentListView();
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
