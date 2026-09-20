package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s91 implements TextWatcher {
    public boolean f37346a;
    public final int f37347b;
    public final EditTextBoldCursor f37348c;
    public final org.telegram.ui.Components.hd0 d;
    public final int[] e;
    public final TextView f37349f;

    public s91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.hd0 hd0Var, int[] iArr, TextView textView) {
        this.f37347b = i10;
        this.f37348c = editTextBoldCursor;
        this.d = hd0Var;
        this.e = iArr;
        this.f37349f = textView;
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
