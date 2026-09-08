package zh;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.zc0;
public final class w6 implements TextWatcher {
    public boolean f52834a;
    public int f52835b = 2;
    public final EditTextBoldCursor f52836c;
    public final zc0 d;
    public final long f52837e;
    public final boolean f52838f;
    public final di.d h;
    public final TextView f52839n;

    public w6(EditTextBoldCursor editTextBoldCursor, zc0 zc0Var, long j3, boolean z10, di.d dVar, TextView textView) {
        this.f52836c = editTextBoldCursor;
        this.d = zc0Var;
        this.f52837e = j3;
        this.f52838f = z10;
        this.h = dVar;
        this.f52839n = textView;
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
