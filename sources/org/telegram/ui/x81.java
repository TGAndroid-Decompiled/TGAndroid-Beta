package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class x81 implements TextWatcher {
    public boolean f39877a;
    public final int f39878b;
    public final EditTextBoldCursor f39879c;
    public final org.telegram.ui.Components.ad0 d;
    public final int[] e;
    public final TextView f39880f;

    public x81(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.ad0 ad0Var, int[] iArr, TextView textView) {
        this.f39878b = i10;
        this.f39879c = editTextBoldCursor;
        this.d = ad0Var;
        this.e = iArr;
        this.f39880f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x81.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
