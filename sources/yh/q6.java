package yh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.de0;
public final class q6 implements TextWatcher {
    public boolean f53316a;
    public int f53317b = 2;
    public final EditTextBoldCursor f53318c;
    public final de0 d;
    public final long f53319e;
    public final boolean f53320f;
    public final ci.d h;
    public final TextView f53321n;

    public q6(EditTextBoldCursor editTextBoldCursor, de0 de0Var, long j3, boolean z10, ci.d dVar, TextView textView) {
        this.f53318c = editTextBoldCursor;
        this.d = de0Var;
        this.f53319e = j3;
        this.f53320f = z10;
        this.h = dVar;
        this.f53321n = textView;
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
