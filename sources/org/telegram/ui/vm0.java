package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vm0 extends ClickableSpan {
    public final gn0 f38766a;

    public vm0(gn0 gn0Var) {
        this.f38766a = gn0Var;
    }

    @Override
    public final void onClick(View view) {
        gn0 gn0Var = this.f38766a;
        nf.f.s(gn0Var.getParentActivity(), gn0Var.f34011y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
