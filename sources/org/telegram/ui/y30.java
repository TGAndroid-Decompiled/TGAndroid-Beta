package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class y30 extends nu0 {
    public final o50 T;

    public y30(o50 o50Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = o50Var;
    }

    @Override
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        o50 o50Var = this.T;
        i30 i30Var = o50Var.f40883b;
        j30 j30Var = o50Var.f40985y2;
        if (f10 > 0.0f) {
            float x10 = j30Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
            float x11 = viewGroup.getX() + x10;
            float y10 = j30Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
            float y11 = viewGroup2.getY() + y10;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x11, y11, i30Var.getMeasuredWidth() + x11, i30Var.getMeasuredHeight() + y11);
            canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
            canvas.translate(x11, y11);
            j30Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        i30 i30Var = this.T.f40883b;
        super.e();
        for (int i9 = 0; i9 < i30Var.getChildCount(); i9++) {
            i30Var.getChildAt(i9).invalidate();
        }
    }
}
