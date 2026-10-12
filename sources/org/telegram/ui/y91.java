package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class y91 implements TextWatcher {
    public boolean f42084a;
    public final int f42085b;
    public final EditTextBoldCursor f42086c;
    public final org.telegram.ui.Components.yd0 d;
    public final int[] e;
    public final TextView f42087f;

    public y91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.yd0 yd0Var, int[] iArr, TextView textView) {
        this.f42085b = i10;
        this.f42086c = editTextBoldCursor;
        this.d = yd0Var;
        this.e = iArr;
        this.f42087f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y91.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
