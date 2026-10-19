package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sl0 implements TextWatcher {
    public final int f41485a;
    public final Object f41486b;
    public String f41487c;
    public final Object d;

    public sl0(vm0 vm0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f41485a = i10;
        this.d = vm0Var;
        this.f41486b = editTextBoldCursor;
        this.f41487c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sl0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f41485a) {
            case 0:
            case 1:
                return;
            default:
                this.f41487c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41485a;
    }

    public sl0(qg.x xVar) {
        this.f41485a = 2;
        this.d = xVar;
        this.f41486b = Pattern.compile("^[0-9a-fA-F]*$");
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
