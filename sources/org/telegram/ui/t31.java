package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t31 implements TextWatcher {
    public boolean f50060a;
    public final int f50061b;
    public final EditTextBoldCursor f50062c;
    public final org.telegram.ui.Components.mb0 d;
    public final int[] f50063e;
    public final TextView f50064f;

    public t31(int i7, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.mb0 mb0Var, int[] iArr, TextView textView) {
        this.f50061b = i7;
        this.f50062c = editTextBoldCursor;
        this.d = mb0Var;
        this.f50063e = iArr;
        this.f50064f = textView;
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
