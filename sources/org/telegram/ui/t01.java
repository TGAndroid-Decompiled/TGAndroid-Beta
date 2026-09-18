package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class t01 extends URLSpan {
    public final String f37604a;
    public final b11 f37605b;

    public t01(b11 b11Var, String str, String str2) {
        super(str);
        this.f37605b = b11Var;
        this.f37604a = str2;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f37605b.e.getParentActivity(), this.f37604a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
