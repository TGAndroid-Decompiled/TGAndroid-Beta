package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class vz0 extends URLSpan {
    public final String f42324a;
    public final d01 f42325b;

    public vz0(d01 d01Var, String str, String str2) {
        super(str);
        this.f42325b = d01Var;
        this.f42324a = str2;
    }

    @Override
    public final void onClick(View view) {
        pf.d.r(this.f42325b.e.getParentActivity(), this.f42324a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
