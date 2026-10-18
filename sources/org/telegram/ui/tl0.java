package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tl0 implements TextWatcher {
    public boolean f41758a;
    public final EditTextBoldCursor f41759b;
    public final String f41760c;
    public final xm0 d;

    public tl0(xm0 xm0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = xm0Var;
        this.f41759b = editTextBoldCursor;
        this.f41760c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f41758a) {
            return;
        }
        boolean z10 = true;
        this.f41758a = true;
        int i10 = 0;
        while (true) {
            if (i10 < editable.length()) {
                char charAt = editable.charAt(i10);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == ' '))) {
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        this.f41758a = false;
        EditTextBoldCursor editTextBoldCursor = this.f41759b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            xm0.I0(this.d, editTextBoldCursor, this.f41760c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
