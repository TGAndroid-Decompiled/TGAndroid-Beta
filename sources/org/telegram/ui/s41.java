package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class s41 extends ViewOutlineProvider {
    public final Rect f41364a = new Rect();
    public final Integer f41365b;
    public final x51 f41366c;

    public s41(x51 x51Var, Integer num) {
        this.f41366c = x51Var;
        this.f41365b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f41365b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        x51 x51Var = this.f41366c;
        boolean n10 = x51Var.n();
        Rect rect = this.f41364a;
        if (n10) {
            int paddingLeft = (int) ((dp - (x51Var.f43045a1 * dp)) + view.getPaddingLeft());
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, x51Var.f43048b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, x51Var.f43048b1, AndroidUtilities.dp(x51Var.f43053d1), y3), (int) (((width - dp) * x51Var.f43045a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, x51Var.f43048b1, AndroidUtilities.dp(x51Var.f43053d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (x51Var.f43045a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * x51Var.f43045a1) + view.getPaddingLeft() + dp), (int) ((height * x51Var.f43048b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
