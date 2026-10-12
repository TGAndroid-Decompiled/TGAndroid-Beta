package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ug1 implements Runnable {
    public final int f40679a;
    public final TwoStepVerificationActivity f40680b;

    public ug1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40679a = i10;
        this.f40680b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f40679a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f40680b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f32888s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f32888s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f40680b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f40680b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f40680b;
                ug1 ug1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(ug1Var);
                AndroidUtilities.runOnUIThread(ug1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
