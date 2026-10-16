package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class vl0 implements TextWatcher {
    public final int f40727a;
    public final PasscodeActivity f40728b;

    public vl0(PasscodeActivity passcodeActivity, int i10) {
        this.f40727a = i10;
        this.f40728b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f40727a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f40727a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f40728b;
                rl0 rl0Var = passcodeActivity.S;
                if (passcodeActivity.R) {
                    passcodeActivity.f31879n.removeCallbacks(rl0Var);
                    rl0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f40728b;
                rl0 rl0Var2 = passcodeActivity2.S;
                if (passcodeActivity2.R) {
                    passcodeActivity2.f31879n.removeCallbacks(rl0Var2);
                    rl0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f40727a;
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
