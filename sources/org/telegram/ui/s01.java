package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class s01 extends URLSpan {
    public final String f37237a;
    public final a11 f37238b;

    public s01(a11 a11Var, String str, String str2) {
        super(str);
        this.f37238b = a11Var;
        this.f37237a = str2;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f37238b.e.getParentActivity(), this.f37237a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
