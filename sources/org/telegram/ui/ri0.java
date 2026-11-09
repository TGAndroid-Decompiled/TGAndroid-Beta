package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ri0 implements Runnable {
    public final int f49490a;
    public final dk0 f49491b;

    public ri0(dk0 dk0Var, int i7) {
        this.f49490a = i7;
        this.f49491b = dk0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f49490a) {
            case 0:
                dk0 dk0Var = this.f49491b;
                ViewGroup[] viewGroupArr = dk0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    dk0Var.Y[0].requestFocus();
                    org.telegram.messenger.g0.K3(dk0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                dk0 dk0Var2 = this.f49491b;
                dk0Var2.presentFragment(dk0Var2.f45011h1, true);
                dk0Var2.f45011h1 = null;
                return;
            case 2:
                dk0 dk0Var3 = this.f49491b;
                EditTextBoldCursor[] editTextBoldCursorArr = dk0Var3.f44992a0;
                if (editTextBoldCursorArr != null) {
                    dk0Var3.M1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.K3(this.f49491b.Y[2]);
                return;
            case 4:
                this.f49491b.B1();
                return;
            case 5:
                int i7 = 0;
                while (true) {
                    dk0 dk0Var4 = this.f49491b;
                    if (i7 < dk0Var4.f44998c0.getChildCount()) {
                        View childAt = dk0Var4.f44998c0.getChildAt(i7);
                        if (childAt instanceof ck0) {
                            dk0Var4.f44998c0.removeView(childAt);
                            i7--;
                        }
                        i7++;
                    } else {
                        dk0Var4.B1();
                        dk0Var4.f45027q1.clear();
                        dk0Var4.f45025p1.clear();
                        dk0Var4.D.values.clear();
                        dk0Var4.V1();
                        return;
                    }
                }
            default:
                this.f49491b.finishFragment();
                return;
        }
    }
}
