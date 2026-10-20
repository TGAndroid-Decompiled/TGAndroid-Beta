package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class z10 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.zl0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.k1 {
    public final int f43601a;
    public final q50 f43602b;

    public z10(q50 q50Var, int i10) {
        this.f43601a = i10;
        this.f43602b = q50Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        return q50.B(this.f43602b, k1Var);
    }

    @Override
    public boolean a(int i10, View view) {
        switch (this.f43601a) {
            case 1:
                q50 q50Var = this.f43602b;
                if (q50Var.G1(view)) {
                    try {
                        q50Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                q50 q50Var2 = this.f43602b;
                if (!q50Var2.s1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return q50Var2.G1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        q50Var2.J1();
                        org.telegram.ui.Components.yj0 yj0Var = ((org.telegram.ui.Cells.d4) view).f22129f;
                        if (yj0Var.isEnabled()) {
                            yj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void j(int i10) {
        this.f43602b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void n(KeyEvent keyEvent) {
        q50 q50Var;
        q40 q40Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (q40Var = (q50Var = this.f43602b).f40400f3) != null && q40Var.isShowing()) {
            q50Var.f40400f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        q50.D(this.f43602b, iArr, fArr);
    }
}
