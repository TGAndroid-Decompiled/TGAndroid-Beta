package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class si0 implements Runnable {
    public final int f52093a;
    public final fk0 f52094b;

    public si0(fk0 fk0Var, int i7) {
        this.f52093a = i7;
        this.f52094b = fk0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f52093a) {
            case 0:
                fk0 fk0Var = this.f52094b;
                ViewGroup[] viewGroupArr = fk0Var.f47852a0;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    fk0Var.Z[0].requestFocus();
                    org.telegram.messenger.g0.I3(fk0Var.Z[0]);
                    return;
                }
                return;
            case 1:
                fk0 fk0Var2 = this.f52094b;
                fk0Var2.presentFragment(fk0Var2.f47873i1, true);
                fk0Var2.f47873i1 = null;
                return;
            case 2:
                fk0 fk0Var3 = this.f52094b;
                EditTextBoldCursor[] editTextBoldCursorArr = fk0Var3.f47855b0;
                if (editTextBoldCursorArr != null) {
                    fk0Var3.M1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.I3(this.f52094b.Z[2]);
                return;
            case 4:
                this.f52094b.B1();
                return;
            case 5:
                int i7 = 0;
                while (true) {
                    fk0 fk0Var4 = this.f52094b;
                    if (i7 < fk0Var4.f47860d0.getChildCount()) {
                        View childAt = fk0Var4.f47860d0.getChildAt(i7);
                        if (childAt instanceof ek0) {
                            fk0Var4.f47860d0.removeView(childAt);
                            i7--;
                        }
                        i7++;
                    } else {
                        fk0Var4.B1();
                        fk0Var4.f47890r1.clear();
                        fk0Var4.f47887q1.clear();
                        fk0Var4.E.values.clear();
                        fk0Var4.V1();
                        return;
                    }
                }
            default:
                this.f52094b.finishFragment();
                return;
        }
    }
}
