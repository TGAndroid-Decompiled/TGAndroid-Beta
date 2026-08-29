package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rl0 implements TextWatcher {
    public final int f42135a;
    public final Object f42136b;
    public String f42137c;
    public final Object d;

    public rl0(vm0 vm0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f42135a = i10;
        this.d = vm0Var;
        this.f42136b = editTextBoldCursor;
        this.f42137c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rl0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f42135a) {
            case 0:
            case 1:
                return;
            default:
                this.f42137c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f42135a;
    }

    public rl0(ag.e0 e0Var) {
        this.f42135a = 2;
        this.d = e0Var;
        this.f42136b = Pattern.compile("^[0-9a-fA-F]*$");
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
