package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tl0 implements TextWatcher {
    public boolean f41773a;
    public final EditTextBoldCursor f41774b;
    public final String f41775c;
    public final xm0 d;

    public tl0(xm0 xm0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = xm0Var;
        this.f41774b = editTextBoldCursor;
        this.f41775c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f41773a) {
            return;
        }
        boolean z10 = true;
        this.f41773a = true;
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
        this.f41773a = false;
        EditTextBoldCursor editTextBoldCursor = this.f41774b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            xm0.I0(this.d, editTextBoldCursor, this.f41775c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
