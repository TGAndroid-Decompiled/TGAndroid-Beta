package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class tk0 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.ActionBar.g1 f42722a;
    public final PasscodeActivity f42723b;

    public tk0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.g1 g1Var) {
        this.f42723b = passcodeActivity;
        this.f42722a = g1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f42723b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f35642y != 0) {
                i11 = 0;
            }
            passcodeActivity.f35642y = i11;
            AndroidUtilities.runOnUIThread(new lf0(9, this, this.f42722a), 150L);
            passcodeActivity.h.setText("");
            for (ur urVar : passcodeActivity.f35637n.f42455f) {
                urVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
