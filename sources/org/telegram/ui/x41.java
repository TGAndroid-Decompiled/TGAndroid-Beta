package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class x41 extends ViewOutlineProvider {
    public final Rect f45640a = new Rect();
    public final Integer f45641b;
    public final c61 f45642c;

    public x41(c61 c61Var, Integer num) {
        this.f45642c = c61Var;
        this.f45641b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f45641b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        c61 c61Var = this.f45642c;
        boolean n10 = c61Var.n();
        Rect rect = this.f45640a;
        if (n10) {
            int paddingLeft = (int) ((dp - (c61Var.f38283a1 * dp)) + view.getPaddingLeft());
            float z10 = c3.h0.z(1.0f, c61Var.f38286b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) c3.h0.z(1.0f, c61Var.f38286b1, AndroidUtilities.dp(c61Var.f38291d1), z10), (int) (((width - dp) * c61Var.f38283a1) + view.getPaddingLeft() + dp), (int) c3.h0.z(1.0f, c61Var.f38286b1, AndroidUtilities.dp(c61Var.f38291d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (c61Var.f38283a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * c61Var.f38283a1) + view.getPaddingLeft() + dp), (int) ((height * c61Var.f38286b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
