package yh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ld0;
public final class a7 implements TextWatcher {
    public boolean f51104a;
    public int f51105b = 2;
    public final EditTextBoldCursor f51106c;
    public final ld0 d;
    public final long f51107e;
    public final boolean f51108f;
    public final ci.d h;
    public final TextView f51109n;

    public a7(EditTextBoldCursor editTextBoldCursor, ld0 ld0Var, long j3, boolean z10, ci.d dVar, TextView textView) {
        this.f51106c = editTextBoldCursor;
        this.d = ld0Var;
        this.f51107e = j3;
        this.f51108f = z10;
        this.h = dVar;
        this.f51109n = textView;
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
