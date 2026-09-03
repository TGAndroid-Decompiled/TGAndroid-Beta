package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class um0 extends ClickableSpan {
    public final fn0 f38891a;

    public um0(fn0 fn0Var) {
        this.f38891a = fn0Var;
    }

    @Override
    public final void onClick(View view) {
        fn0 fn0Var = this.f38891a;
        ze.d.s(fn0Var.getParentActivity(), fn0Var.f34165y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
