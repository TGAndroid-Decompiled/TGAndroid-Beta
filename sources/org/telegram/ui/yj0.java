package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yj0 implements TextWatcher {
    public final int f52057a;
    public final ak0 f52058b;

    public yj0(ak0 ak0Var, int i7) {
        this.f52058b = ak0Var;
        this.f52057a = i7;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        ak0 ak0Var = this.f52058b;
        if (!ak0Var.H && (length = editable.length()) >= 1) {
            int i7 = this.f52057a;
            if (length > 1) {
                String obj = editable.toString();
                ak0Var.H = true;
                for (int i10 = 0; i10 < Math.min(ak0Var.O - i7, length); i10++) {
                    if (i10 == 0) {
                        editable.replace(0, length, obj.substring(i10, i10 + 1));
                    } else {
                        ak0Var.d[i7 + i10].setText(obj.substring(i10, i10 + 1));
                    }
                }
                ak0Var.H = false;
            }
            if (i7 != ak0Var.O - 1) {
                int i11 = i7 + 1;
                EditTextBoldCursor editTextBoldCursor = ak0Var.d[i11];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                ak0Var.d[i11].requestFocus();
            }
            int i12 = ak0Var.O;
            if (i7 == i12 - 1 || (i7 == i12 - 2 && length >= 2)) {
                code = ak0Var.getCode();
                if (code.length() == ak0Var.O) {
                    ak0Var.h(null);
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
