package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tl0 implements Runnable {
    public final int f37864a;
    public final jn0 f37865b;

    public tl0(jn0 jn0Var, int i10) {
        this.f37864a = i10;
        this.f37865b = jn0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f37864a) {
            case 0:
                jn0 jn0Var = this.f37865b;
                ViewGroup[] viewGroupArr = jn0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    jn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(jn0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                jn0 jn0Var2 = this.f37865b;
                jn0Var2.presentFragment(jn0Var2.f34786h1, true);
                jn0Var2.f34786h1 = null;
                return;
            case 2:
                jn0 jn0Var3 = this.f37865b;
                EditTextBoldCursor[] editTextBoldCursorArr = jn0Var3.f34768a0;
                if (editTextBoldCursorArr != null) {
                    jn0Var3.I1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f37865b.Y[2]);
                return;
            case 4:
                this.f37865b.x1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    jn0 jn0Var4 = this.f37865b;
                    if (i10 < jn0Var4.f34774c0.getChildCount()) {
                        View childAt = jn0Var4.f34774c0.getChildAt(i10);
                        if (childAt instanceof in0) {
                            jn0Var4.f34774c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        jn0Var4.x1();
                        jn0Var4.f34803q1.clear();
                        jn0Var4.f34801p1.clear();
                        jn0Var4.f34822y.values.clear();
                        jn0Var4.Q1();
                        return;
                    }
                }
            default:
                this.f37865b.finishFragment();
                return;
        }
    }
}
