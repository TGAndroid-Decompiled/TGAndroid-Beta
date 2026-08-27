package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class rf1 implements Runnable {

    public final int f41926a;

    public final zf1 f41927b;

    public rf1(zf1 zf1Var, int i10) {
        this.f41926a = i10;
        this.f41927b = zf1Var;
    }

    @Override
    public final void run() {
        switch (this.f41926a) {
            case 0:
                zf1 zf1Var = this.f41927b;
                EditTextBoldCursor editTextBoldCursor = zf1Var.f45172n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    zf1Var.f45172n.requestFocus();
                    AndroidUtilities.showKeyboard(zf1Var.f45172n);
                    break;
                }
                break;
            case 1:
                zf1 zf1Var2 = this.f41927b;
                od0 od0Var = zf1Var2.f45175w;
                if (od0Var != null && od0Var.getVisibility() == 0) {
                    zf1Var2.f45175w.f43279f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    wr[] wrVarArr = this.f41927b.f45175w.f43279f;
                    if (i10 < wrVarArr.length) {
                        wrVarArr[i10].i(0.0f);
                        i10++;
                    }
                    break;
                }
                break;
            case 3:
                zf1 zf1Var3 = this.f41927b;
                EditTextBoldCursor editTextBoldCursor2 = zf1Var3.f45172n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        zf1Var3.f45164b0[2].N(49);
                        zf1Var3.f45164b0[2].Q(0.0f, false);
                        zf1Var3.f45161a.d();
                    } else {
                        zf1Var3.F0(true);
                    }
                    break;
                }
                break;
            case 4:
                zf1 zf1Var4 = this.f41927b;
                if (zf1Var4.f45166c0 != null) {
                    zf1Var4.F0(false);
                    break;
                }
                break;
            case 5:
                zf1.f0(this.f41927b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new rf1(this.f41927b, 7), 150L);
                break;
            default:
                for (wr wrVar : this.f41927b.f45175w.f43279f) {
                    wrVar.i(0.0f);
                }
                break;
        }
    }
}
