package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rl0 implements TextWatcher {
    public boolean f41236a;
    public final EditTextBoldCursor f41237b;
    public final String f41238c;
    public final vm0 d;

    public rl0(vm0 vm0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = vm0Var;
        this.f41237b = editTextBoldCursor;
        this.f41238c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f41236a) {
            return;
        }
        boolean z10 = true;
        this.f41236a = true;
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
        this.f41236a = false;
        EditTextBoldCursor editTextBoldCursor = this.f41237b;
        if (z10) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            vm0.I0(this.d, editTextBoldCursor, this.f41238c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
