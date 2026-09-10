package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class x01 extends URLSpan {
    public final String f38550a;
    public final f11 f38551b;

    public x01(f11 f11Var, String str, String str2) {
        super(str);
        this.f38551b = f11Var;
        this.f38550a = str2;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f38551b.e.getParentActivity(), this.f38550a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
