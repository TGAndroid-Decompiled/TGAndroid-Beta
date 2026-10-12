package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class u91 implements TextWatcher {
    public boolean f42427a;
    public final int f42428b;
    public final EditTextBoldCursor f42429c;
    public final org.telegram.ui.Components.de0 d;
    public final int[] f42430e;
    public final TextView f42431f;

    public u91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.de0 de0Var, int[] iArr, TextView textView) {
        this.f42428b = i10;
        this.f42429c = editTextBoldCursor;
        this.d = de0Var;
        this.f42430e = iArr;
        this.f42431f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u91.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
