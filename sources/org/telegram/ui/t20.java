package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class t20 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.ll0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.n1 {
    public final int f36824a;
    public final j60 f36825b;

    public t20(j60 j60Var, int i10) {
        this.f36824a = i10;
        this.f36825b = j60Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return j60.z(this.f36825b, l1Var);
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f36824a) {
            case 1:
                j60 j60Var = this.f36825b;
                if (j60Var.F1(view)) {
                    try {
                        j60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                j60 j60Var2 = this.f36825b;
                if (!j60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return j60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        j60Var2.I1();
                        org.telegram.ui.Components.kj0 kj0Var = ((org.telegram.ui.Cells.d4) view).f18990f;
                        if (kj0Var.isEnabled()) {
                            kj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void m(int i10) {
        this.f36825b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void o(KeyEvent keyEvent) {
        j60 j60Var;
        j50 j50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (j50Var = (j60Var = this.f36825b).f33960f3) != null && j50Var.isShowing()) {
            j60Var.f33960f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        j60.C(this.f36825b, iArr, fArr);
    }
}
