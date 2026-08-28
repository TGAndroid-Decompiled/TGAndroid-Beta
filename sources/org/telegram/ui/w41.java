package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class w41 extends ViewOutlineProvider {
    public final Rect f43668a = new Rect();
    public final Integer f43669b;
    public final b61 f43670c;

    public w41(b61 b61Var, Integer num) {
        this.f43670c = b61Var;
        this.f43669b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f43669b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        b61 b61Var = this.f43670c;
        boolean n10 = b61Var.n();
        Rect rect = this.f43668a;
        if (n10) {
            int paddingLeft = (int) ((dp - (b61Var.W0 * dp)) + view.getPaddingLeft());
            float z10 = e2.c.z(1.0f, b61Var.X0, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) e2.c.z(1.0f, b61Var.X0, AndroidUtilities.dp(b61Var.Z0), z10), (int) (((width - dp) * b61Var.W0) + view.getPaddingLeft() + dp), (int) e2.c.z(1.0f, b61Var.X0, AndroidUtilities.dp(b61Var.Z0), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (b61Var.W0 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * b61Var.W0) + view.getPaddingLeft() + dp), (int) ((height * b61Var.X0) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
