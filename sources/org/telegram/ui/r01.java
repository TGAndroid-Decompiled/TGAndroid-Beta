package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class r01 extends URLSpan {
    public final String f36926a;
    public final z01 f36927b;

    public r01(z01 z01Var, String str, String str2) {
        super(str);
        this.f36927b = z01Var;
        this.f36926a = str2;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f36927b.e.getParentActivity(), this.f36926a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
