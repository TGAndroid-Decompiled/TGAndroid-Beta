package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vl0 implements TextWatcher {
    public boolean f42788a;
    public final EditTextBoldCursor f42789b;
    public final String f42790c;
    public final an0 d;

    public vl0(an0 an0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = an0Var;
        this.f42789b = editTextBoldCursor;
        this.f42790c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f42788a) {
            return;
        }
        boolean z10 = true;
        this.f42788a = true;
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
        this.f42788a = false;
        EditTextBoldCursor editTextBoldCursor = this.f42789b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            an0.I0(this.d, editTextBoldCursor, this.f42790c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
