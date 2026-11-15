package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ri0 implements Runnable {
    public final int f50959a;
    public final ek0 f50960b;

    public ri0(ek0 ek0Var, int i7) {
        this.f50959a = i7;
        this.f50960b = ek0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f50959a) {
            case 0:
                ek0 ek0Var = this.f50960b;
                ViewGroup[] viewGroupArr = ek0Var.f46803a0;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    ek0Var.Z[0].requestFocus();
                    org.telegram.messenger.g0.J3(ek0Var.Z[0]);
                    return;
                }
                return;
            case 1:
                ek0 ek0Var2 = this.f50960b;
                ek0Var2.presentFragment(ek0Var2.f46824i1, true);
                ek0Var2.f46824i1 = null;
                return;
            case 2:
                ek0 ek0Var3 = this.f50960b;
                EditTextBoldCursor[] editTextBoldCursorArr = ek0Var3.f46806b0;
                if (editTextBoldCursorArr != null) {
                    ek0Var3.M1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.J3(this.f50960b.Z[2]);
                return;
            case 4:
                this.f50960b.B1();
                return;
            case 5:
                int i7 = 0;
                while (true) {
                    ek0 ek0Var4 = this.f50960b;
                    if (i7 < ek0Var4.f46811d0.getChildCount()) {
                        View childAt = ek0Var4.f46811d0.getChildAt(i7);
                        if (childAt instanceof dk0) {
                            ek0Var4.f46811d0.removeView(childAt);
                            i7--;
                        }
                        i7++;
                    } else {
                        ek0Var4.B1();
                        ek0Var4.f46841r1.clear();
                        ek0Var4.f46838q1.clear();
                        ek0Var4.E.values.clear();
                        ek0Var4.V1();
                        return;
                    }
                }
            default:
                this.f50960b.finishFragment();
                return;
        }
    }
}
