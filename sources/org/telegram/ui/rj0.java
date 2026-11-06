package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class rj0 extends ClickableSpan {
    public final bk0 f49524a;

    public rj0(bk0 bk0Var) {
        this.f49524a = bk0Var;
    }

    @Override
    public final void onClick(View view) {
        bk0 bk0Var = this.f49524a;
        vf.c.t(bk0Var.getParentActivity(), bk0Var.D.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
    }
}
