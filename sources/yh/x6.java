package yh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hd0;
public final class x6 implements TextWatcher {
    public boolean f48262a;
    public int f48263b = 2;
    public final EditTextBoldCursor f48264c;
    public final hd0 d;
    public final long e;
    public final boolean f48265f;
    public final ci.d h;
    public final TextView f48266n;

    public x6(EditTextBoldCursor editTextBoldCursor, hd0 hd0Var, long j3, boolean z10, ci.d dVar, TextView textView) {
        this.f48264c = editTextBoldCursor;
        this.d = hd0Var;
        this.e = j3;
        this.f48265f = z10;
        this.h = dVar;
        this.f48266n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: yh.x6.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
