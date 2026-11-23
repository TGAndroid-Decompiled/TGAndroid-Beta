package org.telegram.ui;
public final class tv0 implements Runnable {
    public final int f52366a;
    public final uv0 f52367b;

    public tv0(uv0 uv0Var, int i7) {
        this.f52366a = i7;
        this.f52367b = uv0Var;
    }

    @Override
    public final void run() {
        switch (this.f52366a) {
            case 0:
                ProfileActivity profileActivity = this.f52367b.f52645n0;
                iv0 iv0Var = profileActivity.T5;
                if (iv0Var != null) {
                    iv0Var.dismiss();
                    profileActivity.T5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.ek0 currentListView = this.f52367b.f52640h0.O.getCurrentListView();
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
