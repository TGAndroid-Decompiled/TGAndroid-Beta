package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class s20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.bl0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.l1 {
    public final int f37239a;
    public final i60 f37240b;

    public s20(i60 i60Var, int i10) {
        this.f37239a = i10;
        this.f37240b = i60Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return i60.z(this.f37240b, l1Var);
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f37239a) {
            case 1:
                i60 i60Var = this.f37240b;
                if (i60Var.F1(view)) {
                    try {
                        i60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                i60 i60Var2 = this.f37240b;
                if (!i60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return i60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        i60Var2.I1();
                        org.telegram.ui.Components.aj0 aj0Var = ((org.telegram.ui.Cells.d4) view).f19916f;
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
        this.f37240b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void o(KeyEvent keyEvent) {
        i60 i60Var;
        i50 i50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (i50Var = (i60Var = this.f37240b).f34434f3) != null && i50Var.isShowing()) {
            i60Var.f34434f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        i60.B(this.f37240b, iArr, fArr);
    }
}
