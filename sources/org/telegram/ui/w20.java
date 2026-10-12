package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class w20 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.cm0, r0.o, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.k1 {
    public final int f41140a;
    public final n60 f41141b;

    public w20(n60 n60Var, int i10) {
        this.f41140a = i10;
        this.f41141b = n60Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return n60.B(this.f41141b, l1Var);
    }

    @Override
    public boolean a(int i10, View view) {
        switch (this.f41140a) {
            case 1:
                n60 n60Var = this.f41141b;
                if (n60Var.G1(view)) {
                    try {
                        n60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                n60 n60Var2 = this.f41141b;
                if (!n60Var2.s1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return n60Var2.G1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        n60Var2.J1();
                        org.telegram.ui.Components.bk0 bk0Var = ((org.telegram.ui.Cells.e4) view).f21105f;
                        if (bk0Var.isEnabled()) {
                            bk0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void l(int i10) {
        this.f41141b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void n(KeyEvent keyEvent) {
        n60 n60Var;
        n50 n50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n50Var = (n60Var = this.f41141b).f38466f3) != null && n50Var.isShowing()) {
            n60Var.f38466f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        n60.E(this.f41141b, iArr, fArr);
    }
}
