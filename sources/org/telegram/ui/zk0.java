package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zk0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.e1 f43772a;
    public final PasscodeActivity f43773b;

    public zk0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.e1 e1Var) {
        this.f43773b = passcodeActivity;
        this.f43772a = e1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f43773b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f33234y != 0) {
                i11 = 0;
            }
            passcodeActivity.f33234y = i11;
            AndroidUtilities.runOnUIThread(new xg0(8, this, this.f43772a), 150L);
            passcodeActivity.h.setText("");
            for (tr trVar : passcodeActivity.f33229n.f40959f) {
                trVar.setText("");
            }
            passcodeActivity.o0();
        }
    }
}
