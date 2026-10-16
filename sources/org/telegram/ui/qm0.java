package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qm0 implements TextWatcher {
    public final EditTextBoldCursor f39187a;
    public final String f39188b;
    public final sn0 f39189c;

    public qm0(sn0 sn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.f39189c = sn0Var;
        this.f39187a = editTextBoldCursor;
        this.f39188b = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        EditTextBoldCursor editTextBoldCursor = this.f39187a;
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
        sn0 sn0Var = this.f39189c;
        if (z10 && !sn0Var.f39899u0) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
            return;
        }
        sn0Var.f39897t0[intValue] = z10;
        sn0.I0(sn0Var, editTextBoldCursor, this.f39188b, editable, false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
