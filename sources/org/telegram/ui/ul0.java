package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ul0 implements TextWatcher {
    public final int f41983a;
    public final Object f41984b;
    public String f41985c;
    public final Object d;

    public ul0(xm0 xm0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f41983a = i10;
        this.d = xm0Var;
        this.f41984b = editTextBoldCursor;
        this.f41985c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ul0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f41983a) {
            case 0:
            case 1:
                return;
            default:
                this.f41985c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41983a;
    }

    public ul0(qg.w wVar) {
        this.f41983a = 2;
        this.d = wVar;
        this.f41984b = Pattern.compile("^[0-9a-fA-F]*$");
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
