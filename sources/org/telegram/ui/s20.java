package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class s20 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.mm0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.k1 {
    public final int f41789a;
    public final i60 f41790b;

    public s20(i60 i60Var, int i10) {
        this.f41789a = i10;
        this.f41790b = i60Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return i60.B(this.f41790b, k1Var);
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f41789a) {
            case 1:
                i60 i60Var = this.f41790b;
                if (i60Var.G1(view)) {
                    try {
                        i60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                i60 i60Var2 = this.f41790b;
                if (!i60Var2.s1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return i60Var2.G1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        i60Var2.J1();
                        org.telegram.ui.Components.ik0 ik0Var = ((org.telegram.ui.Cells.e4) view).f21793f;
                        if (ik0Var.isEnabled()) {
                            ik0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void m(int i10) {
        this.f41790b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void o(KeyEvent keyEvent) {
        i60 i60Var;
        i50 i50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (i50Var = (i60Var = this.f41790b).f38706f3) != null && i50Var.isShowing()) {
            i60Var.f38706f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        i60.E(this.f41790b, iArr, fArr);
    }
}
