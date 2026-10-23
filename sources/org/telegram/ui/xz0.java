package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class xz0 extends URLSpan {
    public final String f43675a;
    public final f01 f43676b;

    public xz0(f01 f01Var, String str, String str2) {
        super(str);
        this.f43676b = f01Var;
        this.f43675a = str2;
    }

    @Override
    public final void onClick(View view) {
        pf.d.r(this.f43676b.e.getParentActivity(), this.f43675a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
