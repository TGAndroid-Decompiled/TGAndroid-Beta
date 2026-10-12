package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class xl0 implements TextWatcher {
    public final int f41894a;
    public final PasscodeActivity f41895b;

    public xl0(PasscodeActivity passcodeActivity, int i10) {
        this.f41894a = i10;
        this.f41895b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f41894a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f41894a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f41895b;
                sl0 sl0Var = passcodeActivity.S;
                if (passcodeActivity.R) {
                    passcodeActivity.f32177n.removeCallbacks(sl0Var);
                    sl0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f41895b;
                sl0 sl0Var2 = passcodeActivity2.S;
                if (passcodeActivity2.R) {
                    passcodeActivity2.f32177n.removeCallbacks(sl0Var2);
                    sl0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41894a;
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
