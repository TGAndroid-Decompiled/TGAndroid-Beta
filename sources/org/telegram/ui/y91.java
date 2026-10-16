package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class y91 implements TextWatcher {
    public boolean f41787a;
    public final int f41788b;
    public final EditTextBoldCursor f41789c;
    public final org.telegram.ui.Components.yd0 d;
    public final int[] e;
    public final TextView f41790f;

    public y91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.yd0 yd0Var, int[] iArr, TextView textView) {
        this.f41788b = i10;
        this.f41789c = editTextBoldCursor;
        this.d = yd0Var;
        this.e = iArr;
        this.f41790f = textView;
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
