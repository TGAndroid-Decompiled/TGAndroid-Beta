package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class s20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.ll0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.l1 {
    public final int f37280a;
    public final i60 f37281b;

    public s20(i60 i60Var, int i10) {
        this.f37280a = i10;
        this.f37281b = i60Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return i60.z(this.f37281b, l1Var);
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f37280a) {
            case 1:
                i60 i60Var = this.f37281b;
                if (i60Var.F1(view)) {
                    try {
                        i60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                i60 i60Var2 = this.f37281b;
                if (!i60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return i60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        i60Var2.I1();
                        org.telegram.ui.Components.kj0 kj0Var = ((org.telegram.ui.Cells.f4) view).f20279f;
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
        this.f37281b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void o(KeyEvent keyEvent) {
        i60 i60Var;
        i50 i50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (i50Var = (i60Var = this.f37281b).f34384f3) != null && i50Var.isShowing()) {
            i60Var.f34384f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        i60.B(this.f37281b, iArr, fArr);
    }
}
