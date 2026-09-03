package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class r51 extends ViewOutlineProvider {
    public final Rect f40754a = new Rect();
    public final Integer f40755b;
    public final w61 f40756c;

    public r51(w61 w61Var, Integer num) {
        this.f40756c = w61Var;
        this.f40755b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f40755b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        w61 w61Var = this.f40756c;
        boolean n10 = w61Var.n();
        Rect rect = this.f40754a;
        if (n10) {
            int paddingLeft = (int) ((dp - (w61Var.X0 * dp)) + view.getPaddingLeft());
            float w10 = e2.c.w(1.0f, w61Var.Y0, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) e2.c.w(1.0f, w61Var.Y0, AndroidUtilities.dp(w61Var.f42304a1), w10), (int) (((width - dp) * w61Var.X0) + view.getPaddingLeft() + dp), (int) e2.c.w(1.0f, w61Var.Y0, AndroidUtilities.dp(w61Var.f42304a1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (w61Var.X0 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * w61Var.X0) + view.getPaddingLeft() + dp), (int) ((height * w61Var.Y0) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
