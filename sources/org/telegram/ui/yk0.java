package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

public final class yk0 implements TextWatcher {

    public final int f44841a;

    public final PasscodeActivity f44842b;

    public yk0(PasscodeActivity passcodeActivity, int i10) {
        this.f44841a = i10;
        this.f44842b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f44841a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f44841a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f44842b;
                uk0 uk0Var = passcodeActivity.K;
                if (passcodeActivity.J) {
                    passcodeActivity.f35573n.removeCallbacks(uk0Var);
                    uk0Var.run();
                }
                break;
            default:
                PasscodeActivity passcodeActivity2 = this.f44842b;
                uk0 uk0Var2 = passcodeActivity2.K;
                if (passcodeActivity2.J) {
                    passcodeActivity2.f35573n.removeCallbacks(uk0Var2);
                    uk0Var2.run();
                }
                break;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f44841a;
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
