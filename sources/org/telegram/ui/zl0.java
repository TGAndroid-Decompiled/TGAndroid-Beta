package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zl0 implements TextWatcher {
    public final int f40824a;
    public final Object f40825b;
    public String f40826c;
    public final Object d;

    public zl0(dn0 dn0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f40824a = i10;
        this.d = dn0Var;
        this.f40825b = editTextBoldCursor;
        this.f40826c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zl0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f40824a) {
            case 0:
            case 1:
                return;
            default:
                this.f40826c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f40824a;
    }

    public zl0(cg.d0 d0Var) {
        this.f40824a = 2;
        this.d = d0Var;
        this.f40825b = Pattern.compile("^[0-9a-fA-F]*$");
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
