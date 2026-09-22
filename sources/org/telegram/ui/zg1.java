package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zg1 implements Runnable {
    public final int f40201a;
    public final hh1 f40202b;

    public zg1(hh1 hh1Var, int i10) {
        this.f40201a = i10;
        this.f40202b = hh1Var;
    }

    @Override
    public final void run() {
        switch (this.f40201a) {
            case 0:
                hh1 hh1Var = this.f40202b;
                EditTextBoldCursor editTextBoldCursor = hh1Var.f34282n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    hh1Var.f34282n.requestFocus();
                    AndroidUtilities.showKeyboard(hh1Var.f34282n);
                    return;
                }
                return;
            case 1:
                hh1 hh1Var2 = this.f40202b;
                de0 de0Var = hh1Var2.f34285w;
                if (de0Var != null && de0Var.getVisibility() == 0) {
                    hh1Var2.f34285w.f33081f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    gs[] gsVarArr = this.f40202b.f34285w.f33081f;
                    if (i10 < gsVarArr.length) {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                hh1 hh1Var3 = this.f40202b;
                EditTextBoldCursor editTextBoldCursor2 = hh1Var3.f34282n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        hh1Var3.f34277f0[2].P(49);
                        hh1Var3.f34277f0[2].T(0.0f, false);
                        hh1Var3.f34268a.d();
                        return;
                    }
                    hh1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                hh1 hh1Var4 = this.f40202b;
                if (hh1Var4.f34278g0 != null) {
                    hh1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                hh1.f0(this.f40202b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new zg1(this.f40202b, 7), 150L);
                return;
            default:
                for (gs gsVar : this.f40202b.f34285w.f33081f) {
                    gsVar.i(0.0f);
                }
                return;
        }
    }
}
