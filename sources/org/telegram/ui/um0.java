package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class um0 implements TextWatcher {
    public final int f42475a;
    public final wm0 f42476b;

    public um0(wm0 wm0Var, int i10) {
        this.f42476b = wm0Var;
        this.f42475a = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        wm0 wm0Var = this.f42476b;
        if (!wm0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.f42475a;
            if (length > 1) {
                String obj = editable.toString();
                wm0Var.H = true;
                for (int i11 = 0; i11 < Math.min(wm0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        wm0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                wm0Var.H = false;
            }
            if (i10 != wm0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = wm0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                wm0Var.d[i12].requestFocus();
            }
            int i13 = wm0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = wm0Var.getCode();
                if (code.length() == wm0Var.O) {
                    wm0Var.h(null);
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
