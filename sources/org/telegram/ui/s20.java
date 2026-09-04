package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class s20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.bl0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.l1 {
    public final int f40289a;
    public final j60 f40290b;

    public s20(j60 j60Var, int i10) {
        this.f40289a = i10;
        this.f40290b = j60Var;
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        return j60.A(this.f40290b, l1Var);
    }

    @Override
    public boolean a(int i10, View view) {
        switch (this.f40289a) {
            case 1:
                j60 j60Var = this.f40290b;
                if (j60Var.F1(view)) {
                    try {
                        j60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                j60 j60Var2 = this.f40290b;
                if (!j60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return j60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        j60Var2.I1();
                        org.telegram.ui.Components.aj0 aj0Var = ((org.telegram.ui.Cells.d4) view).f21737f;
                        if (aj0Var.isEnabled()) {
                            aj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void m(int i10) {
        this.f40290b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void n(KeyEvent keyEvent) {
        j60 j60Var;
        j50 j50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (j50Var = (j60Var = this.f40290b).f37538f3) != null && j50Var.isShowing()) {
            j60Var.f37538f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        j60.C(this.f40290b, iArr, fArr);
    }
}
