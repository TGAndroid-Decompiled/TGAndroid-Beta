package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class uj0 extends ClickableSpan {
    public final ek0 f50514a;

    public uj0(ek0 ek0Var) {
        this.f50514a = ek0Var;
    }

    @Override
    public final void onClick(View view) {
        ek0 ek0Var = this.f50514a;
        vf.c.t(ek0Var.getParentActivity(), ek0Var.D.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
    }
}
