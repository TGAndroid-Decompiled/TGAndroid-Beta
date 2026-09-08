package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s91 implements TextWatcher {
    public boolean f40386a;
    public final int f40387b;
    public final EditTextBoldCursor f40388c;
    public final org.telegram.ui.Components.zc0 d;
    public final int[] f40389e;
    public final TextView f40390f;

    public s91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.zc0 zc0Var, int[] iArr, TextView textView) {
        this.f40387b = i10;
        this.f40388c = editTextBoldCursor;
        this.d = zc0Var;
        this.f40389e = iArr;
        this.f40390f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s91.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
