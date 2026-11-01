package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class wb1 implements Runnable {
    public final int f42751a;
    public final TwoStepVerificationActivity f42752b;

    public wb1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f42751a = i10;
        this.f42752b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f42751a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f42752b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f34142s) != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.i0.J3(twoStepVerificationActivity.f34142s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f42752b;
                wb1 wb1Var = twoStepVerificationActivity2.V;
                org.telegram.messenger.i0.r(wb1Var);
                org.telegram.messenger.i0.h3(wb1Var, 1500L);
                twoStepVerificationActivity2.U = true;
                return;
            case 2:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f42752b;
                twoStepVerificationActivity3.U = false;
                twoStepVerificationActivity3.f34143w.a(0.0f);
                return;
            default:
                this.f42752b.D0();
                return;
        }
    }
}
