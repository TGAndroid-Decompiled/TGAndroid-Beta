package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yl0 implements Runnable {
    public final int f44366a;
    public final nn0 f44367b;

    public yl0(nn0 nn0Var, int i10) {
        this.f44366a = i10;
        this.f44367b = nn0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f44366a) {
            case 0:
                nn0 nn0Var = this.f44367b;
                ViewGroup[] viewGroupArr = nn0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    nn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(nn0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                nn0 nn0Var2 = this.f44367b;
                nn0Var2.presentFragment(nn0Var2.f40258h1, true);
                nn0Var2.f40258h1 = null;
                return;
            case 2:
                nn0 nn0Var3 = this.f44367b;
                EditTextBoldCursor[] editTextBoldCursorArr = nn0Var3.f40239a0;
                if (editTextBoldCursorArr != null) {
                    nn0Var3.H1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f44367b.Y[2]);
                return;
            case 4:
                this.f44367b.w1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    nn0 nn0Var4 = this.f44367b;
                    if (i10 < nn0Var4.f40245c0.getChildCount()) {
                        View childAt = nn0Var4.f40245c0.getChildAt(i10);
                        if (childAt instanceof mn0) {
                            nn0Var4.f40245c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        nn0Var4.w1();
                        nn0Var4.f40275q1.clear();
                        nn0Var4.f40273p1.clear();
                        nn0Var4.f40294y.values.clear();
                        nn0Var4.P1();
                        return;
                    }
                }
            default:
                this.f44367b.finishFragment();
                return;
        }
    }
}
