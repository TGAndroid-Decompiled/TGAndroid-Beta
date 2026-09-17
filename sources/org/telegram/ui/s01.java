package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class s01 extends URLSpan {
    public final String f40272a;
    public final a11 f40273b;

    public s01(a11 a11Var, String str, String str2) {
        super(str);
        this.f40273b = a11Var;
        this.f40272a = str2;
    }

    @Override
    public final void onClick(View view) {
        of.f.s(this.f40273b.f34292e.getParentActivity(), this.f40272a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
