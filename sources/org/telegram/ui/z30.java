package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class z30 extends vu0 {
    public final q50 T;

    public z30(q50 q50Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = q50Var;
    }

    @Override
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        q50 q50Var = this.T;
        j30 j30Var = q50Var.f40382b;
        k30 k30Var = q50Var.C2;
        if (f7 > 0.0f) {
            float x10 = k30Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
            float x11 = viewGroup.getX() + x10;
            float y3 = k30Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
            float y10 = viewGroup2.getY() + y3;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x11, y10, j30Var.getMeasuredWidth() + x11, j30Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
            canvas.translate(x11, y10);
            k30Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        j30 j30Var = this.T.f40382b;
        super.e();
        for (int i10 = 0; i10 < j30Var.getChildCount(); i10++) {
            j30Var.getChildAt(i10).invalidate();
        }
    }
}
