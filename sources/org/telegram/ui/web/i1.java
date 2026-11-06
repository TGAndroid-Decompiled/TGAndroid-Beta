package org.telegram.ui.web;
public final class i1 implements Runnable {
    public final int f51163a;
    public final org.telegram.ui.l0 f51164b;

    public i1(org.telegram.ui.l0 l0Var, int i7) {
        this.f51163a = i7;
        this.f51164b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f51163a) {
            case 0:
                org.telegram.ui.l0 l0Var = this.f51164b;
                l0Var.A0 = true;
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
                org.telegram.ui.l0 l0Var2 = this.f51164b;
                bi.v vVar = l0Var2.f51203b0;
                if (l0Var2.W) {
                    vVar.requestFocus();
                    org.telegram.messenger.g0.K3(vVar);
                    return;
                }
                vVar.clearFocus();
                org.telegram.messenger.g0.v1(vVar);
                return;
        }
    }
}
