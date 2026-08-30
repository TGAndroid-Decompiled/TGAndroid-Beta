package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yl0 implements TextWatcher {
    public boolean f40539a;
    public final EditTextBoldCursor f40540b;
    public final String f40541c;
    public final dn0 d;

    public yl0(dn0 dn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = dn0Var;
        this.f40540b = editTextBoldCursor;
        this.f40541c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f40539a) {
            return;
        }
        boolean z4 = true;
        this.f40539a = true;
        int i10 = 0;
        while (true) {
            if (i10 < editable.length()) {
                char charAt = editable.charAt(i10);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == ' '))) {
                    break;
                }
                i10++;
            } else {
                z4 = false;
                break;
            }
        }
        this.f40539a = false;
        EditTextBoldCursor editTextBoldCursor = this.f40540b;
        if (z4) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            dn0.J0(this.d, editTextBoldCursor, this.f40541c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
