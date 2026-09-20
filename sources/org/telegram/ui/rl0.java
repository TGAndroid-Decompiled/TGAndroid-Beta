package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class rl0 implements TextWatcher {
    public final int f37179a;
    public final PasscodeActivity f37180b;

    public rl0(PasscodeActivity passcodeActivity, int i10) {
        this.f37179a = i10;
        this.f37180b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f37179a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f37179a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f37180b;
                ml0 ml0Var = passcodeActivity.O;
                if (passcodeActivity.N) {
                    passcodeActivity.f31172n.removeCallbacks(ml0Var);
                    ml0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f37180b;
                ml0 ml0Var2 = passcodeActivity2.O;
                if (passcodeActivity2.N) {
                    passcodeActivity2.f31172n.removeCallbacks(ml0Var2);
                    ml0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f37179a;
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
