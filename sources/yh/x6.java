package yh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kd0;
public final class x6 implements TextWatcher {
    public boolean f48274a;
    public int f48275b = 2;
    public final EditTextBoldCursor f48276c;
    public final kd0 d;
    public final long e;
    public final boolean f48277f;
    public final ci.d h;
    public final TextView f48278n;

    public x6(EditTextBoldCursor editTextBoldCursor, kd0 kd0Var, long j3, boolean z10, ci.d dVar, TextView textView) {
        this.f48276c = editTextBoldCursor;
        this.d = kd0Var;
        this.e = j3;
        this.f48277f = z10;
        this.h = dVar;
        this.f48278n = textView;
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
