package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class wl0 implements TextWatcher {

    public final EditTextBoldCursor f44142a;

    public final String f44143b;

    public final xm0 f44144c;

    public wl0(xm0 xm0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.f44144c = xm0Var;
        this.f44142a = editTextBoldCursor;
        this.f44143b = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        EditTextBoldCursor editTextBoldCursor = this.f44142a;
        int iIntValue = ((Integer) editTextBoldCursor.getTag()).intValue();
        int i10 = 0;
        while (true) {
            if (i10 >= editable.length()) {
                z10 = false;
                break;
            }
            char cCharAt = editable.charAt(i10);
            if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ' ' || cCharAt == '\'' || cCharAt == ',' || cCharAt == '.' || cCharAt == '&' || cCharAt == '-' || cCharAt == '/'))) {
                z10 = true;
                break;
            }
            i10++;
        }
        xm0 xm0Var = this.f44144c;
        if (z10 && !xm0Var.f44515q0) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            xm0Var.f44513p0[iIntValue] = z10;
            xm0.J0(xm0Var, editTextBoldCursor, this.f44143b, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
