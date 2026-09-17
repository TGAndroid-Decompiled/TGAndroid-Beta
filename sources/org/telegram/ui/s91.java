package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s91 implements TextWatcher {
    public boolean f40360a;
    public final int f40361b;
    public final EditTextBoldCursor f40362c;
    public final org.telegram.ui.Components.zc0 d;
    public final int[] f40363e;
    public final TextView f40364f;

    public s91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.zc0 zc0Var, int[] iArr, TextView textView) {
        this.f40361b = i10;
        this.f40362c = editTextBoldCursor;
        this.d = zc0Var;
        this.f40363e = iArr;
        this.f40364f = textView;
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
