package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rg1 implements Runnable {
    public final int f37125a;
    public final zg1 f37126b;

    public rg1(zg1 zg1Var, int i10) {
        this.f37125a = i10;
        this.f37126b = zg1Var;
    }

    @Override
    public final void run() {
        switch (this.f37125a) {
            case 0:
                zg1 zg1Var = this.f37126b;
                EditTextBoldCursor editTextBoldCursor = zg1Var.f40518n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    zg1Var.f40518n.requestFocus();
                    AndroidUtilities.showKeyboard(zg1Var.f40518n);
                    return;
                }
                return;
            case 1:
                zg1 zg1Var2 = this.f37126b;
                ae0 ae0Var = zg1Var2.f40521w;
                if (ae0Var != null && ae0Var.getVisibility() == 0) {
                    zg1Var2.f40521w.f32431f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    ds[] dsVarArr = this.f37126b.f40521w.f32431f;
                    if (i10 < dsVarArr.length) {
                        dsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                zg1 zg1Var3 = this.f37126b;
                EditTextBoldCursor editTextBoldCursor2 = zg1Var3.f40518n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        zg1Var3.f40513f0[2].P(49);
                        zg1Var3.f40513f0[2].T(0.0f, false);
                        zg1Var3.f40504a.d();
                        return;
                    }
                    zg1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                zg1 zg1Var4 = this.f37126b;
                if (zg1Var4.f40514g0 != null) {
                    zg1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                zg1.f0(this.f37126b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new rg1(this.f37126b, 7), 150L);
                return;
            default:
                for (ds dsVar : this.f37126b.f40521w.f32431f) {
                    dsVar.i(0.0f);
                }
                return;
        }
    }
}
