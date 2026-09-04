package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class s01 extends URLSpan {
    public final String f40271a;
    public final a11 f40272b;

    public s01(a11 a11Var, String str, String str2) {
        super(str);
        this.f40272b = a11Var;
        this.f40271a = str2;
    }

    @Override
    public final void onClick(View view) {
        of.f.s(this.f40272b.f34291e.getParentActivity(), this.f40271a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
