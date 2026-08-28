package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qm0 implements TextWatcher {
    public final int f41837a;
    public final sm0 f41838b;

    public qm0(sm0 sm0Var, int i9) {
        this.f41838b = sm0Var;
        this.f41837a = i9;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        sm0 sm0Var = this.f41838b;
        if (!sm0Var.D && (length = editable.length()) >= 1) {
            int i9 = this.f41837a;
            if (length > 1) {
                String obj = editable.toString();
                sm0Var.D = true;
                for (int i10 = 0; i10 < Math.min(sm0Var.K - i9, length); i10++) {
                    if (i10 == 0) {
                        editable.replace(0, length, obj.substring(i10, i10 + 1));
                    } else {
                        sm0Var.d[i9 + i10].setText(obj.substring(i10, i10 + 1));
                    }
                }
                sm0Var.D = false;
            }
            if (i9 != sm0Var.K - 1) {
                int i11 = i9 + 1;
                EditTextBoldCursor editTextBoldCursor = sm0Var.d[i11];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                sm0Var.d[i11].requestFocus();
            }
            int i12 = sm0Var.K;
            if (i9 == i12 - 1 || (i9 == i12 - 2 && length >= 2)) {
                code = sm0Var.getCode();
                if (code.length() == sm0Var.K) {
                    sm0Var.h(null);
                }
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
