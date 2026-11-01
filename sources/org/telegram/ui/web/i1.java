package org.telegram.ui.web;

import org.telegram.ui.zd;
public final class i1 implements Runnable {
    public final int f42864a;
    public final org.telegram.ui.m0 f42865b;

    public i1(org.telegram.ui.m0 m0Var, int i10) {
        this.f42864a = i10;
        this.f42865b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f42864a) {
            case 0:
                org.telegram.ui.m0 m0Var = this.f42865b;
                m0Var.A0 = true;
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
                org.telegram.ui.m0 m0Var2 = this.f42865b;
                zd zdVar = m0Var2.f42897b0;
                if (m0Var2.W) {
                    zdVar.requestFocus();
                    org.telegram.messenger.i0.J3(zdVar);
                    return;
                }
                zdVar.clearFocus();
                org.telegram.messenger.i0.v1(zdVar);
                return;
        }
    }
}
