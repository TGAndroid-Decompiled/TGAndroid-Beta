package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class x51 extends ViewOutlineProvider {
    public final Rect f42749a = new Rect();
    public final Integer f42750b;
    public final c71 f42751c;

    public x51(c71 c71Var, Integer num) {
        this.f42751c = c71Var;
        this.f42750b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f42750b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        c71 c71Var = this.f42751c;
        boolean n10 = c71Var.n();
        Rect rect = this.f42749a;
        if (n10) {
            int paddingLeft = (int) ((dp - (c71Var.f35297a1 * dp)) + view.getPaddingLeft());
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, c71Var.f35300b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.vision.e2.z(1.0f, c71Var.f35300b1, AndroidUtilities.dp(c71Var.f35305d1), z10), (int) (((width - dp) * c71Var.f35297a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.vision.e2.z(1.0f, c71Var.f35300b1, AndroidUtilities.dp(c71Var.f35305d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (c71Var.f35297a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * c71Var.f35297a1) + view.getPaddingLeft() + dp), (int) ((height * c71Var.f35300b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
