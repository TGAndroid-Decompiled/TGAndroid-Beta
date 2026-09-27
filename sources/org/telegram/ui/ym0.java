package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ym0 extends ClickableSpan {
    public final jn0 f40287a;

    public ym0(jn0 jn0Var) {
        this.f40287a = jn0Var;
    }

    @Override
    public final void onClick(View view) {
        jn0 jn0Var = this.f40287a;
        nf.f.s(jn0Var.getParentActivity(), jn0Var.f34822y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
