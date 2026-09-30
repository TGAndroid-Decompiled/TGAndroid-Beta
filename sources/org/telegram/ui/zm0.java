package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zm0 implements TextWatcher {
    public final int f40647a;
    public final bn0 f40648b;

    public zm0(bn0 bn0Var, int i10) {
        this.f40648b = bn0Var;
        this.f40647a = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        bn0 bn0Var = this.f40648b;
        if (!bn0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.f40647a;
            if (length > 1) {
                String obj = editable.toString();
                bn0Var.H = true;
                for (int i11 = 0; i11 < Math.min(bn0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        bn0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                bn0Var.H = false;
            }
            if (i10 != bn0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = bn0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                bn0Var.d[i12].requestFocus();
            }
            int i13 = bn0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = bn0Var.getCode();
                if (code.length() == bn0Var.O) {
                    bn0Var.h(null);
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
