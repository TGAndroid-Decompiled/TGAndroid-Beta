package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zg1 implements Runnable {
    public final int f43458a;
    public final hh1 f43459b;

    public zg1(hh1 hh1Var, int i10) {
        this.f43458a = i10;
        this.f43459b = hh1Var;
    }

    @Override
    public final void run() {
        switch (this.f43458a) {
            case 0:
                hh1 hh1Var = this.f43459b;
                EditTextBoldCursor editTextBoldCursor = hh1Var.f37044n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    hh1Var.f37044n.requestFocus();
                    AndroidUtilities.showKeyboard(hh1Var.f37044n);
                    return;
                }
                return;
            case 1:
                hh1 hh1Var2 = this.f43459b;
                de0 de0Var = hh1Var2.f37047w;
                if (de0Var != null && de0Var.getVisibility() == 0) {
                    hh1Var2.f37047w.f36190f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    gs[] gsVarArr = this.f43459b.f37047w.f36190f;
                    if (i10 < gsVarArr.length) {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                hh1 hh1Var3 = this.f43459b;
                EditTextBoldCursor editTextBoldCursor2 = hh1Var3.f37044n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        hh1Var3.f37039f0[2].N(49);
                        hh1Var3.f37039f0[2].Q(0.0f, false);
                        hh1Var3.f37029a.d();
                        return;
                    }
                    hh1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                hh1 hh1Var4 = this.f43459b;
                if (hh1Var4.f37040g0 != null) {
                    hh1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                hh1.f0(this.f43459b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new zg1(this.f43459b, 7), 150L);
                return;
            default:
                for (gs gsVar : this.f43459b.f37047w.f36190f) {
                    gsVar.i(0.0f);
                }
                return;
        }
    }
}
