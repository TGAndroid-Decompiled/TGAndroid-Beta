package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zg1 implements Runnable {
    public final int f43431a;
    public final hh1 f43432b;

    public zg1(hh1 hh1Var, int i10) {
        this.f43431a = i10;
        this.f43432b = hh1Var;
    }

    @Override
    public final void run() {
        switch (this.f43431a) {
            case 0:
                hh1 hh1Var = this.f43432b;
                EditTextBoldCursor editTextBoldCursor = hh1Var.f37017n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    hh1Var.f37017n.requestFocus();
                    AndroidUtilities.showKeyboard(hh1Var.f37017n);
                    return;
                }
                return;
            case 1:
                hh1 hh1Var2 = this.f43432b;
                de0 de0Var = hh1Var2.f37020w;
                if (de0Var != null && de0Var.getVisibility() == 0) {
                    hh1Var2.f37020w.f36163f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    gs[] gsVarArr = this.f43432b.f37020w.f36163f;
                    if (i10 < gsVarArr.length) {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                hh1 hh1Var3 = this.f43432b;
                EditTextBoldCursor editTextBoldCursor2 = hh1Var3.f37017n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        hh1Var3.f37012f0[2].N(49);
                        hh1Var3.f37012f0[2].Q(0.0f, false);
                        hh1Var3.f37002a.d();
                        return;
                    }
                    hh1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                hh1 hh1Var4 = this.f43432b;
                if (hh1Var4.f37013g0 != null) {
                    hh1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                hh1.f0(this.f43432b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new zg1(this.f43432b, 7), 150L);
                return;
            default:
                for (gs gsVar : this.f43432b.f37020w.f36163f) {
                    gsVar.i(0.0f);
                }
                return;
        }
    }
}
