package org.telegram.ui;
public final class uv0 implements Runnable {
    public final int f50473a;
    public final vv0 f50474b;

    public uv0(vv0 vv0Var, int i7) {
        this.f50473a = i7;
        this.f50474b = vv0Var;
    }

    @Override
    public final void run() {
        switch (this.f50473a) {
            case 0:
                ProfileActivity profileActivity = this.f50474b.m0;
                jv0 jv0Var = profileActivity.P5;
                if (jv0Var != null) {
                    jv0Var.dismiss();
                    profileActivity.P5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.qj0 currentListView = this.f50474b.f50783g0.N.getCurrentListView();
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
