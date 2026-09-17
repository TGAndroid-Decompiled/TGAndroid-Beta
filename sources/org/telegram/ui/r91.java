package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r91 implements TextWatcher {
    public boolean f37160a;
    public final int f37161b;
    public final EditTextBoldCursor f37162c;
    public final org.telegram.ui.Components.yc0 d;
    public final int[] e;
    public final TextView f37163f;

    public r91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.yc0 yc0Var, int[] iArr, TextView textView) {
        this.f37161b = i10;
        this.f37162c = editTextBoldCursor;
        this.d = yc0Var;
        this.e = iArr;
        this.f37163f = textView;
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
