package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s31 implements TextWatcher {
    public boolean f49619a;
    public final int f49620b;
    public final EditTextBoldCursor f49621c;
    public final org.telegram.ui.Components.lb0 d;
    public final int[] f49622e;
    public final TextView f49623f;

    public s31(int i7, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.lb0 lb0Var, int[] iArr, TextView textView) {
        this.f49620b = i7;
        this.f49621c = editTextBoldCursor;
        this.d = lb0Var;
        this.f49622e = iArr;
        this.f49623f = textView;
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
