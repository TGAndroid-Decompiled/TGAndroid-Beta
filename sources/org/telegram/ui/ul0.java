package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ul0 implements Runnable {
    public final int f41293a;
    public final kn0 f41294b;

    public ul0(kn0 kn0Var, int i10) {
        this.f41293a = i10;
        this.f41294b = kn0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f41293a) {
            case 0:
                kn0 kn0Var = this.f41294b;
                ViewGroup[] viewGroupArr = kn0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    kn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(kn0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                kn0 kn0Var2 = this.f41294b;
                kn0Var2.presentFragment(kn0Var2.f38097h1, true);
                kn0Var2.f38097h1 = null;
                return;
            case 2:
                kn0 kn0Var3 = this.f41294b;
                EditTextBoldCursor[] editTextBoldCursorArr = kn0Var3.f38078a0;
                if (editTextBoldCursorArr != null) {
                    kn0Var3.I1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f41294b.Y[2]);
                return;
            case 4:
                this.f41294b.x1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    kn0 kn0Var4 = this.f41294b;
                    if (i10 < kn0Var4.f38084c0.getChildCount()) {
                        View childAt = kn0Var4.f38084c0.getChildAt(i10);
                        if (childAt instanceof jn0) {
                            kn0Var4.f38084c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        kn0Var4.x1();
                        kn0Var4.f38114q1.clear();
                        kn0Var4.f38112p1.clear();
                        kn0Var4.f38133y.values.clear();
                        kn0Var4.Q1();
                        return;
                    }
                }
            default:
                this.f41294b.finishFragment();
                return;
        }
    }
}
