package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class s20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.ol0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.l1 {
    public final int f40329a;
    public final h60 f40330b;

    public s20(h60 h60Var, int i10) {
        this.f40329a = i10;
        this.f40330b = h60Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return h60.z(this.f40330b, l1Var);
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f40329a) {
            case 1:
                h60 h60Var = this.f40330b;
                if (h60Var.F1(view)) {
                    try {
                        h60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                h60 h60Var2 = this.f40330b;
                if (!h60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return h60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        h60Var2.I1();
                        org.telegram.ui.Components.nj0 nj0Var = ((org.telegram.ui.Cells.e4) view).f22025f;
                        if (nj0Var.isEnabled()) {
                            nj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void m(int i10) {
        this.f40330b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void o(KeyEvent keyEvent) {
        h60 h60Var;
        i50 i50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (i50Var = (h60Var = this.f40330b).f36899f3) != null && i50Var.isShowing()) {
            h60Var.f36899f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        h60.B(this.f40330b, iArr, fArr);
    }
}
