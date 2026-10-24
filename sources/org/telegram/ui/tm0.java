package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tm0 implements TextWatcher {
    public final int f42089a;
    public final vm0 f42090b;

    public tm0(vm0 vm0Var, int i10) {
        this.f42090b = vm0Var;
        this.f42089a = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        vm0 vm0Var = this.f42090b;
        if (!vm0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.f42089a;
            if (length > 1) {
                String obj = editable.toString();
                vm0Var.H = true;
                for (int i11 = 0; i11 < Math.min(vm0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        vm0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                vm0Var.H = false;
            }
            if (i10 != vm0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = vm0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                vm0Var.d[i12].requestFocus();
            }
            int i13 = vm0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = vm0Var.getCode();
                if (code.length() == vm0Var.O) {
                    vm0Var.h(null);
                }
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
