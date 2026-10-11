package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zg1 implements Runnable {
    public final int f44696a;
    public final hh1 f44697b;

    public zg1(hh1 hh1Var, int i10) {
        this.f44696a = i10;
        this.f44697b = hh1Var;
    }

    @Override
    public final void run() {
        switch (this.f44696a) {
            case 0:
                hh1 hh1Var = this.f44697b;
                EditTextBoldCursor editTextBoldCursor = hh1Var.f38462n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    hh1Var.f38462n.requestFocus();
                    AndroidUtilities.showKeyboard(hh1Var.f38462n);
                    return;
                }
                return;
            case 1:
                hh1 hh1Var2 = this.f44697b;
                be0 be0Var = hh1Var2.f38465w;
                if (be0Var != null && be0Var.getVisibility() == 0) {
                    hh1Var2.f38465w.f36484f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    ds[] dsVarArr = this.f44697b.f38465w.f36484f;
                    if (i10 < dsVarArr.length) {
                        dsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                hh1 hh1Var3 = this.f44697b;
                EditTextBoldCursor editTextBoldCursor2 = hh1Var3.f38462n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        hh1Var3.f38457f0[2].P(49);
                        hh1Var3.f38457f0[2].T(0.0f, false);
                        hh1Var3.f38447a.d();
                        return;
                    }
                    hh1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                hh1 hh1Var4 = this.f44697b;
                if (hh1Var4.f38458g0 != null) {
                    hh1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                hh1.f0(this.f44697b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new zg1(this.f44697b, 7), 150L);
                return;
            default:
                for (ds dsVar : this.f44697b.f38465w.f36484f) {
                    dsVar.i(0.0f);
                }
                return;
        }
    }
}
