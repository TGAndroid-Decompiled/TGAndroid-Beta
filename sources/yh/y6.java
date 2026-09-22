package yh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yc0;
public final class y6 implements TextWatcher {
    public boolean f47976a;
    public int f47977b = 2;
    public final EditTextBoldCursor f47978c;
    public final yc0 d;
    public final long e;
    public final boolean f47979f;
    public final ci.d h;
    public final TextView f47980n;

    public y6(EditTextBoldCursor editTextBoldCursor, yc0 yc0Var, long j3, boolean z10, ci.d dVar, TextView textView) {
        this.f47978c = editTextBoldCursor;
        this.d = yc0Var;
        this.e = j3;
        this.f47979f = z10;
        this.h = dVar;
        this.f47980n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: yh.y6.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
