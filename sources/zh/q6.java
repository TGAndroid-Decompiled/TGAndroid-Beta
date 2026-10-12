package zh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yd0;
public final class q6 implements TextWatcher {
    public boolean f51026a;
    public int f51027b = 2;
    public final EditTextBoldCursor f51028c;
    public final yd0 d;
    public final long e;
    public final boolean f51029f;
    public final di.d h;
    public final TextView f51030n;

    public q6(EditTextBoldCursor editTextBoldCursor, yd0 yd0Var, long j10, boolean z10, di.d dVar, TextView textView) {
        this.f51028c = editTextBoldCursor;
        this.d = yd0Var;
        this.e = j10;
        this.f51029f = z10;
        this.h = dVar;
        this.f51030n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: zh.q6.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
