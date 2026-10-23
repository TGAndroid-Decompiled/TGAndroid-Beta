package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wl0 implements TextWatcher {
    public final int f43390a;
    public final Object f43391b;
    public String f43392c;
    public final Object d;

    public wl0(an0 an0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f43390a = i10;
        this.d = an0Var;
        this.f43391b = editTextBoldCursor;
        this.f43392c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wl0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f43390a) {
            case 0:
            case 1:
                return;
            default:
                this.f43392c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f43390a;
    }

    public wl0(qg.x xVar) {
        this.f43390a = 2;
        this.d = xVar;
        this.f43391b = Pattern.compile("^[0-9a-fA-F]*$");
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
