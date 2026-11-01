package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vj0 implements Runnable {
    public final int f42559a;
    public final jl0 f42560b;

    public vj0(jl0 jl0Var, int i10) {
        this.f42559a = i10;
        this.f42560b = jl0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f42559a) {
            case 0:
                jl0 jl0Var = this.f42560b;
                ViewGroup[] viewGroupArr = jl0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    jl0Var.Y[0].requestFocus();
                    org.telegram.messenger.i0.J3(jl0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                jl0 jl0Var2 = this.f42560b;
                jl0Var2.presentFragment(jl0Var2.f38428h1, true);
                jl0Var2.f38428h1 = null;
                return;
            case 2:
                jl0 jl0Var3 = this.f42560b;
                EditTextBoldCursor[] editTextBoldCursorArr = jl0Var3.f38410a0;
                if (editTextBoldCursorArr != null) {
                    jl0Var3.M1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.i0.J3(this.f42560b.Y[2]);
                return;
            case 4:
                this.f42560b.B1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    jl0 jl0Var4 = this.f42560b;
                    if (i10 < jl0Var4.f38416c0.getChildCount()) {
                        View childAt = jl0Var4.f38416c0.getChildAt(i10);
                        if (childAt instanceof il0) {
                            jl0Var4.f38416c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        jl0Var4.B1();
                        jl0Var4.f38445q1.clear();
                        jl0Var4.f38443p1.clear();
                        jl0Var4.D.values.clear();
                        jl0Var4.V1();
                        return;
                    }
                }
            default:
                this.f42560b.finishFragment();
                return;
        }
    }
}
