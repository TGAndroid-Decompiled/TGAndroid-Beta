package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class u61 extends FrameLayout {
    public final int f52453a;
    public final RectF f52454b;
    public final x71 f52455c;

    public u61(x71 x71Var, Context context, int i7) {
        super(context);
        this.f52453a = i7;
        switch (i7) {
            case 1:
                this.f52455c = x71Var;
                super(context);
                this.f52454b = new RectF();
                return;
            default:
                this.f52455c = x71Var;
                this.f52454b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f52453a) {
            case 0:
                RectF rectF = this.f52454b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                x71 x71Var = this.f52455c;
                u61 u61Var = x71Var.F0;
                n71 n71Var = x71Var.f53751z0;
                w61 w61Var = x71Var.f53682a;
                org.telegram.ui.ActionBar.n6.t(u61Var, n71Var, w61Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, w61Var.g("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.n6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, w61Var.g("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f52454b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                x71 x71Var2 = this.f52455c;
                u61 u61Var2 = x71Var2.G0;
                n71 n71Var2 = x71Var2.f53751z0;
                w61 w61Var2 = x71Var2.f53682a;
                org.telegram.ui.ActionBar.n6.t(u61Var2, n71Var2, w61Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, w61Var2.g("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.n6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, w61Var2.g("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
