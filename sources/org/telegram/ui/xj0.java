package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xj0 implements Runnable {
    public final int f43591a;
    public final ll0 f43592b;

    public xj0(ll0 ll0Var, int i10) {
        this.f43591a = i10;
        this.f43592b = ll0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f43591a) {
            case 0:
                ll0 ll0Var = this.f43592b;
                ViewGroup[] viewGroupArr = ll0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    ll0Var.Y[0].requestFocus();
                    org.telegram.messenger.i0.J3(ll0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                ll0 ll0Var2 = this.f43592b;
                ll0Var2.presentFragment(ll0Var2.f39276h1, true);
                ll0Var2.f39276h1 = null;
                return;
            case 2:
                ll0 ll0Var3 = this.f43592b;
                EditTextBoldCursor[] editTextBoldCursorArr = ll0Var3.f39258a0;
                if (editTextBoldCursorArr != null) {
                    ll0Var3.L1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.i0.J3(this.f43592b.Y[2]);
                return;
            case 4:
                this.f43592b.A1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    ll0 ll0Var4 = this.f43592b;
                    if (i10 < ll0Var4.f39264c0.getChildCount()) {
                        View childAt = ll0Var4.f39264c0.getChildAt(i10);
                        if (childAt instanceof kl0) {
                            ll0Var4.f39264c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        ll0Var4.A1();
                        ll0Var4.f39293q1.clear();
                        ll0Var4.f39291p1.clear();
                        ll0Var4.D.values.clear();
                        ll0Var4.U1();
                        return;
                    }
                }
            default:
                this.f43592b.finishFragment();
                return;
        }
    }
}
