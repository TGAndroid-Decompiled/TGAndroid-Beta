package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tl0 implements TextWatcher {
    public final int f43028a;
    public final Object f43029b;
    public String f43030c;
    public final Object d;

    public tl0(wm0 wm0Var, EditTextBoldCursor editTextBoldCursor, String str, int i9) {
        this.f43028a = i9;
        this.d = wm0Var;
        this.f43029b = editTextBoldCursor;
        this.f43030c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tl0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        switch (this.f43028a) {
            case 0:
            case 1:
                return;
            default:
                this.f43030c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.f43028a;
    }

    public tl0(xf.w wVar) {
        this.f43028a = 2;
        this.d = wVar;
        this.f43029b = Pattern.compile("^[0-9a-fA-F]*$");
    }

    private final void a(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
