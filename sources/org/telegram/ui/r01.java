package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class r01 extends URLSpan {
    public final String f37035a;
    public final z01 f37036b;

    public r01(z01 z01Var, String str, String str2) {
        super(str);
        this.f37036b = z01Var;
        this.f37035a = str2;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f37036b.e.getParentActivity(), this.f37035a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
