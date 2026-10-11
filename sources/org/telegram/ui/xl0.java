package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xl0 implements Runnable {
    public final int f44137a;
    public final mn0 f44138b;

    public xl0(mn0 mn0Var, int i10) {
        this.f44137a = i10;
        this.f44138b = mn0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f44137a) {
            case 0:
                mn0 mn0Var = this.f44138b;
                ViewGroup[] viewGroupArr = mn0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    mn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(mn0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                mn0 mn0Var2 = this.f44138b;
                mn0Var2.presentFragment(mn0Var2.f40036h1, true);
                mn0Var2.f40036h1 = null;
                return;
            case 2:
                mn0 mn0Var3 = this.f44138b;
                EditTextBoldCursor[] editTextBoldCursorArr = mn0Var3.f40017a0;
                if (editTextBoldCursorArr != null) {
                    mn0Var3.H1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f44138b.Y[2]);
                return;
            case 4:
                this.f44138b.w1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    mn0 mn0Var4 = this.f44138b;
                    if (i10 < mn0Var4.f40023c0.getChildCount()) {
                        View childAt = mn0Var4.f40023c0.getChildAt(i10);
                        if (childAt instanceof ln0) {
                            mn0Var4.f40023c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        mn0Var4.w1();
                        mn0Var4.f40053q1.clear();
                        mn0Var4.f40051p1.clear();
                        mn0Var4.f40072y.values.clear();
                        mn0Var4.P1();
                        return;
                    }
                }
            default:
                this.f44138b.finishFragment();
                return;
        }
    }
}
