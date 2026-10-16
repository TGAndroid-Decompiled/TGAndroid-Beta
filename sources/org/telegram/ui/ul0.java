package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ul0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.e1 f40427a;
    public final PasscodeActivity f40428b;

    public ul0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.e1 e1Var) {
        this.f40428b = passcodeActivity;
        this.f40427a = e1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f40428b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f31884y != 0) {
                i11 = 0;
            }
            passcodeActivity.f31884y = i11;
            AndroidUtilities.runOnUIThread(new se0(20, this, this.f40427a), 150L);
            passcodeActivity.h.setText("");
            for (ks ksVar : passcodeActivity.f31879n.f36645f) {
                ksVar.setText("");
            }
            passcodeActivity.o0();
        }
    }
}
