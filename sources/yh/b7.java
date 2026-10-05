package yh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ld0;
public final class b7 implements TextWatcher {
    public boolean f51157a;
    public int f51158b = 2;
    public final EditTextBoldCursor f51159c;
    public final ld0 d;
    public final long f51160e;
    public final boolean f51161f;
    public final ci.d h;
    public final TextView f51162n;

    public b7(EditTextBoldCursor editTextBoldCursor, ld0 ld0Var, long j3, boolean z10, ci.d dVar, TextView textView) {
        this.f51159c = editTextBoldCursor;
        this.d = ld0Var;
        this.f51160e = j3;
        this.f51161f = z10;
        this.h = dVar;
        this.f51162n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: yh.b7.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
