package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class tz0 extends URLSpan {
    public final String f41777a;
    public final b01 f41778b;

    public tz0(b01 b01Var, String str, String str2) {
        super(str);
        this.f41778b = b01Var;
        this.f41777a = str2;
    }

    @Override
    public final void onClick(View view) {
        pf.d.r(this.f41778b.e.getParentActivity(), this.f41777a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
