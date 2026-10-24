package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class wz0 extends URLSpan {
    public final String f43435a;
    public final e01 f43436b;

    public wz0(e01 e01Var, String str, String str2) {
        super(str);
        this.f43436b = e01Var;
        this.f43435a = str2;
    }

    @Override
    public final void onClick(View view) {
        pf.d.r(this.f43436b.e.getParentActivity(), this.f43435a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
