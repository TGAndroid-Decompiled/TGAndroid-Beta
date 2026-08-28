package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class yk0 implements TextWatcher {
    public final int f44894a;
    public final PasscodeActivity f44895b;

    public yk0(PasscodeActivity passcodeActivity, int i9) {
        this.f44894a = i9;
        this.f44895b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i9 = this.f44894a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        switch (this.f44894a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f44895b;
                uk0 uk0Var = passcodeActivity.K;
                if (passcodeActivity.J) {
                    passcodeActivity.f35570n.removeCallbacks(uk0Var);
                    uk0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f44895b;
                uk0 uk0Var2 = passcodeActivity2.K;
                if (passcodeActivity2.J) {
                    passcodeActivity2.f35570n.removeCallbacks(uk0Var2);
                    uk0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.f44894a;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
