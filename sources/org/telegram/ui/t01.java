package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class t01 extends URLSpan {
    public final String f37599a;
    public final b11 f37600b;

    public t01(b11 b11Var, String str, String str2) {
        super(str);
        this.f37600b = b11Var;
        this.f37599a = str2;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f37600b.e.getParentActivity(), this.f37599a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
