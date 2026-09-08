package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class s01 extends URLSpan {
    public final String f40298a;
    public final a11 f40299b;

    public s01(a11 a11Var, String str, String str2) {
        super(str);
        this.f40299b = a11Var;
        this.f40298a = str2;
    }

    @Override
    public final void onClick(View view) {
        of.f.s(this.f40299b.f34318e.getParentActivity(), this.f40298a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
