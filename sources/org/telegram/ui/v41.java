package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

public final class v41 extends ViewOutlineProvider {

    public final Rect f43352a = new Rect();

    public final Integer f43353b;

    public final a61 f43354c;

    public v41(a61 a61Var, Integer num) {
        this.f43354c = a61Var;
        this.f43353b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        Integer num = this.f43353b;
        float width = (num == null ? view.getWidth() / 2.0f : num.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        a61 a61Var = this.f43354c;
        boolean zN = a61Var.n();
        Rect rect = this.f43352a;
        if (zN) {
            rect.set((int) ((width - (a61Var.W0 * width)) + view.getPaddingLeft()), (int) com.google.android.recaptcha.internal.a.z(1.0f, a61Var.X0, AndroidUtilities.dp(a61Var.Z0), com.google.android.recaptcha.internal.a.z(1.0f, a61Var.X0, height, view.getPaddingTop())), (int) (((width2 - width) * a61Var.W0) + view.getPaddingLeft() + width), (int) com.google.android.recaptcha.internal.a.z(1.0f, a61Var.X0, AndroidUtilities.dp(a61Var.Z0), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (a61Var.W0 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * a61Var.W0) + view.getPaddingLeft() + width), (int) ((height * a61Var.X0) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
