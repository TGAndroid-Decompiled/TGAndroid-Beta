package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s31 implements TextWatcher {
    public boolean f49618a;
    public final int f49619b;
    public final EditTextBoldCursor f49620c;
    public final org.telegram.ui.Components.lb0 d;
    public final int[] f49621e;
    public final TextView f49622f;

    public s31(int i7, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.lb0 lb0Var, int[] iArr, TextView textView) {
        this.f49619b = i7;
        this.f49620c = editTextBoldCursor;
        this.d = lb0Var;
        this.f49621e = iArr;
        this.f49622f = textView;
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
