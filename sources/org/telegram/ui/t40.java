package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class t40 extends rv0 {
    public final j60 T;

    public t40(j60 j60Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = j60Var;
    }

    @Override
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        j60 j60Var = this.T;
        d40 d40Var = j60Var.f33938b;
        e40 e40Var = j60Var.C2;
        if (f7 > 0.0f) {
            float x10 = e40Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
            float x11 = viewGroup.getX() + x10;
            float y3 = e40Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
            float y10 = viewGroup2.getY() + y3;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x11, y10, d40Var.getMeasuredWidth() + x11, d40Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
            canvas.translate(x11, y10);
            e40Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        d40 d40Var = this.T.f33938b;
        super.e();
        for (int i10 = 0; i10 < d40Var.getChildCount(); i10++) {
            d40Var.getChildAt(i10).invalidate();
        }
    }
}
