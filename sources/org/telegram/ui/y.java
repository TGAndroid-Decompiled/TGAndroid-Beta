package org.telegram.ui;

import android.view.WindowManager;
public final class y implements Runnable {
    public final int f43491a;
    public final h4 f43492b;

    public y(h4 h4Var, int i10) {
        this.f43491a = i10;
        this.f43492b = h4Var;
    }

    @Override
    public final void run() {
        float f7;
        switch (this.f43491a) {
            case 0:
                h4 h4Var = this.f43492b;
                try {
                    if (h4Var.f37677f0.getParent() != null) {
                        ((WindowManager) h4Var.L.getSystemService("window")).removeView(h4Var.f37677f0);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 1:
                h4 h4Var2 = this.f43492b;
                l0 l0Var = h4Var2.f37678g0;
                if (l0Var != null && h4Var2.f37677f0 != null) {
                    l0Var.setLayerType(0, null);
                    h4Var2.Z = 0;
                    org.telegram.messenger.i0.v1(h4Var2.L.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                this.f43492b.d0();
                return;
            case 3:
                h4 h4Var3 = this.f43492b;
                float currentProgress = 0.7f - h4Var3.f37679h0.f42900d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f7 = 0.01f;
                    } else {
                        f7 = 0.02f;
                    }
                    org.telegram.ui.Components.a80 a80Var = h4Var3.f37679h0.f42900d0;
                    a80Var.a(true, a80Var.getCurrentProgress() + f7);
                    org.telegram.messenger.i0.h3(h4Var3.f37681j0, 100L);
                    return;
                }
                return;
            case 4:
                org.telegram.messenger.i0.g3(new y(this.f43492b, 2));
                return;
            case 5:
                org.telegram.messenger.i0.g3(new y(this.f43492b, 2));
                return;
            case 6:
                this.f43492b.K.a(true);
                return;
            case 7:
                this.f43492b.K.a(true);
                return;
            case 8:
                this.f43492b.a0();
                return;
            case 9:
                this.f43492b.f0();
                return;
            case 10:
                h4 h4Var4 = this.f43492b;
                l0 l0Var2 = h4Var4.f37678g0;
                if (l0Var2 != null) {
                    l0Var2.setLayerType(0, null);
                    h4Var4.Z = 0;
                    h4Var4.K();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != 0) {
                    ?? obj = new Object();
                    obj.f20390a = true;
                    T.showAsSheet(new org.telegram.ui.web.p1(new p(this.f43492b, 3)), obj);
                    return;
                }
                return;
        }
    }
}
