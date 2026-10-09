package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s91 implements TextWatcher {
    public boolean f41642a;
    public final int f41643b;
    public final EditTextBoldCursor f41644c;
    public final org.telegram.ui.Components.zd0 d;
    public final int[] f41645e;
    public final TextView f41646f;

    public s91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.zd0 zd0Var, int[] iArr, TextView textView) {
        this.f41643b = i10;
        this.f41644c = editTextBoldCursor;
        this.d = zd0Var;
        this.f41645e = iArr;
        this.f41646f = textView;
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
