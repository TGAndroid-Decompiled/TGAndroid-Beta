package org.telegram.ui;
public final class vv0 implements Runnable {
    public final int f50802a;
    public final wv0 f50803b;

    public vv0(wv0 wv0Var, int i7) {
        this.f50802a = i7;
        this.f50803b = wv0Var;
    }

    @Override
    public final void run() {
        switch (this.f50802a) {
            case 0:
                ProfileActivity profileActivity = this.f50803b.m0;
                kv0 kv0Var = profileActivity.P5;
                if (kv0Var != null) {
                    kv0Var.dismiss();
                    profileActivity.P5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.pj0 currentListView = this.f50803b.f51453g0.N.getCurrentListView();
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
