package yh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.md0;
public final class x6 implements TextWatcher {
    public boolean f48383a;
    public int f48384b = 2;
    public final EditTextBoldCursor f48385c;
    public final md0 d;
    public final long e;
    public final boolean f48386f;
    public final ci.d h;
    public final TextView f48387n;

    public x6(EditTextBoldCursor editTextBoldCursor, md0 md0Var, long j3, boolean z10, ci.d dVar, TextView textView) {
        this.f48385c = editTextBoldCursor;
        this.d = md0Var;
        this.e = j3;
        this.f48386f = z10;
        this.h = dVar;
        this.f48387n = textView;
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
