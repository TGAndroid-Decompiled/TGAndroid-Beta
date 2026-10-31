package rh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ec0;
public final class n7 implements TextWatcher {
    public boolean f47262a;
    public int f47263b = 2;
    public final EditTextBoldCursor f47264c;
    public final ec0 d;
    public final long e;
    public final boolean f47265f;
    public final vh.d h;
    public final TextView f47266n;

    public n7(EditTextBoldCursor editTextBoldCursor, ec0 ec0Var, long j10, boolean z10, vh.d dVar, TextView textView) {
        this.f47264c = editTextBoldCursor;
        this.d = ec0Var;
        this.e = j10;
        this.f47265f = z10;
        this.h = dVar;
        this.f47266n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: rh.n7.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
