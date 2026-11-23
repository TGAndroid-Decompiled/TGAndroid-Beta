package org.telegram.ui;

import android.view.WindowManager;
public final class z implements Runnable {
    public final int f54351a;
    public final g4 f54352b;

    public z(g4 g4Var, int i7) {
        this.f54351a = i7;
        this.f54352b = g4Var;
    }

    @Override
    public final void run() {
        float f10;
        switch (this.f54351a) {
            case 0:
                g4 g4Var = this.f54352b;
                try {
                    if (g4Var.f47959g0.getParent() != null) {
                        ((WindowManager) g4Var.M.getSystemService("window")).removeView(g4Var.f47959g0);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                g4 g4Var2 = this.f54352b;
                k0 k0Var = g4Var2.f47960h0;
                if (k0Var != null && g4Var2.f47959g0 != null) {
                    k0Var.setLayerType(0, null);
                    g4Var2.f47950a0 = 0;
                    org.telegram.messenger.g0.v1(g4Var2.M.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                this.f54352b.d0();
                return;
            case 3:
                g4 g4Var3 = this.f54352b;
                float currentProgress = 0.7f - g4Var3.f47961i0.f53182e0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f10 = 0.01f;
                    } else {
                        f10 = 0.02f;
                    }
                    org.telegram.ui.Components.x70 x70Var = g4Var3.f47961i0.f53182e0;
                    x70Var.a(true, x70Var.getCurrentProgress() + f10);
                    org.telegram.messenger.g0.h3(g4Var3.f47963k0, 100L);
                    return;
                }
                return;
            case 4:
                org.telegram.messenger.g0.g3(new z(this.f54352b, 2));
                return;
            case 5:
                org.telegram.messenger.g0.g3(new z(this.f54352b, 2));
                return;
            case 6:
                this.f54352b.L.a(true);
                return;
            case 7:
                this.f54352b.L.a(true);
                return;
            case 8:
                this.f54352b.a0();
                return;
            case 9:
                this.f54352b.f0();
                return;
            case 10:
                g4 g4Var4 = this.f54352b;
                k0 k0Var2 = g4Var4.f47960h0;
                if (k0Var2 != null) {
                    k0Var2.setLayerType(0, null);
                    g4Var4.f47950a0 = 0;
                    g4Var4.K();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != 0) {
                    ?? obj = new Object();
                    obj.f28905a = true;
                    T.showAsSheet(new org.telegram.ui.web.n1(new q(this.f54352b, 3)), obj);
                    return;
                }
                return;
        }
    }
}
