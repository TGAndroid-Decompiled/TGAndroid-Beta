package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class w91 implements TextWatcher {
    public boolean f37779a;
    public final int f37780b;
    public final EditTextBoldCursor f37781c;
    public final org.telegram.ui.Components.hd0 d;
    public final int[] e;
    public final TextView f37782f;

    public w91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.hd0 hd0Var, int[] iArr, TextView textView) {
        this.f37780b = i10;
        this.f37781c = editTextBoldCursor;
        this.d = hd0Var;
        this.e = iArr;
        this.f37782f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w91.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
