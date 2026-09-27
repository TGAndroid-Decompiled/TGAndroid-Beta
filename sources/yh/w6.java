package yh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.jd0;
public final class w6 implements TextWatcher {
    public boolean f48240a;
    public int f48241b = 2;
    public final EditTextBoldCursor f48242c;
    public final jd0 d;
    public final long e;
    public final boolean f48243f;
    public final ci.d h;
    public final TextView f48244n;

    public w6(EditTextBoldCursor editTextBoldCursor, jd0 jd0Var, long j3, boolean z10, ci.d dVar, TextView textView) {
        this.f48242c = editTextBoldCursor;
        this.d = jd0Var;
        this.e = j3;
        this.f48243f = z10;
        this.h = dVar;
        this.f48244n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: yh.w6.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
