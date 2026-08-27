package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class rm0 implements TextWatcher {

    public final int f41972a;

    public final tm0 f41973b;

    public rm0(tm0 tm0Var, int i10) {
        this.f41973b = tm0Var;
        this.f41972a = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        tm0 tm0Var = this.f41973b;
        if (!tm0Var.D && (length = editable.length()) >= 1) {
            int i10 = this.f41972a;
            if (length > 1) {
                String string = editable.toString();
                tm0Var.D = true;
                for (int i11 = 0; i11 < Math.min(tm0Var.K - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, string.substring(i11, i11 + 1));
                    } else {
                        tm0Var.d[i10 + i11].setText(string.substring(i11, i11 + 1));
                    }
                }
                tm0Var.D = false;
            }
            if (i10 != tm0Var.K - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = tm0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                tm0Var.d[i12].requestFocus();
            }
            int i13 = tm0Var.K;
            if ((i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) && tm0Var.getCode().length() == tm0Var.K) {
                tm0Var.h(null);
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
