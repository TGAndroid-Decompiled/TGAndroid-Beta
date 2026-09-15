package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class r01 extends URLSpan {
    public final String f36986a;
    public final z01 f36987b;

    public r01(z01 z01Var, String str, String str2) {
        super(str);
        this.f36987b = z01Var;
        this.f36986a = str2;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f36987b.e.getParentActivity(), this.f36986a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
