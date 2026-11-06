package org.telegram.ui;
public final class sv0 implements Runnable {
    public final int f49839a;
    public final tv0 f49840b;

    public sv0(tv0 tv0Var, int i7) {
        this.f49839a = i7;
        this.f49840b = tv0Var;
    }

    @Override
    public final void run() {
        switch (this.f49839a) {
            case 0:
                ProfileActivity profileActivity = this.f49840b.m0;
                hv0 hv0Var = profileActivity.N5;
                if (hv0Var != null) {
                    hv0Var.dismiss();
                    profileActivity.N5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.pj0 currentListView = this.f49840b.f50159g0.N.getCurrentListView();
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
