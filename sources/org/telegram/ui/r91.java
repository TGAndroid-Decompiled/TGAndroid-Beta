package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r91 implements TextWatcher {
    public boolean f41419a;
    public final int f41420b;
    public final EditTextBoldCursor f41421c;
    public final org.telegram.ui.Components.ae0 d;
    public final int[] f41422e;
    public final TextView f41423f;

    public r91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.ae0 ae0Var, int[] iArr, TextView textView) {
        this.f41420b = i10;
        this.f41421c = editTextBoldCursor;
        this.d = ae0Var;
        this.f41422e = iArr;
        this.f41423f = textView;
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
