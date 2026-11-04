package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class tv0 extends URLSpan {
    public final String f49895a;
    public final bw0 f49896b;

    public tv0(bw0 bw0Var, String str, String str2) {
        super(str);
        this.f49896b = bw0Var;
        this.f49895a = str2;
    }

    @Override
    public final void onClick(View view) {
        sf.c.t(this.f49896b.f44157e.getParentActivity(), this.f49895a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
