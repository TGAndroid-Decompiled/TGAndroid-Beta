package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class tz0 extends URLSpan {
    public final String f41778a;
    public final b01 f41779b;

    public tz0(b01 b01Var, String str, String str2) {
        super(str);
        this.f41779b = b01Var;
        this.f41778a = str2;
    }

    @Override
    public final void onClick(View view) {
        pf.d.r(this.f41779b.e.getParentActivity(), this.f41778a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
