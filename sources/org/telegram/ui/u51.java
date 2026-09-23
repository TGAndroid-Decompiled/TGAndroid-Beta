package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class u51 extends ViewOutlineProvider {
    public final Rect f37913a = new Rect();
    public final Integer f37914b;
    public final z61 f37915c;

    public u51(z61 z61Var, Integer num) {
        this.f37915c = z61Var;
        this.f37914b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f37914b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        z61 z61Var = this.f37915c;
        boolean n10 = z61Var.n();
        Rect rect = this.f37913a;
        if (n10) {
            int paddingLeft = (int) ((dp - (z61Var.f40005a1 * dp)) + view.getPaddingLeft());
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, z61Var.f40008b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.vision.e2.z(1.0f, z61Var.f40008b1, AndroidUtilities.dp(z61Var.f40013d1), z10), (int) (((width - dp) * z61Var.f40005a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.vision.e2.z(1.0f, z61Var.f40008b1, AndroidUtilities.dp(z61Var.f40013d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (z61Var.f40005a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * z61Var.f40005a1) + view.getPaddingLeft() + dp), (int) ((height * z61Var.f40008b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
