package org.telegram.ui;
public final class rz0 implements Runnable {
    public final int f41079a;
    public final sz0 f41080b;

    public rz0(sz0 sz0Var, int i10) {
        this.f41079a = i10;
        this.f41080b = sz0Var;
    }

    @Override
    public final void run() {
        switch (this.f41079a) {
            case 0:
                ProfileActivity profileActivity = this.f41080b.A0;
                fz0 fz0Var = profileActivity.f34733y5;
                if (fz0Var != null) {
                    fz0Var.dismiss();
                    profileActivity.f34733y5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.tl0 currentListView = this.f41080b.f41407u0.L.getCurrentListView();
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
