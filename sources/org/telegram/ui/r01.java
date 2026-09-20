package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class r01 extends URLSpan {
    public final String f37012a;
    public final z01 f37013b;

    public r01(z01 z01Var, String str, String str2) {
        super(str);
        this.f37013b = z01Var;
        this.f37012a = str2;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f37013b.e.getParentActivity(), this.f37012a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
