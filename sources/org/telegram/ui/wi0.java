package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wi0 implements TextWatcher {
    public boolean f51181a;
    public final EditTextBoldCursor f51182b;
    public final String f51183c;
    public final yj0 d;

    public wi0(yj0 yj0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = yj0Var;
        this.f51182b = editTextBoldCursor;
        this.f51183c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f51181a) {
            return;
        }
        boolean z10 = true;
        this.f51181a = true;
        int i3 = 0;
        while (true) {
            if (i3 < editable.length()) {
                char charAt = editable.charAt(i3);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == ' '))) {
                    break;
                }
                i3++;
            } else {
                z10 = false;
                break;
            }
        }
        this.f51181a = false;
        EditTextBoldCursor editTextBoldCursor = this.f51182b;
        if (z10) {
            editTextBoldCursor.setErrorText(org.telegram.messenger.bd.M0(2131747457, null));
        } else {
            yj0.N0(this.d, editTextBoldCursor, this.f51183c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
