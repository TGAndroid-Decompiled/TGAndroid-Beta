package yh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yc0;
public final class z6 implements TextWatcher {
    public boolean f48095a;
    public int f48096b = 2;
    public final EditTextBoldCursor f48097c;
    public final yc0 d;
    public final long e;
    public final boolean f48098f;
    public final ci.d h;
    public final TextView f48099n;

    public z6(EditTextBoldCursor editTextBoldCursor, yc0 yc0Var, long j3, boolean z10, ci.d dVar, TextView textView) {
        this.f48097c = editTextBoldCursor;
        this.d = yc0Var;
        this.e = j3;
        this.f48098f = z10;
        this.h = dVar;
        this.f48099n = textView;
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
