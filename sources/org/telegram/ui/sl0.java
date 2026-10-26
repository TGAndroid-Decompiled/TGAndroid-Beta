package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sl0 implements Runnable {
    public final int f43535a;
    public final in0 f43536b;

    public sl0(in0 in0Var, int i10) {
        this.f43535a = i10;
        this.f43536b = in0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f43535a) {
            case 0:
                in0 in0Var = this.f43536b;
                ViewGroup[] viewGroupArr = in0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    in0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(in0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                in0 in0Var2 = this.f43536b;
                in0Var2.presentFragment(in0Var2.f40291h1, true);
                in0Var2.f40291h1 = null;
                return;
            case 2:
                in0 in0Var3 = this.f43536b;
                EditTextBoldCursor[] editTextBoldCursorArr = in0Var3.f40273a0;
                if (editTextBoldCursorArr != null) {
                    in0Var3.I1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f43536b.Y[2]);
                return;
            case 4:
                this.f43536b.x1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    in0 in0Var4 = this.f43536b;
                    if (i10 < in0Var4.f40279c0.getChildCount()) {
                        View childAt = in0Var4.f40279c0.getChildAt(i10);
                        if (childAt instanceof hn0) {
                            in0Var4.f40279c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        in0Var4.x1();
                        in0Var4.f40308q1.clear();
                        in0Var4.f40306p1.clear();
                        in0Var4.f40327y.values.clear();
                        in0Var4.R1();
                        return;
                    }
                }
            default:
                this.f43536b.finishFragment();
                return;
        }
    }
}
