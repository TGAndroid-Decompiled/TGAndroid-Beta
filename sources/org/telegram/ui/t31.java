package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t31 implements TextWatcher {
    public boolean f52199a;
    public final int f52200b;
    public final EditTextBoldCursor f52201c;
    public final org.telegram.ui.Components.yb0 d;
    public final int[] f52202e;
    public final TextView f52203f;

    public t31(int i7, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.yb0 yb0Var, int[] iArr, TextView textView) {
        this.f52200b = i7;
        this.f52201c = editTextBoldCursor;
        this.d = yb0Var;
        this.f52202e = iArr;
        this.f52203f = textView;
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
