package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zl0 implements Runnable {
    public final int f43487a;
    public final pn0 f43488b;

    public zl0(pn0 pn0Var, int i10) {
        this.f43487a = i10;
        this.f43488b = pn0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f43487a) {
            case 0:
                pn0 pn0Var = this.f43488b;
                ViewGroup[] viewGroupArr = pn0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    pn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(pn0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                pn0 pn0Var2 = this.f43488b;
                pn0Var2.presentFragment(pn0Var2.f39595h1, true);
                pn0Var2.f39595h1 = null;
                return;
            case 2:
                pn0 pn0Var3 = this.f43488b;
                EditTextBoldCursor[] editTextBoldCursorArr = pn0Var3.f39576a0;
                if (editTextBoldCursorArr != null) {
                    pn0Var3.I1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f43488b.Y[2]);
                return;
            case 4:
                this.f43488b.x1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    pn0 pn0Var4 = this.f43488b;
                    if (i10 < pn0Var4.f39582c0.getChildCount()) {
                        View childAt = pn0Var4.f39582c0.getChildAt(i10);
                        if (childAt instanceof on0) {
                            pn0Var4.f39582c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        pn0Var4.x1();
                        pn0Var4.f39612q1.clear();
                        pn0Var4.f39610p1.clear();
                        pn0Var4.f39631y.values.clear();
                        pn0Var4.Q1();
                        return;
                    }
                }
            default:
                this.f43488b.finishFragment();
                return;
        }
    }
}
