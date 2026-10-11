package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r91 implements TextWatcher {
    public boolean f41385a;
    public final int f41386b;
    public final EditTextBoldCursor f41387c;
    public final org.telegram.ui.Components.be0 d;
    public final int[] f41388e;
    public final TextView f41389f;

    public r91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.be0 be0Var, int[] iArr, TextView textView) {
        this.f41386b = i10;
        this.f41387c = editTextBoldCursor;
        this.d = be0Var;
        this.f41388e = iArr;
        this.f41389f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r91.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
