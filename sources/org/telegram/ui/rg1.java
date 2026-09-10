package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rg1 implements Runnable {
    public final int f36366a;
    public final TwoStepVerificationActivity f36367b;

    public rg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f36366a = i10;
        this.f36367b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f36366a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f36367b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f30709s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f30709s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f36367b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f36367b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f36367b;
                rg1 rg1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(rg1Var);
                AndroidUtilities.runOnUIThread(rg1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
