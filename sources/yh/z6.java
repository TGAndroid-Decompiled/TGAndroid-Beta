package yh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yc0;
public final class z6 implements TextWatcher {
    public boolean f48090a;
    public int f48091b = 2;
    public final EditTextBoldCursor f48092c;
    public final yc0 d;
    public final long e;
    public final boolean f48093f;
    public final ci.d h;
    public final TextView f48094n;

    public z6(EditTextBoldCursor editTextBoldCursor, yc0 yc0Var, long j3, boolean z10, ci.d dVar, TextView textView) {
        this.f48092c = editTextBoldCursor;
        this.d = yc0Var;
        this.e = j3;
        this.f48093f = z10;
        this.h = dVar;
        this.f48094n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: yh.z6.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
