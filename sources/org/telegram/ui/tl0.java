package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class tl0 implements TextWatcher {

    public boolean f42963a;

    public final EditTextBoldCursor f42964b;

    public final String f42965c;
    public final xm0 d;

    public tl0(xm0 xm0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = xm0Var;
        this.f42964b = editTextBoldCursor;
        this.f42965c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f42963a) {
            return;
        }
        boolean z10 = true;
        this.f42963a = true;
        int i10 = 0;
        while (true) {
            if (i10 >= editable.length()) {
                z10 = false;
                break;
            }
            char cCharAt = editable.charAt(i10);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '-' || cCharAt == ' '))) {
                break;
            } else {
                i10++;
            }
        }
        this.f42963a = false;
        EditTextBoldCursor editTextBoldCursor = this.f42964b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            xm0.J0(this.d, editTextBoldCursor, this.f42965c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
