package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sl0 implements Runnable {
    public final int f43532a;
    public final in0 f43533b;

    public sl0(in0 in0Var, int i10) {
        this.f43532a = i10;
        this.f43533b = in0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f43532a) {
            case 0:
                in0 in0Var = this.f43533b;
                ViewGroup[] viewGroupArr = in0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    in0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(in0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                in0 in0Var2 = this.f43533b;
                in0Var2.presentFragment(in0Var2.f40288h1, true);
                in0Var2.f40288h1 = null;
                return;
            case 2:
                in0 in0Var3 = this.f43533b;
                EditTextBoldCursor[] editTextBoldCursorArr = in0Var3.f40270a0;
                if (editTextBoldCursorArr != null) {
                    in0Var3.I1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f43533b.Y[2]);
                return;
            case 4:
                this.f43533b.x1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    in0 in0Var4 = this.f43533b;
                    if (i10 < in0Var4.f40276c0.getChildCount()) {
                        View childAt = in0Var4.f40276c0.getChildAt(i10);
                        if (childAt instanceof hn0) {
                            in0Var4.f40276c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        in0Var4.x1();
                        in0Var4.f40305q1.clear();
                        in0Var4.f40303p1.clear();
                        in0Var4.f40324y.values.clear();
                        in0Var4.R1();
                        return;
                    }
                }
            default:
                this.f43533b.finishFragment();
                return;
        }
    }
}
