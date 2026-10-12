package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class s01 extends URLSpan {
    public final String f41778a;
    public final a11 f41779b;

    public s01(a11 a11Var, String str, String str2) {
        super(str);
        this.f41779b = a11Var;
        this.f41778a = str2;
    }

    @Override
    public final void onClick(View view) {
        of.f.s(this.f41779b.f35666e.getParentActivity(), this.f41778a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
