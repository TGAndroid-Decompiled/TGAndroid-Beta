package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class u20 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.cl0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.m1 {
    public final int f37920a;
    public final k60 f37921b;

    public u20(k60 k60Var, int i10) {
        this.f37920a = i10;
        this.f37921b = k60Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return k60.z(this.f37921b, l1Var);
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f37920a) {
            case 1:
                k60 k60Var = this.f37921b;
                if (k60Var.F1(view)) {
                    try {
                        k60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                k60 k60Var2 = this.f37921b;
                if (!k60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return k60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        k60Var2.I1();
                        org.telegram.ui.Components.bj0 bj0Var = ((org.telegram.ui.Cells.d4) view).f19927f;
                        if (bj0Var.isEnabled()) {
                            bj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void m(int i10) {
        this.f37921b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void o(KeyEvent keyEvent) {
        k60 k60Var;
        k50 k50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k50Var = (k60Var = this.f37921b).f35041f3) != null && k50Var.isShowing()) {
            k60Var.f35041f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        k60.B(this.f37921b, iArr, fArr);
    }
}
