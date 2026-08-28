package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sf1 implements Runnable {
    public final int f42688a;
    public final ag1 f42689b;

    public sf1(ag1 ag1Var, int i9) {
        this.f42688a = i9;
        this.f42689b = ag1Var;
    }

    @Override
    public final void run() {
        switch (this.f42688a) {
            case 0:
                ag1 ag1Var = this.f42689b;
                EditTextBoldCursor editTextBoldCursor = ag1Var.f36492n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    ag1Var.f36492n.requestFocus();
                    AndroidUtilities.showKeyboard(ag1Var.f36492n);
                    return;
                }
                return;
            case 1:
                ag1 ag1Var2 = this.f42689b;
                ld0 ld0Var = ag1Var2.f36495w;
                if (ld0Var != null && ld0Var.getVisibility() == 0) {
                    ag1Var2.f36495w.f42755f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i9 = 0;
                while (true) {
                    vr[] vrVarArr = this.f42689b.f36495w.f42755f;
                    if (i9 < vrVarArr.length) {
                        vrVarArr[i9].i(0.0f);
                        i9++;
                    } else {
                        return;
                    }
                }
            case 3:
                ag1 ag1Var3 = this.f42689b;
                EditTextBoldCursor editTextBoldCursor2 = ag1Var3.f36492n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        ag1Var3.f36484b0[2].N(49);
                        ag1Var3.f36484b0[2].Q(0.0f, false);
                        ag1Var3.f36481a.d();
                        return;
                    }
                    ag1Var3.E0(true);
                    return;
                }
                return;
            case 4:
                ag1 ag1Var4 = this.f42689b;
                if (ag1Var4.f36486c0 != null) {
                    ag1Var4.E0(false);
                    return;
                }
                return;
            case 5:
                ag1.e0(this.f42689b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new sf1(this.f42689b, 7), 150L);
                return;
            default:
                for (vr vrVar : this.f42689b.f36495w.f42755f) {
                    vrVar.i(0.0f);
                }
                return;
        }
    }
}
