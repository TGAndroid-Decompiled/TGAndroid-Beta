package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class zn0 extends ClickableSpan {
    public final co0 f45190a;

    public zn0(co0 co0Var) {
        this.f45190a = co0Var;
    }

    @Override
    public final void onClick(View view) {
        co0 co0Var = this.f45190a;
        co0Var.presentFragment(new ag1(6, co0Var.W));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
