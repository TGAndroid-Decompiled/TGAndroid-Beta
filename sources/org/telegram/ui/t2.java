package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class t2 extends View {

    public final u2 f42764a;

    public t2(u2 u2Var, Context context) {
        super(context);
        this.f42764a = u2Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fClamp;
        u2 u2Var = this.f42764a;
        if (u2Var.d == null) {
            return;
        }
        int iB = u2Var.f43069b.b();
        int iDp = AndroidUtilities.dp(4.0f) + org.telegram.messenger.y1.D(6.0f, iB - 1, AndroidUtilities.dp(7.0f) * iB);
        float f10 = u2Var.v + u2Var.f43075s;
        if (iDp < getMeasuredWidth()) {
            fClamp = (getMeasuredWidth() - iDp) / 2.0f;
        } else {
            float fDp = AndroidUtilities.dp(4.0f);
            int iDp2 = AndroidUtilities.dp(13.0f);
            int measuredWidth = ((getMeasuredWidth() - AndroidUtilities.dp(8.0f)) / 2) / iDp2;
            fClamp = fDp - (Utilities.clamp(f10 - measuredWidth, Math.max(0, (iB - (measuredWidth * 2)) - 1), 0.0f) * iDp2);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        for (int i10 = 0; i10 < u2Var.d.items.size(); i10++) {
            float fMax = Math.max(0.0f, 1.0f - Math.abs(i10 - f10));
            float fDp2 = (AndroidUtilities.dp(1.0f) * fMax) + AndroidUtilities.dp(2.0f);
            m4.f40331x1.setAlpha((int) ((fMax * 95.0f) + 160.0f));
            canvas.drawCircle(AndroidUtilities.dp(4.0f) + fClamp + (AndroidUtilities.dp(13.0f) * i10), getMeasuredHeight() / 2.0f, fDp2, m4.f40331x1);
        }
        canvas.restore();
    }
}
