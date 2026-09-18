package yh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.id0;
public final class w6 implements TextWatcher {
    public boolean f48185a;
    public int f48186b = 2;
    public final EditTextBoldCursor f48187c;
    public final id0 d;
    public final long e;
    public final boolean f48188f;
    public final ci.d h;
    public final TextView f48189n;

    public w6(EditTextBoldCursor editTextBoldCursor, id0 id0Var, long j3, boolean z10, ci.d dVar, TextView textView) {
        this.f48187c = editTextBoldCursor;
        this.d = id0Var;
        this.e = j3;
        this.f48188f = z10;
        this.h = dVar;
        this.f48189n = textView;
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
