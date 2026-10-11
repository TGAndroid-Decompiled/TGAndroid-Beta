package yh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ae0;
public final class q6 implements TextWatcher {
    public boolean f53201a;
    public int f53202b = 2;
    public final EditTextBoldCursor f53203c;
    public final ae0 d;
    public final long f53204e;
    public final boolean f53205f;
    public final ci.d h;
    public final TextView f53206n;

    public q6(EditTextBoldCursor editTextBoldCursor, ae0 ae0Var, long j3, boolean z10, ci.d dVar, TextView textView) {
        this.f53203c = editTextBoldCursor;
        this.d = ae0Var;
        this.f53204e = j3;
        this.f53205f = z10;
        this.h = dVar;
        this.f53206n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: yh.q6.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
