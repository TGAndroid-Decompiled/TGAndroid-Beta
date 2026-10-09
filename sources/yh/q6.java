package yh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.zd0;
public final class q6 implements TextWatcher {
    public boolean f53080a;
    public int f53081b = 2;
    public final EditTextBoldCursor f53082c;
    public final zd0 d;
    public final long f53083e;
    public final boolean f53084f;
    public final ci.d h;
    public final TextView f53085n;

    public q6(EditTextBoldCursor editTextBoldCursor, zd0 zd0Var, long j3, boolean z10, ci.d dVar, TextView textView) {
        this.f53082c = editTextBoldCursor;
        this.d = zd0Var;
        this.f53083e = j3;
        this.f53084f = z10;
        this.h = dVar;
        this.f53085n = textView;
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
