package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xl0 implements Runnable {
    public final int f39652a;
    public final on0 f39653b;

    public xl0(on0 on0Var, int i10) {
        this.f39652a = i10;
        this.f39653b = on0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f39652a) {
            case 0:
                on0 on0Var = this.f39653b;
                ViewGroup[] viewGroupArr = on0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    on0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(on0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                on0 on0Var2 = this.f39653b;
                on0Var2.presentFragment(on0Var2.f36275h1, true);
                on0Var2.f36275h1 = null;
                return;
            case 2:
                on0 on0Var3 = this.f39653b;
                EditTextBoldCursor[] editTextBoldCursorArr = on0Var3.f36257a0;
                if (editTextBoldCursorArr != null) {
                    on0Var3.I1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f39653b.Y[2]);
                return;
            case 4:
                this.f39653b.x1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    on0 on0Var4 = this.f39653b;
                    if (i10 < on0Var4.f36263c0.getChildCount()) {
                        View childAt = on0Var4.f36263c0.getChildAt(i10);
                        if (childAt instanceof nn0) {
                            on0Var4.f36263c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        on0Var4.x1();
                        on0Var4.f36292q1.clear();
                        on0Var4.f36290p1.clear();
                        on0Var4.f36311y.values.clear();
                        on0Var4.Q1();
                        return;
                    }
                }
            default:
                this.f39653b.finishFragment();
                return;
        }
    }
}
