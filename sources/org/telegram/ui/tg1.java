package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tg1 implements Runnable {
    public final int f40110a;
    public final TwoStepVerificationActivity f40111b;

    public tg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40110a = i10;
        this.f40111b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f40110a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f40111b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f32590s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f32590s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f40111b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f40111b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f40111b;
                tg1 tg1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(tg1Var);
                AndroidUtilities.runOnUIThread(tg1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
