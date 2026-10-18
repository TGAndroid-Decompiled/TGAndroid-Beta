package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class vz0 extends URLSpan {
    public final String f42297a;
    public final d01 f42298b;

    public vz0(d01 d01Var, String str, String str2) {
        super(str);
        this.f42298b = d01Var;
        this.f42297a = str2;
    }

    @Override
    public final void onClick(View view) {
        pf.d.r(this.f42298b.e.getParentActivity(), this.f42297a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
