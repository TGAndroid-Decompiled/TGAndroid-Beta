package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s91 implements TextWatcher {
    public boolean f41686a;
    public final int f41687b;
    public final EditTextBoldCursor f41688c;
    public final org.telegram.ui.Components.ae0 d;
    public final int[] f41689e;
    public final TextView f41690f;

    public s91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.ae0 ae0Var, int[] iArr, TextView textView) {
        this.f41687b = i10;
        this.f41688c = editTextBoldCursor;
        this.d = ae0Var;
        this.f41689e = iArr;
        this.f41690f = textView;
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
