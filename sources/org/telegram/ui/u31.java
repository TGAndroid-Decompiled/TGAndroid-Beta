package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class u31 implements TextWatcher {
    public boolean f50395a;
    public final int f50396b;
    public final EditTextBoldCursor f50397c;
    public final org.telegram.ui.Components.lb0 d;
    public final int[] f50398e;
    public final TextView f50399f;

    public u31(int i7, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.lb0 lb0Var, int[] iArr, TextView textView) {
        this.f50396b = i7;
        this.f50397c = editTextBoldCursor;
        this.d = lb0Var;
        this.f50398e = iArr;
        this.f50399f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u31.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
