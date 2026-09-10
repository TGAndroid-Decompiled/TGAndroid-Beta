package xh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hd0;
public final class z6 implements TextWatcher {
    public boolean f46381a;
    public int f46382b = 2;
    public final EditTextBoldCursor f46383c;
    public final hd0 d;
    public final long e;
    public final boolean f46384f;
    public final bi.d h;
    public final TextView f46385n;

    public z6(EditTextBoldCursor editTextBoldCursor, hd0 hd0Var, long j3, boolean z10, bi.d dVar, TextView textView) {
        this.f46383c = editTextBoldCursor;
        this.d = hd0Var;
        this.e = j3;
        this.f46384f = z10;
        this.h = dVar;
        this.f46385n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: xh.z6.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
