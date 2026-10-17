package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class vz0 extends URLSpan {
    public final String f42300a;
    public final d01 f42301b;

    public vz0(d01 d01Var, String str, String str2) {
        super(str);
        this.f42301b = d01Var;
        this.f42300a = str2;
    }

    @Override
    public final void onClick(View view) {
        pf.d.r(this.f42301b.e.getParentActivity(), this.f42300a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
