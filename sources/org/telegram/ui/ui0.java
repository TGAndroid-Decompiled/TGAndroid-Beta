package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ui0 implements Runnable {
    public final int f52566a;
    public final hk0 f52567b;

    public ui0(hk0 hk0Var, int i7) {
        this.f52566a = i7;
        this.f52567b = hk0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f52566a) {
            case 0:
                hk0 hk0Var = this.f52567b;
                ViewGroup[] viewGroupArr = hk0Var.f48370a0;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    hk0Var.Z[0].requestFocus();
                    org.telegram.messenger.g0.I3(hk0Var.Z[0]);
                    return;
                }
                return;
            case 1:
                hk0 hk0Var2 = this.f52567b;
                hk0Var2.presentFragment(hk0Var2.f48391i1, true);
                hk0Var2.f48391i1 = null;
                return;
            case 2:
                hk0 hk0Var3 = this.f52567b;
                EditTextBoldCursor[] editTextBoldCursorArr = hk0Var3.f48373b0;
                if (editTextBoldCursorArr != null) {
                    hk0Var3.M1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.I3(this.f52567b.Z[2]);
                return;
            case 4:
                this.f52567b.B1();
                return;
            case 5:
                int i7 = 0;
                while (true) {
                    hk0 hk0Var4 = this.f52567b;
                    if (i7 < hk0Var4.f48378d0.getChildCount()) {
                        View childAt = hk0Var4.f48378d0.getChildAt(i7);
                        if (childAt instanceof gk0) {
                            hk0Var4.f48378d0.removeView(childAt);
                            i7--;
                        }
                        i7++;
                    } else {
                        hk0Var4.B1();
                        hk0Var4.f48408r1.clear();
                        hk0Var4.f48405q1.clear();
                        hk0Var4.E.values.clear();
                        hk0Var4.V1();
                        return;
                    }
                }
            default:
                this.f52567b.finishFragment();
                return;
        }
    }
}
