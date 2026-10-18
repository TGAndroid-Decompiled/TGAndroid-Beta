package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class u41 extends ViewOutlineProvider {
    public final Rect f41896a = new Rect();
    public final Integer f41897b;
    public final z51 f41898c;

    public u41(z51 z51Var, Integer num) {
        this.f41898c = z51Var;
        this.f41897b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f41897b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        z51 z51Var = this.f41898c;
        boolean n10 = z51Var.n();
        Rect rect = this.f41896a;
        if (n10) {
            int paddingLeft = (int) ((dp - (z51Var.f43606a1 * dp)) + view.getPaddingLeft());
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, z51Var.f43609b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, z51Var.f43609b1, AndroidUtilities.dp(z51Var.f43614d1), y3), (int) (((width - dp) * z51Var.f43606a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, z51Var.f43609b1, AndroidUtilities.dp(z51Var.f43614d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (z51Var.f43606a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * z51Var.f43606a1) + view.getPaddingLeft() + dp), (int) ((height * z51Var.f43609b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
