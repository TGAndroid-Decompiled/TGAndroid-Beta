package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zk0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.e1 f43764a;
    public final PasscodeActivity f43765b;

    public zk0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.e1 e1Var) {
        this.f43765b = passcodeActivity;
        this.f43764a = e1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f43765b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f33228y != 0) {
                i11 = 0;
            }
            passcodeActivity.f33228y = i11;
            AndroidUtilities.runOnUIThread(new wg0(8, this, this.f43764a), 150L);
            passcodeActivity.h.setText("");
            for (tr trVar : passcodeActivity.f33223n.f40961f) {
                trVar.setText("");
            }
            passcodeActivity.o0();
        }
    }
}
