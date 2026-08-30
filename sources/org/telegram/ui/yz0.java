package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class yz0 extends URLSpan {
    public final String f40613a;
    public final g01 f40614b;

    public yz0(g01 g01Var, String str, String str2) {
        super(str);
        this.f40614b = g01Var;
        this.f40613a = str2;
    }

    @Override
    public final void onClick(View view) {
        af.g.s(this.f40614b.e.getParentActivity(), this.f40613a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
