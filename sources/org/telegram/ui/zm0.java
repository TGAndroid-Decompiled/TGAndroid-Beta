package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zm0 extends ClickableSpan {
    public final kn0 f43861a;

    public zm0(kn0 kn0Var) {
        this.f43861a = kn0Var;
    }

    @Override
    public final void onClick(View view) {
        kn0 kn0Var = this.f43861a;
        nf.f.s(kn0Var.getParentActivity(), kn0Var.f38065y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
