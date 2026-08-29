package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class uk0 implements TextWatcher {
    public final int f43280a;
    public final PasscodeActivity f43281b;

    public uk0(PasscodeActivity passcodeActivity, int i10) {
        this.f43280a = i10;
        this.f43281b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f43280a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f43280a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f43281b;
                qk0 qk0Var = passcodeActivity.K;
                if (passcodeActivity.J) {
                    passcodeActivity.f35637n.removeCallbacks(qk0Var);
                    qk0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f43281b;
                qk0 qk0Var2 = passcodeActivity2.K;
                if (passcodeActivity2.J) {
                    passcodeActivity2.f35637n.removeCallbacks(qk0Var2);
                    qk0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f43280a;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
