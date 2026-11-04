package org.telegram.ui.web;
public final class f1 implements Runnable {
    public final int f50844a;
    public final org.telegram.ui.m0 f50845b;

    public f1(org.telegram.ui.m0 m0Var, int i3) {
        this.f50844a = i3;
        this.f50845b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f50844a) {
            case 0:
                org.telegram.ui.m0 m0Var = this.f50845b;
                m0Var.B0 = true;
                if (m0Var.getParent() != null) {
                    m0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    m0Var.performHapticFeedback(0, 1);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                org.telegram.ui.m0 m0Var2 = this.f50845b;
                ci.s sVar = m0Var2.f50875c0;
                if (m0Var2.f50871a0) {
                    sVar.requestFocus();
                    org.telegram.messenger.g0.K3(sVar);
                    return;
                }
                sVar.clearFocus();
                org.telegram.messenger.g0.v1(sVar);
                return;
        }
    }
}
