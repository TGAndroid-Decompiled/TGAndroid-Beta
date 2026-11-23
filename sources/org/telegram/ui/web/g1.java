package org.telegram.ui.web;
public final class g1 implements Runnable {
    public final int f53375a;
    public final org.telegram.ui.l0 f53376b;

    public g1(org.telegram.ui.l0 l0Var, int i7) {
        this.f53375a = i7;
        this.f53376b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f53375a) {
            case 0:
                org.telegram.ui.l0 l0Var = this.f53376b;
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
                org.telegram.ui.l0 l0Var2 = this.f53376b;
                di.q qVar = l0Var2.f53414c0;
                if (l0Var2.f53410a0) {
                    qVar.requestFocus();
                    org.telegram.messenger.g0.I3(qVar);
                    return;
                }
                qVar.clearFocus();
                org.telegram.messenger.g0.v1(qVar);
                return;
        }
    }
}
