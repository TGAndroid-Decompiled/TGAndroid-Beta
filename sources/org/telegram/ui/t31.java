package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t31 implements TextWatcher {
    public boolean f52147a;
    public final int f52148b;
    public final EditTextBoldCursor f52149c;
    public final org.telegram.ui.Components.xb0 d;
    public final int[] f52150e;
    public final TextView f52151f;

    public t31(int i7, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.xb0 xb0Var, int[] iArr, TextView textView) {
        this.f52148b = i7;
        this.f52149c = editTextBoldCursor;
        this.d = xb0Var;
        this.f52150e = iArr;
        this.f52151f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t31.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
