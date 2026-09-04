package zh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.zc0;
public final class w6 implements TextWatcher {
    public boolean f52803a;
    public int f52804b = 2;
    public final EditTextBoldCursor f52805c;
    public final zc0 d;
    public final long f52806e;
    public final boolean f52807f;
    public final di.d h;
    public final TextView f52808n;

    public w6(EditTextBoldCursor editTextBoldCursor, zc0 zc0Var, long j3, boolean z10, di.d dVar, TextView textView) {
        this.f52805c = editTextBoldCursor;
        this.d = zc0Var;
        this.f52806e = j3;
        this.f52807f = z10;
        this.h = dVar;
        this.f52808n = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r11) {
        throw new UnsupportedOperationException("Method not decompiled: zh.w6.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
