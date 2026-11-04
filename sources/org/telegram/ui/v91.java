package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class v91 implements Runnable {
    public final int f50433a;
    public final TwoStepVerificationActivity f50434b;

    public v91(TwoStepVerificationActivity twoStepVerificationActivity, int i3) {
        this.f50433a = i3;
        this.f50434b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f50433a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f50434b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.I && (editTextBoldCursor = twoStepVerificationActivity.f42093s) != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(twoStepVerificationActivity.f42093s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f50434b;
                v91 v91Var = twoStepVerificationActivity2.W;
                org.telegram.messenger.g0.r(v91Var);
                org.telegram.messenger.g0.i3(v91Var, 1500L);
                twoStepVerificationActivity2.V = true;
                return;
            case 2:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f50434b;
                twoStepVerificationActivity3.V = false;
                twoStepVerificationActivity3.f42094w.a(0.0f);
                return;
            default:
                this.f50434b.D0();
                return;
        }
    }
}
