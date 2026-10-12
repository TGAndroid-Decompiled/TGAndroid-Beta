package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class x01 extends URLSpan {
    public final String f41710a;
    public final f11 f41711b;

    public x01(f11 f11Var, String str, String str2) {
        super(str);
        this.f41711b = f11Var;
        this.f41710a = str2;
    }

    @Override
    public final void onClick(View view) {
        pf.d.s(this.f41711b.e.getParentActivity(), this.f41710a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
