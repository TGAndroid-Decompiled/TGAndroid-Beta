package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.e1 f41616a;
    public final PasscodeActivity f41617b;

    public wl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.e1 e1Var) {
        this.f41617b = passcodeActivity;
        this.f41616a = e1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f41617b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f32182y != 0) {
                i11 = 0;
            }
            passcodeActivity.f32182y = i11;
            AndroidUtilities.runOnUIThread(new wc0(25, this, this.f41616a), 150L);
            passcodeActivity.h.setText("");
            for (ks ksVar : passcodeActivity.f32177n.f36949f) {
                ksVar.setText("");
            }
            passcodeActivity.o0();
        }
    }
}
