package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class w41 extends ViewOutlineProvider {
    public final Rect f42923a = new Rect();
    public final Integer f42924b;
    public final b61 f42925c;

    public w41(b61 b61Var, Integer num) {
        this.f42925c = b61Var;
        this.f42924b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f42924b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        b61 b61Var = this.f42925c;
        boolean n10 = b61Var.n();
        Rect rect = this.f42923a;
        if (n10) {
            int paddingLeft = (int) ((dp - (b61Var.f35889a1 * dp)) + view.getPaddingLeft());
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, b61Var.f35892b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, b61Var.f35892b1, AndroidUtilities.dp(b61Var.f35897d1), y3), (int) (((width - dp) * b61Var.f35889a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, b61Var.f35892b1, AndroidUtilities.dp(b61Var.f35897d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (b61Var.f35889a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * b61Var.f35889a1) + view.getPaddingLeft() + dp), (int) ((height * b61Var.f35892b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
