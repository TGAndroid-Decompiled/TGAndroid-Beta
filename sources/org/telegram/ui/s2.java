package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s2 extends View {
    public final t2 f42537a;

    public s2(t2 t2Var, Context context) {
        super(context);
        this.f42537a = t2Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        t2 t2Var = this.f42537a;
        if (t2Var.d == null) {
            return;
        }
        int b10 = t2Var.f42812b.b();
        int dp2 = AndroidUtilities.dp(4.0f) + org.telegram.messenger.l0.D(6.0f, b10 - 1, AndroidUtilities.dp(7.0f) * b10);
        float f10 = t2Var.v + t2Var.f42818s;
        if (dp2 < getMeasuredWidth()) {
            dp = (getMeasuredWidth() - dp2) / 2.0f;
        } else {
            int dp3 = AndroidUtilities.dp(13.0f);
            int measuredWidth = ((getMeasuredWidth() - AndroidUtilities.dp(8.0f)) / 2) / dp3;
            dp = AndroidUtilities.dp(4.0f) - (Utilities.clamp(f10 - measuredWidth, Math.max(0, (b10 - (measuredWidth * 2)) - 1), 0.0f) * dp3);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        for (int i9 = 0; i9 < t2Var.d.items.size(); i9++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i9 - f10));
            float dp4 = (AndroidUtilities.dp(1.0f) * max) + AndroidUtilities.dp(2.0f);
            l4.f40010x1.setAlpha((int) ((max * 95.0f) + 160.0f));
            canvas.drawCircle(AndroidUtilities.dp(4.0f) + dp + (AndroidUtilities.dp(13.0f) * i9), getMeasuredHeight() / 2.0f, dp4, l4.f40010x1);
        }
        canvas.restore();
    }
}
