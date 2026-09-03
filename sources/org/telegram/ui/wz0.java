package org.telegram.ui;
public final class wz0 implements Runnable {
    public final int f39791a;
    public final xz0 f39792b;

    public wz0(xz0 xz0Var, int i10) {
        this.f39791a = i10;
        this.f39792b = xz0Var;
    }

    @Override
    public final void run() {
        switch (this.f39791a) {
            case 0:
                ProfileActivity profileActivity = this.f39792b.A0;
                jz0 jz0Var = profileActivity.f32174y5;
                if (jz0Var != null) {
                    jz0Var.dismiss();
                    profileActivity.f32174y5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.rl0 currentListView = this.f39792b.f40098u0.L.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
        }
    }
}
