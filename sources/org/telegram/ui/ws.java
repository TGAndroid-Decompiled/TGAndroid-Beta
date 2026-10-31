package org.telegram.ui;
public final class ws implements Runnable {
    public final int f43359a;
    public final lt f43360b;

    public ws(lt ltVar, int i10) {
        this.f43359a = i10;
        this.f43360b = ltVar;
    }

    @Override
    public final void run() {
        switch (this.f43359a) {
            case 0:
                this.f43360b.f39388c0 = null;
                return;
            case 1:
                lt ltVar = this.f43360b;
                ltVar.A.w0(null);
                org.telegram.ui.Components.lc0 lc0Var = ltVar.C;
                if (lc0Var != null) {
                    lc0Var.a();
                    ltVar.f39409z.removeView(ltVar.C);
                    ltVar.C = null;
                    return;
                }
                return;
            default:
                this.f43360b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                return;
        }
    }
}
