package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class x51 extends ViewOutlineProvider {
    public final Rect f42750a = new Rect();
    public final Integer f42751b;
    public final c71 f42752c;

    public x51(c71 c71Var, Integer num) {
        this.f42752c = c71Var;
        this.f42751b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f42751b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        c71 c71Var = this.f42752c;
        boolean n10 = c71Var.n();
        Rect rect = this.f42750a;
        if (n10) {
            int paddingLeft = (int) ((dp - (c71Var.f35298a1 * dp)) + view.getPaddingLeft());
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, c71Var.f35301b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.vision.e2.z(1.0f, c71Var.f35301b1, AndroidUtilities.dp(c71Var.f35306d1), z10), (int) (((width - dp) * c71Var.f35298a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.vision.e2.z(1.0f, c71Var.f35301b1, AndroidUtilities.dp(c71Var.f35306d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (c71Var.f35298a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * c71Var.f35298a1) + view.getPaddingLeft() + dp), (int) ((height * c71Var.f35301b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
