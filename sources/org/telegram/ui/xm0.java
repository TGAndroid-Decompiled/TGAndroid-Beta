package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class xm0 extends ClickableSpan {
    public final in0 f45809a;

    public xm0(in0 in0Var) {
        this.f45809a = in0Var;
    }

    @Override
    public final void onClick(View view) {
        in0 in0Var = this.f45809a;
        qf.d.r(in0Var.getParentActivity(), in0Var.f40327y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
