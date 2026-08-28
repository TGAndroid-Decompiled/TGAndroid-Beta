package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sl0 implements TextWatcher {
    public boolean f42717a;
    public final EditTextBoldCursor f42718b;
    public final String f42719c;
    public final wm0 d;

    public sl0(wm0 wm0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = wm0Var;
        this.f42718b = editTextBoldCursor;
        this.f42719c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f42717a) {
            return;
        }
        boolean z10 = true;
        this.f42717a = true;
        int i9 = 0;
        while (true) {
            if (i9 < editable.length()) {
                char charAt = editable.charAt(i9);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == ' '))) {
                    break;
                }
                i9++;
            } else {
                z10 = false;
                break;
            }
        }
        this.f42717a = false;
        EditTextBoldCursor editTextBoldCursor = this.f42718b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            wm0.I0(this.d, editTextBoldCursor, this.f42719c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
