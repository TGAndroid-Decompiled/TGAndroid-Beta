package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xk0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.g1 f44536a;
    public final PasscodeActivity f44537b;

    public xk0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.g1 g1Var) {
        this.f44537b = passcodeActivity;
        this.f44536a = g1Var;
    }

    @Override
    public final void b(int i9) {
        PasscodeActivity passcodeActivity = this.f44537b;
        if (i9 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i10 = 1;
        if (i9 == 1) {
            if (passcodeActivity.f35575y != 0) {
                i10 = 0;
            }
            passcodeActivity.f35575y = i10;
            AndroidUtilities.runOnUIThread(new cf0(12, this, this.f44536a), 150L);
            passcodeActivity.h.setText("");
            for (vr vrVar : passcodeActivity.f35570n.f42755f) {
                vrVar.setText("");
            }
            passcodeActivity.k0();
        }
    }
}
