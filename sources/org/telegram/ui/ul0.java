package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ul0 implements TextWatcher {
    public final EditTextBoldCursor f42016a;
    public final String f42017b;
    public final vm0 f42018c;

    public ul0(vm0 vm0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.f42018c = vm0Var;
        this.f42016a = editTextBoldCursor;
        this.f42017b = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        EditTextBoldCursor editTextBoldCursor = this.f42016a;
        int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
        int i10 = 0;
        while (true) {
            if (i10 < editable.length()) {
                char charAt = editable.charAt(i10);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != ' ' && charAt != '\'' && charAt != ',' && charAt != '.' && charAt != '&' && charAt != '-' && charAt != '/'))) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        vm0 vm0Var = this.f42018c;
        if (z10 && !vm0Var.f42330u0) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
            return;
        }
        vm0Var.f42328t0[intValue] = z10;
        vm0.I0(vm0Var, editTextBoldCursor, this.f42017b, editable, false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
