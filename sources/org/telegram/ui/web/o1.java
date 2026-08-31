package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
public final class o1 implements Runnable {
    public final int f42656a;
    public final org.telegram.ui.m0 f42657b;

    public o1(org.telegram.ui.m0 m0Var, int i10) {
        this.f42656a = i10;
        this.f42657b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f42656a) {
            case 0:
                org.telegram.ui.m0 m0Var = this.f42657b;
                m0Var.f42731x0 = true;
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
                org.telegram.ui.m0 m0Var2 = this.f42657b;
                mh.m mVar = m0Var2.V;
                if (m0Var2.T) {
                    mVar.requestFocus();
                    AndroidUtilities.showKeyboard(mVar);
                    return;
                }
                mVar.clearFocus();
                AndroidUtilities.hideKeyboard(mVar);
                return;
        }
    }
}
