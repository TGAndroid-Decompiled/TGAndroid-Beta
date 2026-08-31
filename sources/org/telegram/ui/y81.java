package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class y81 implements TextWatcher {
    public boolean f43578a;
    public final int f43579b;
    public final EditTextBoldCursor f43580c;
    public final org.telegram.ui.Components.cd0 d;
    public final int[] f43581e;
    public final TextView f43582f;

    public y81(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.cd0 cd0Var, int[] iArr, TextView textView) {
        this.f43579b = i10;
        this.f43580c = editTextBoldCursor;
        this.d = cd0Var;
        this.f43581e = iArr;
        this.f43582f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y81.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
