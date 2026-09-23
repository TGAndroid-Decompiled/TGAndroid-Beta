package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rl0 implements Runnable {
    public final int f36892a;
    public final in0 f36893b;

    public rl0(in0 in0Var, int i10) {
        this.f36892a = i10;
        this.f36893b = in0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f36892a) {
            case 0:
                in0 in0Var = this.f36893b;
                ViewGroup[] viewGroupArr = in0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    in0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(in0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                in0 in0Var2 = this.f36893b;
                in0Var2.presentFragment(in0Var2.f34181h1, true);
                in0Var2.f34181h1 = null;
                return;
            case 2:
                in0 in0Var3 = this.f36893b;
                EditTextBoldCursor[] editTextBoldCursorArr = in0Var3.f34163a0;
                if (editTextBoldCursorArr != null) {
                    in0Var3.I1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f36893b.Y[2]);
                return;
            case 4:
                this.f36893b.x1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    in0 in0Var4 = this.f36893b;
                    if (i10 < in0Var4.f34169c0.getChildCount()) {
                        View childAt = in0Var4.f34169c0.getChildAt(i10);
                        if (childAt instanceof hn0) {
                            in0Var4.f34169c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        in0Var4.x1();
                        in0Var4.f34198q1.clear();
                        in0Var4.f34196p1.clear();
                        in0Var4.f34217y.values.clear();
                        in0Var4.Q1();
                        return;
                    }
                }
            default:
                this.f36893b.finishFragment();
                return;
        }
    }
}
