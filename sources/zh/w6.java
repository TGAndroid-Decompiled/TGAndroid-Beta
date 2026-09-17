package zh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.zc0;
public final class w6 implements TextWatcher {
    public boolean f52835a;
    public int f52836b = 2;
    public final EditTextBoldCursor f52837c;
    public final zc0 d;
    public final long f52838e;
    public final boolean f52839f;
    public final di.d h;
    public final TextView f52840n;

    public w6(EditTextBoldCursor editTextBoldCursor, zc0 zc0Var, long j3, boolean z10, di.d dVar, TextView textView) {
        this.f52837c = editTextBoldCursor;
        this.d = zc0Var;
        this.f52838e = j3;
        this.f52839f = z10;
        this.h = dVar;
        this.f52840n = textView;
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
