package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class si0 implements Runnable {
    public final int f49859a;
    public final ek0 f49860b;

    public si0(ek0 ek0Var, int i7) {
        this.f49859a = i7;
        this.f49860b = ek0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f49859a) {
            case 0:
                ek0 ek0Var = this.f49860b;
                ViewGroup[] viewGroupArr = ek0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    ek0Var.Y[0].requestFocus();
                    org.telegram.messenger.g0.K3(ek0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                ek0 ek0Var2 = this.f49860b;
                ek0Var2.presentFragment(ek0Var2.f45335h1, true);
                ek0Var2.f45335h1 = null;
                return;
            case 2:
                ek0 ek0Var3 = this.f49860b;
                EditTextBoldCursor[] editTextBoldCursorArr = ek0Var3.f45316a0;
                if (editTextBoldCursorArr != null) {
                    ek0Var3.M1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.K3(this.f49860b.Y[2]);
                return;
            case 4:
                this.f49860b.B1();
                return;
            case 5:
                int i7 = 0;
                while (true) {
                    ek0 ek0Var4 = this.f49860b;
                    if (i7 < ek0Var4.f45322c0.getChildCount()) {
                        View childAt = ek0Var4.f45322c0.getChildAt(i7);
                        if (childAt instanceof dk0) {
                            ek0Var4.f45322c0.removeView(childAt);
                            i7--;
                        }
                        i7++;
                    } else {
                        ek0Var4.B1();
                        ek0Var4.f45351q1.clear();
                        ek0Var4.f45349p1.clear();
                        ek0Var4.D.values.clear();
                        ek0Var4.V1();
                        return;
                    }
                }
            default:
                this.f49860b.finishFragment();
                return;
        }
    }
}
