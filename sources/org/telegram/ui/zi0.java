package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zi0 implements TextWatcher {
    public boolean f52596a;
    public final EditTextBoldCursor f52597b;
    public final String f52598c;
    public final bk0 d;

    public zi0(bk0 bk0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = bk0Var;
        this.f52597b = editTextBoldCursor;
        this.f52598c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f52596a) {
            return;
        }
        boolean z9 = true;
        this.f52596a = true;
        int i7 = 0;
        while (true) {
            if (i7 < editable.length()) {
                char charAt = editable.charAt(i7);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == ' '))) {
                    break;
                }
                i7++;
            } else {
                z9 = false;
                break;
            }
        }
        this.f52596a = false;
        EditTextBoldCursor editTextBoldCursor = this.f52597b;
        if (z9) {
            editTextBoldCursor.setErrorText(org.telegram.messenger.hd.M0(2131747448, null));
        } else {
            bk0.N0(this.d, editTextBoldCursor, this.f52598c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
