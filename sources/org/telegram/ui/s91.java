package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s91 implements TextWatcher {
    public boolean f41640a;
    public final int f41641b;
    public final EditTextBoldCursor f41642c;
    public final org.telegram.ui.Components.zd0 d;
    public final int[] f41643e;
    public final TextView f41644f;

    public s91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.zd0 zd0Var, int[] iArr, TextView textView) {
        this.f41641b = i10;
        this.f41642c = editTextBoldCursor;
        this.d = zd0Var;
        this.f41643e = iArr;
        this.f41644f = textView;
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
