package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class xk0 extends org.telegram.ui.ActionBar.j {

    public final org.telegram.ui.ActionBar.f1 f44476a;

    public final PasscodeActivity f44477b;

    public xk0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.f1 f1Var) {
        this.f44477b = passcodeActivity;
        this.f44476a = f1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f44477b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        if (i10 == 1) {
            passcodeActivity.f35578y = passcodeActivity.f35578y != 0 ? 0 : 1;
            AndroidUtilities.runOnUIThread(new ff0(12, this, this.f44476a), 150L);
            passcodeActivity.h.setText("");
            for (wr wrVar : passcodeActivity.f35573n.f43279f) {
                wrVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
