package org.telegram.ui.web;
public final class g1 implements Runnable {
    public final int f52613a;
    public final org.telegram.ui.l0 f52614b;

    public g1(org.telegram.ui.l0 l0Var, int i7) {
        this.f52613a = i7;
        this.f52614b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f52613a) {
            case 0:
                org.telegram.ui.l0 l0Var = this.f52614b;
                l0Var.B0 = true;
                if (l0Var.getParent() != null) {
                    l0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    l0Var.performHapticFeedback(0, 1);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                org.telegram.ui.l0 l0Var2 = this.f52614b;
                di.q qVar = l0Var2.f52652c0;
                if (l0Var2.f52648a0) {
                    qVar.requestFocus();
                    org.telegram.messenger.g0.J3(qVar);
                    return;
                }
                qVar.clearFocus();
                org.telegram.messenger.g0.v1(qVar);
                return;
        }
    }
}
