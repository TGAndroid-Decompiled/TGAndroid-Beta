package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class y10 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.ok0, r0.o, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.m1 {
    public final int f44672a;
    public final o50 f44673b;

    public y10(o50 o50Var, int i9) {
        this.f44672a = i9;
        this.f44673b = o50Var;
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        return o50.z(this.f44673b, m1Var);
    }

    @Override
    public boolean a(int i9, View view) {
        switch (this.f44672a) {
            case 1:
                o50 o50Var = this.f44673b;
                if (o50Var.F1(view)) {
                    try {
                        o50Var.M.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                o50 o50Var2 = this.f44673b;
                if (!o50Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return o50Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        o50Var2.I1();
                        org.telegram.ui.Components.pi0 pi0Var = ((org.telegram.ui.Cells.e4) view).f24293f;
                        if (pi0Var.isEnabled()) {
                            pi0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void i(int i9) {
        this.f44673b.K.getActionBarMenuOnItemClick().b(i9);
    }

    @Override
    public void k(KeyEvent keyEvent) {
        o50 o50Var;
        o40 o40Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o40Var = (o50Var = this.f44673b).f40887b3) != null && o40Var.isShowing()) {
            o50Var.f40887b3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        o50.C(this.f44673b, iArr, fArr);
    }
}
