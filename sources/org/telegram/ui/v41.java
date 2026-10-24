package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class v41 extends ViewOutlineProvider {
    public final Rect f42574a = new Rect();
    public final Integer f42575b;
    public final a61 f42576c;

    public v41(a61 a61Var, Integer num) {
        this.f42576c = a61Var;
        this.f42575b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f42575b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        a61 a61Var = this.f42576c;
        boolean n10 = a61Var.n();
        Rect rect = this.f42574a;
        if (n10) {
            int paddingLeft = (int) ((dp - (a61Var.f35606a1 * dp)) + view.getPaddingLeft());
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, a61Var.f35609b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, a61Var.f35609b1, AndroidUtilities.dp(a61Var.f35614d1), y3), (int) (((width - dp) * a61Var.f35606a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, a61Var.f35609b1, AndroidUtilities.dp(a61Var.f35614d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (a61Var.f35606a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * a61Var.f35606a1) + view.getPaddingLeft() + dp), (int) ((height * a61Var.f35609b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
