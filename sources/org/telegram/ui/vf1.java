package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vf1 implements Runnable {
    public final int f44795a;
    public final dg1 f44796b;

    public vf1(dg1 dg1Var, int i10) {
        this.f44795a = i10;
        this.f44796b = dg1Var;
    }

    @Override
    public final void run() {
        switch (this.f44795a) {
            case 0:
                dg1 dg1Var = this.f44796b;
                EditTextBoldCursor editTextBoldCursor = dg1Var.f38876n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    dg1Var.f38876n.requestFocus();
                    AndroidUtilities.showKeyboard(dg1Var.f38876n);
                    return;
                }
                return;
            case 1:
                dg1 dg1Var2 = this.f44796b;
                ld0 ld0Var = dg1Var2.f38879w;
                if (ld0Var != null && ld0Var.getVisibility() == 0) {
                    dg1Var2.f38879w.f44894f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    xr[] xrVarArr = this.f44796b.f38879w.f44894f;
                    if (i10 < xrVarArr.length) {
                        xrVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                dg1 dg1Var3 = this.f44796b;
                EditTextBoldCursor editTextBoldCursor2 = dg1Var3.f38876n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        dg1Var3.f38871f0[2].P(49);
                        dg1Var3.f38871f0[2].T(0.0f, false);
                        dg1Var3.f38862a.d();
                        return;
                    }
                    dg1Var3.G0(true);
                    return;
                }
                return;
            case 4:
                dg1 dg1Var4 = this.f44796b;
                if (dg1Var4.f38872g0 != null) {
                    dg1Var4.G0(false);
                    return;
                }
                return;
            case 5:
                dg1.g0(this.f44796b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new vf1(this.f44796b, 7), 150L);
                return;
            default:
                for (xr xrVar : this.f44796b.f38879w.f44894f) {
                    xrVar.i(0.0f);
                }
                return;
        }
    }
}
