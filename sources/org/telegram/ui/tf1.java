package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tf1 implements Runnable {
    public final int f38654a;
    public final TwoStepVerificationActivity f38655b;

    public tf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f38654a = i10;
        this.f38655b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f38654a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f38655b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.E && (editTextBoldCursor = twoStepVerificationActivity.f32376s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f32376s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f38655b;
                twoStepVerificationActivity2.R = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f38655b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f38655b;
                tf1 tf1Var = twoStepVerificationActivity3.S;
                AndroidUtilities.cancelRunOnUIThread(tf1Var);
                AndroidUtilities.runOnUIThread(tf1Var, 1500L);
                twoStepVerificationActivity3.R = true;
                return;
        }
    }
}
