package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class rl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.e1 f41675a;
    public final PasscodeActivity f41676b;

    public rl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.e1 e1Var) {
        this.f41676b = passcodeActivity;
        this.f41675a = e1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f41676b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f33696y != 0) {
                i11 = 0;
            }
            passcodeActivity.f33696y = i11;
            AndroidUtilities.runOnUIThread(new og0(11, this, this.f41675a), 150L);
            passcodeActivity.h.setText("");
            for (hs hsVar : passcodeActivity.f33691n.f37837f) {
                hsVar.setText("");
            }
            passcodeActivity.o0();
        }
    }
}
