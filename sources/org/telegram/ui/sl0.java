package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class sl0 implements TextWatcher {
    public final int f41952a;
    public final PasscodeActivity f41953b;

    public sl0(PasscodeActivity passcodeActivity, int i10) {
        this.f41952a = i10;
        this.f41953b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f41952a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f41952a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f41953b;
                ol0 ol0Var = passcodeActivity.S;
                if (passcodeActivity.R) {
                    passcodeActivity.f33691n.removeCallbacks(ol0Var);
                    ol0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f41953b;
                ol0 ol0Var2 = passcodeActivity2.S;
                if (passcodeActivity2.R) {
                    passcodeActivity2.f33691n.removeCallbacks(ol0Var2);
                    ol0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41952a;
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
