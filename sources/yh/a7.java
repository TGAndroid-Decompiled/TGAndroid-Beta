package yh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ld0;
public final class a7 implements TextWatcher {
    public boolean f51097a;
    public int f51098b = 2;
    public final EditTextBoldCursor f51099c;
    public final ld0 d;
    public final long f51100e;
    public final boolean f51101f;
    public final ci.d h;
    public final TextView f51102n;

    public a7(EditTextBoldCursor editTextBoldCursor, ld0 ld0Var, long j3, boolean z10, ci.d dVar, TextView textView) {
        this.f51099c = editTextBoldCursor;
        this.d = ld0Var;
        this.f51100e = j3;
        this.f51101f = z10;
        this.h = dVar;
        this.f51102n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: yh.a7.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
