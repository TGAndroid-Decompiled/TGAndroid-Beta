package org.telegram.ui;
public final class wz0 implements Runnable {
    public final int f42880a;
    public final xz0 f42881b;

    public wz0(xz0 xz0Var, int i10) {
        this.f42880a = i10;
        this.f42881b = xz0Var;
    }

    @Override
    public final void run() {
        switch (this.f42880a) {
            case 0:
                ProfileActivity profileActivity = this.f42881b.A0;
                jz0 jz0Var = profileActivity.f34733y5;
                if (jz0Var != null) {
                    jz0Var.dismiss();
                    profileActivity.f34733y5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.sl0 currentListView = this.f42881b.f43487u0.L.getCurrentListView();
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
