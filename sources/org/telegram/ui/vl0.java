package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vl0 implements TextWatcher {
    public final int f42760a;
    public final Object f42761b;
    public String f42762c;
    public final Object d;

    public vl0(zm0 zm0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f42760a = i10;
        this.d = zm0Var;
        this.f42761b = editTextBoldCursor;
        this.f42762c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vl0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f42760a) {
            case 0:
            case 1:
                return;
            default:
                this.f42762c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f42760a;
    }

    public vl0(qg.x xVar) {
        this.f42760a = 2;
        this.d = xVar;
        this.f42761b = Pattern.compile("^[0-9a-fA-F]*$");
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
