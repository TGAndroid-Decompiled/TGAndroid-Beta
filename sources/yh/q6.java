package yh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.zd0;
public final class q6 implements TextWatcher {
    public boolean f53078a;
    public int f53079b = 2;
    public final EditTextBoldCursor f53080c;
    public final zd0 d;
    public final long f53081e;
    public final boolean f53082f;
    public final ci.d h;
    public final TextView f53083n;

    public q6(EditTextBoldCursor editTextBoldCursor, zd0 zd0Var, long j3, boolean z10, ci.d dVar, TextView textView) {
        this.f53080c = editTextBoldCursor;
        this.d = zd0Var;
        this.f53081e = j3;
        this.f53082f = z10;
        this.h = dVar;
        this.f53083n = textView;
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
