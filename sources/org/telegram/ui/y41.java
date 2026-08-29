package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class y41 extends ViewOutlineProvider {
    public final Rect f44743a = new Rect();
    public final Integer f44744b;
    public final d61 f44745c;

    public y41(d61 d61Var, Integer num) {
        this.f44745c = d61Var;
        this.f44744b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f44744b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        d61 d61Var = this.f44745c;
        boolean n10 = d61Var.n();
        Rect rect = this.f44743a;
        if (n10) {
            int paddingLeft = (int) ((dp - (d61Var.W0 * dp)) + view.getPaddingLeft());
            float z10 = com.google.android.recaptcha.internal.a.z(1.0f, d61Var.X0, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.recaptcha.internal.a.z(1.0f, d61Var.X0, AndroidUtilities.dp(d61Var.Z0), z10), (int) (((width - dp) * d61Var.W0) + view.getPaddingLeft() + dp), (int) com.google.android.recaptcha.internal.a.z(1.0f, d61Var.X0, AndroidUtilities.dp(d61Var.Z0), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (d61Var.W0 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * d61Var.W0) + view.getPaddingLeft() + dp), (int) ((height * d61Var.X0) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
