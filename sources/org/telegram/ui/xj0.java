package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xj0 implements TextWatcher {
    public final int f51680a;
    public final zj0 f51681b;

    public xj0(zj0 zj0Var, int i7) {
        this.f51681b = zj0Var;
        this.f51680a = i7;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        zj0 zj0Var = this.f51681b;
        if (!zj0Var.H && (length = editable.length()) >= 1) {
            int i7 = this.f51680a;
            if (length > 1) {
                String obj = editable.toString();
                zj0Var.H = true;
                for (int i10 = 0; i10 < Math.min(zj0Var.O - i7, length); i10++) {
                    if (i10 == 0) {
                        editable.replace(0, length, obj.substring(i10, i10 + 1));
                    } else {
                        zj0Var.d[i7 + i10].setText(obj.substring(i10, i10 + 1));
                    }
                }
                zj0Var.H = false;
            }
            if (i7 != zj0Var.O - 1) {
                int i11 = i7 + 1;
                EditTextBoldCursor editTextBoldCursor = zj0Var.d[i11];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                zj0Var.d[i11].requestFocus();
            }
            int i12 = zj0Var.O;
            if (i7 == i12 - 1 || (i7 == i12 - 2 && length >= 2)) {
                code = zj0Var.getCode();
                if (code.length() == zj0Var.O) {
                    zj0Var.h(null);
                }
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
