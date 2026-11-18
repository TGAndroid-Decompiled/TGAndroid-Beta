package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t31 implements TextWatcher {
    public boolean f52149a;
    public final int f52150b;
    public final EditTextBoldCursor f52151c;
    public final org.telegram.ui.Components.xb0 d;
    public final int[] f52152e;
    public final TextView f52153f;

    public t31(int i7, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.xb0 xb0Var, int[] iArr, TextView textView) {
        this.f52150b = i7;
        this.f52151c = editTextBoldCursor;
        this.d = xb0Var;
        this.f52152e = iArr;
        this.f52153f = textView;
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
