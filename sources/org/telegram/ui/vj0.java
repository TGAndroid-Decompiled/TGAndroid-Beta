package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vj0 implements TextWatcher {
    public final int f50747a;
    public final xj0 f50748b;

    public vj0(xj0 xj0Var, int i7) {
        this.f50748b = xj0Var;
        this.f50747a = i7;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        xj0 xj0Var = this.f50748b;
        if (!xj0Var.H && (length = editable.length()) >= 1) {
            int i7 = this.f50747a;
            if (length > 1) {
                String obj = editable.toString();
                xj0Var.H = true;
                for (int i10 = 0; i10 < Math.min(xj0Var.O - i7, length); i10++) {
                    if (i10 == 0) {
                        editable.replace(0, length, obj.substring(i10, i10 + 1));
                    } else {
                        xj0Var.d[i7 + i10].setText(obj.substring(i10, i10 + 1));
                    }
                }
                xj0Var.H = false;
            }
            if (i7 != xj0Var.O - 1) {
                int i11 = i7 + 1;
                EditTextBoldCursor editTextBoldCursor = xj0Var.d[i11];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                xj0Var.d[i11].requestFocus();
            }
            int i12 = xj0Var.O;
            if (i7 == i12 - 1 || (i7 == i12 - 2 && length >= 2)) {
                code = xj0Var.getCode();
                if (code.length() == xj0Var.O) {
                    xj0Var.h(null);
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
