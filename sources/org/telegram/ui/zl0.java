package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zl0 implements Runnable {
    public final int f44874a;
    public final pn0 f44875b;

    public zl0(pn0 pn0Var, int i10) {
        this.f44874a = i10;
        this.f44875b = pn0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f44874a) {
            case 0:
                pn0 pn0Var = this.f44875b;
                ViewGroup[] viewGroupArr = pn0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    pn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(pn0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                pn0 pn0Var2 = this.f44875b;
                pn0Var2.presentFragment(pn0Var2.f41019h1, true);
                pn0Var2.f41019h1 = null;
                return;
            case 2:
                pn0 pn0Var3 = this.f44875b;
                EditTextBoldCursor[] editTextBoldCursorArr = pn0Var3.f41000a0;
                if (editTextBoldCursorArr != null) {
                    pn0Var3.H1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f44875b.Y[2]);
                return;
            case 4:
                this.f44875b.w1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    pn0 pn0Var4 = this.f44875b;
                    if (i10 < pn0Var4.f41006c0.getChildCount()) {
                        View childAt = pn0Var4.f41006c0.getChildAt(i10);
                        if (childAt instanceof on0) {
                            pn0Var4.f41006c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        pn0Var4.w1();
                        pn0Var4.f41036q1.clear();
                        pn0Var4.f41034p1.clear();
                        pn0Var4.f41055y.values.clear();
                        pn0Var4.P1();
                        return;
                    }
                }
            default:
                this.f44875b.finishFragment();
                return;
        }
    }
}
