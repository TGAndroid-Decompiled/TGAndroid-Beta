package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zk0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.e1 f43766a;
    public final PasscodeActivity f43767b;

    public zk0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.e1 e1Var) {
        this.f43767b = passcodeActivity;
        this.f43766a = e1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f43767b;
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
            AndroidUtilities.runOnUIThread(new xg0(8, this, this.f43766a), 150L);
            passcodeActivity.h.setText("");
            for (tr trVar : passcodeActivity.f33223n.f40953f) {
                trVar.setText("");
            }
            passcodeActivity.o0();
        }
    }
}
