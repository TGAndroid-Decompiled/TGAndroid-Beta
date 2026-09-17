package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class s01 extends URLSpan {
    public final String f40299a;
    public final a11 f40300b;

    public s01(a11 a11Var, String str, String str2) {
        super(str);
        this.f40300b = a11Var;
        this.f40299a = str2;
    }

    @Override
    public final void onClick(View view) {
        of.f.s(this.f40300b.f34319e.getParentActivity(), this.f40299a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
