package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class rl0 implements TextWatcher {
    public final int f41454a;
    public final PasscodeActivity f41455b;

    public rl0(PasscodeActivity passcodeActivity, int i10) {
        this.f41454a = i10;
        this.f41455b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f41454a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f41454a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f41455b;
                nl0 nl0Var = passcodeActivity.S;
                if (passcodeActivity.R) {
                    passcodeActivity.f33854n.removeCallbacks(nl0Var);
                    nl0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f41455b;
                nl0 nl0Var2 = passcodeActivity2.S;
                if (passcodeActivity2.R) {
                    passcodeActivity2.f33854n.removeCallbacks(nl0Var2);
                    nl0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41454a;
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
