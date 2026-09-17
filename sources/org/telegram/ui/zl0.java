package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zl0 implements Runnable {
    public final int f40269a;
    public final qn0 f40270b;

    public zl0(qn0 qn0Var, int i10) {
        this.f40269a = i10;
        this.f40270b = qn0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f40269a) {
            case 0:
                qn0 qn0Var = this.f40270b;
                ViewGroup[] viewGroupArr = qn0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    qn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(qn0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                qn0 qn0Var2 = this.f40270b;
                qn0Var2.presentFragment(qn0Var2.f36961h1, true);
                qn0Var2.f36961h1 = null;
                return;
            case 2:
                qn0 qn0Var3 = this.f40270b;
                EditTextBoldCursor[] editTextBoldCursorArr = qn0Var3.f36943a0;
                if (editTextBoldCursorArr != null) {
                    qn0Var3.I1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f40270b.Y[2]);
                return;
            case 4:
                this.f40270b.x1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    qn0 qn0Var4 = this.f40270b;
                    if (i10 < qn0Var4.f36949c0.getChildCount()) {
                        View childAt = qn0Var4.f36949c0.getChildAt(i10);
                        if (childAt instanceof pn0) {
                            qn0Var4.f36949c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        qn0Var4.x1();
                        qn0Var4.f36978q1.clear();
                        qn0Var4.f36976p1.clear();
                        qn0Var4.f36997y.values.clear();
                        qn0Var4.Q1();
                        return;
                    }
                }
            default:
                this.f40270b.finishFragment();
                return;
        }
    }
}
