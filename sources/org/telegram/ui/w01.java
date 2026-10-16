package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class w01 extends URLSpan {
    public final String f40819a;
    public final e11 f40820b;

    public w01(e11 e11Var, String str, String str2) {
        super(str);
        this.f40820b = e11Var;
        this.f40819a = str2;
    }

    @Override
    public final void onClick(View view) {
        pf.d.r(this.f40820b.e.getParentActivity(), this.f40819a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
