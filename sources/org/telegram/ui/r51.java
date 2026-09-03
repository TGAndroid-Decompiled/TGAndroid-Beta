package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class r51 extends ViewOutlineProvider {
    public final Rect f37712a = new Rect();
    public final Integer f37713b;
    public final x61 f37714c;

    public r51(x61 x61Var, Integer num) {
        this.f37714c = x61Var;
        this.f37713b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f37713b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        x61 x61Var = this.f37714c;
        boolean n10 = x61Var.n();
        Rect rect = this.f37712a;
        if (n10) {
            int paddingLeft = (int) ((dp - (x61Var.X0 * dp)) + view.getPaddingLeft());
            float w10 = e2.c.w(1.0f, x61Var.Y0, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) e2.c.w(1.0f, x61Var.Y0, AndroidUtilities.dp(x61Var.f39853a1), w10), (int) (((width - dp) * x61Var.X0) + view.getPaddingLeft() + dp), (int) e2.c.w(1.0f, x61Var.Y0, AndroidUtilities.dp(x61Var.f39853a1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (x61Var.X0 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * x61Var.X0) + view.getPaddingLeft() + dp), (int) ((height * x61Var.Y0) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
