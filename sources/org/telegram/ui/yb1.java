package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class yb1 implements Runnable {
    public final int f43815a;
    public final TwoStepVerificationActivity f43816b;

    public yb1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f43815a = i10;
        this.f43816b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f43815a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f43816b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f34135s) != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.i0.J3(twoStepVerificationActivity.f34135s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f43816b;
                yb1 yb1Var = twoStepVerificationActivity2.V;
                org.telegram.messenger.i0.r(yb1Var);
                org.telegram.messenger.i0.h3(yb1Var, 1500L);
                twoStepVerificationActivity2.U = true;
                return;
            case 2:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f43816b;
                twoStepVerificationActivity3.U = false;
                twoStepVerificationActivity3.f34136w.a(0.0f);
                return;
            default:
                this.f43816b.C0();
                return;
        }
    }
}
