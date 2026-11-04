package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xi0 implements TextWatcher {
    public final int f52030a;
    public final Object f52031b;
    public String f52032c;
    public final Object d;

    public xi0(yj0 yj0Var, EditTextBoldCursor editTextBoldCursor, String str, int i3) {
        this.f52030a = i3;
        this.d = yj0Var;
        this.f52031b = editTextBoldCursor;
        this.f52032c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xi0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        switch (this.f52030a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                this.f52032c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f52030a;
    }

    public xi0(tg.p pVar) {
        this.f52030a = 3;
        this.d = pVar;
        this.f52031b = Pattern.compile("^[0-9a-fA-F]*$");
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
