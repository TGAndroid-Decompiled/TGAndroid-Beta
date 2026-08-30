package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xm0 implements TextWatcher {
    public final int f39942a;
    public final zm0 f39943b;

    public xm0(zm0 zm0Var, int i10) {
        this.f39943b = zm0Var;
        this.f39942a = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        zm0 zm0Var = this.f39943b;
        if (!zm0Var.E && (length = editable.length()) >= 1) {
            int i10 = this.f39942a;
            if (length > 1) {
                String obj = editable.toString();
                zm0Var.E = true;
                for (int i11 = 0; i11 < Math.min(zm0Var.L - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        zm0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                zm0Var.E = false;
            }
            if (i10 != zm0Var.L - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = zm0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                zm0Var.d[i12].requestFocus();
            }
            int i13 = zm0Var.L;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = zm0Var.getCode();
                if (code.length() == zm0Var.L) {
                    zm0Var.h(null);
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
