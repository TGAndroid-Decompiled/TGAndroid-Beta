package org.telegram.ui;
public final class xr implements Runnable {
    public final int f51950a;
    public final ks f51951b;

    public xr(ks ksVar, int i7) {
        this.f51950a = i7;
        this.f51951b = ksVar;
    }

    @Override
    public final void run() {
        switch (this.f51950a) {
            case 0:
                this.f51951b.f47248c0 = null;
                return;
            case 1:
                ks ksVar = this.f51951b;
                ksVar.A.w0(null);
                org.telegram.ui.Components.sb0 sb0Var = ksVar.C;
                if (sb0Var != null) {
                    sb0Var.a();
                    ksVar.f47270z.removeView(ksVar.C);
                    ksVar.C = null;
                    return;
                }
                return;
            default:
                this.f51951b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                return;
        }
    }
}
