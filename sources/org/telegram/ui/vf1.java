package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vf1 implements Runnable {
    public final int f42226a;
    public final TwoStepVerificationActivity f42227b;

    public vf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f42226a = i10;
        this.f42227b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f42226a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f42227b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.E && (editTextBoldCursor = twoStepVerificationActivity.f34918s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f34918s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f42227b;
                twoStepVerificationActivity2.R = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f42227b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f42227b;
                vf1 vf1Var = twoStepVerificationActivity3.S;
                AndroidUtilities.cancelRunOnUIThread(vf1Var);
                AndroidUtilities.runOnUIThread(vf1Var, 1500L);
                twoStepVerificationActivity3.R = true;
                return;
        }
    }
}
