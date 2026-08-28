package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vl0 implements TextWatcher {
    public final EditTextBoldCursor f43511a;
    public final String f43512b;
    public final wm0 f43513c;

    public vl0(wm0 wm0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.f43513c = wm0Var;
        this.f43511a = editTextBoldCursor;
        this.f43512b = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        EditTextBoldCursor editTextBoldCursor = this.f43511a;
        int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
        int i9 = 0;
        while (true) {
            if (i9 < editable.length()) {
                char charAt = editable.charAt(i9);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != ' ' && charAt != '\'' && charAt != ',' && charAt != '.' && charAt != '&' && charAt != '-' && charAt != '/'))) {
                    z10 = true;
                    break;
                }
                i9++;
            } else {
                z10 = false;
                break;
            }
        }
        wm0 wm0Var = this.f43513c;
        if (z10 && !wm0Var.f44184q0) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
            return;
        }
        wm0Var.f44182p0[intValue] = z10;
        wm0.I0(wm0Var, editTextBoldCursor, this.f43512b, editable, false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
