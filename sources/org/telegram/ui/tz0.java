package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class tz0 extends URLSpan {
    public final String f41774a;
    public final b01 f41775b;

    public tz0(b01 b01Var, String str, String str2) {
        super(str);
        this.f41775b = b01Var;
        this.f41774a = str2;
    }

    @Override
    public final void onClick(View view) {
        pf.d.r(this.f41775b.e.getParentActivity(), this.f41774a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
