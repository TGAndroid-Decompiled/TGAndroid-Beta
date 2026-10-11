package yh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.be0;
public final class q6 implements TextWatcher {
    public boolean f53167a;
    public int f53168b = 2;
    public final EditTextBoldCursor f53169c;
    public final be0 d;
    public final long f53170e;
    public final boolean f53171f;
    public final ci.d h;
    public final TextView f53172n;

    public q6(EditTextBoldCursor editTextBoldCursor, be0 be0Var, long j3, boolean z10, ci.d dVar, TextView textView) {
        this.f53169c = editTextBoldCursor;
        this.d = be0Var;
        this.f53170e = j3;
        this.f53171f = z10;
        this.h = dVar;
        this.f53172n = textView;
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
