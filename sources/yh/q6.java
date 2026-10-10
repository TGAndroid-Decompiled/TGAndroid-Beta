package yh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ae0;
public final class q6 implements TextWatcher {
    public boolean f53124a;
    public int f53125b = 2;
    public final EditTextBoldCursor f53126c;
    public final ae0 d;
    public final long f53127e;
    public final boolean f53128f;
    public final ci.d h;
    public final TextView f53129n;

    public q6(EditTextBoldCursor editTextBoldCursor, ae0 ae0Var, long j3, boolean z10, ci.d dVar, TextView textView) {
        this.f53126c = editTextBoldCursor;
        this.d = ae0Var;
        this.f53127e = j3;
        this.f53128f = z10;
        this.h = dVar;
        this.f53129n = textView;
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
