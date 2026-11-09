package org.telegram.ui;
public final class zr implements Runnable {
    public final int f52657a;
    public final ms f52658b;

    public zr(ms msVar, int i7) {
        this.f52657a = i7;
        this.f52658b = msVar;
    }

    @Override
    public final void run() {
        switch (this.f52657a) {
            case 0:
                this.f52658b.f47961c0 = null;
                return;
            case 1:
                ms msVar = this.f52658b;
                msVar.A.w0(null);
                org.telegram.ui.Components.tb0 tb0Var = msVar.C;
                if (tb0Var != null) {
                    tb0Var.a();
                    msVar.f47983z.removeView(msVar.C);
                    msVar.C = null;
                    return;
                }
                return;
            default:
                this.f52658b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                return;
        }
    }
}
