package org.telegram.ui;
public final class vr implements Runnable {
    public final int f50603a;
    public final is f50604b;

    public vr(is isVar, int i3) {
        this.f50603a = i3;
        this.f50604b = isVar;
    }

    @Override
    public final void run() {
        switch (this.f50603a) {
            case 0:
                this.f50604b.f46387c0 = null;
                return;
            case 1:
                is isVar = this.f50604b;
                isVar.A.w0(null);
                org.telegram.ui.Components.nb0 nb0Var = isVar.C;
                if (nb0Var != null) {
                    nb0Var.a();
                    isVar.f46409z.removeView(isVar.C);
                    isVar.C = null;
                    return;
                }
                return;
            default:
                this.f50604b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                return;
        }
    }
}
