package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class tj0 extends ClickableSpan {
    public final dk0 f50192a;

    public tj0(dk0 dk0Var) {
        this.f50192a = dk0Var;
    }

    @Override
    public final void onClick(View view) {
        dk0 dk0Var = this.f50192a;
        vf.c.t(dk0Var.getParentActivity(), dk0Var.D.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
    }
}
