package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yl0 implements Runnable {
    public final int f44412a;
    public final nn0 f44413b;

    public yl0(nn0 nn0Var, int i10) {
        this.f44412a = i10;
        this.f44413b = nn0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f44412a) {
            case 0:
                nn0 nn0Var = this.f44413b;
                ViewGroup[] viewGroupArr = nn0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    nn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(nn0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                nn0 nn0Var2 = this.f44413b;
                nn0Var2.presentFragment(nn0Var2.f40304h1, true);
                nn0Var2.f40304h1 = null;
                return;
            case 2:
                nn0 nn0Var3 = this.f44413b;
                EditTextBoldCursor[] editTextBoldCursorArr = nn0Var3.f40285a0;
                if (editTextBoldCursorArr != null) {
                    nn0Var3.H1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f44413b.Y[2]);
                return;
            case 4:
                this.f44413b.w1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    nn0 nn0Var4 = this.f44413b;
                    if (i10 < nn0Var4.f40291c0.getChildCount()) {
                        View childAt = nn0Var4.f40291c0.getChildAt(i10);
                        if (childAt instanceof mn0) {
                            nn0Var4.f40291c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        nn0Var4.w1();
                        nn0Var4.f40321q1.clear();
                        nn0Var4.f40319p1.clear();
                        nn0Var4.f40340y.values.clear();
                        nn0Var4.P1();
                        return;
                    }
                }
            default:
                this.f44413b.finishFragment();
                return;
        }
    }
}
