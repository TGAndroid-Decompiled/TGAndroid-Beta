package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s31 implements TextWatcher {
    public boolean f51961a;
    public final int f51962b;
    public final EditTextBoldCursor f51963c;
    public final org.telegram.ui.Components.vb0 d;
    public final int[] f51964e;
    public final TextView f51965f;

    public s31(int i7, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.vb0 vb0Var, int[] iArr, TextView textView) {
        this.f51962b = i7;
        this.f51963c = editTextBoldCursor;
        this.d = vb0Var;
        this.f51964e = iArr;
        this.f51965f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s31.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
