package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class vw0 extends ow0 {
    public final int f41845r = 0;
    public final org.telegram.ui.Components.yl0 f41846s;

    public vw0(rg.l1 l1Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f41846s = l1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d6 d6Var;
        boolean q6;
        org.telegram.ui.ActionBar.d6 d6Var2;
        switch (this.f41845r) {
            case 0:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.f39287c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((ww0) this.f41846s).f42642c;
                premiumPreviewFragment.S.reset();
                premiumPreviewFragment.S.postScale(1.0f, premiumPreviewFragment.N / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.S.postTranslate(0.0f, -this.f39289f.f36109e);
                premiumPreviewFragment.R.setLocalMatrix(premiumPreviewFragment.S);
                canvas.drawRoundRect(rectF, dp, dp, premiumPreviewFragment.T);
                d6Var = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).resourceProvider;
                if (d6Var != null) {
                    d6Var2 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).resourceProvider;
                    q6 = d6Var2.a();
                } else {
                    q6 = org.telegram.ui.ActionBar.i6.I.q();
                }
                if (q6) {
                    float dp2 = AndroidUtilities.dp(1.0f);
                    premiumPreviewFragment.Q.setStrokeWidth(dp2);
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    rectF.offset(-rectF.left, -rectF.top);
                    float f7 = dp2 / 2.0f;
                    rectF.inset(f7, f7);
                    canvas.drawRoundRect(rectF, dp, dp, premiumPreviewFragment.Q);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            default:
                RectF rectF2 = AndroidUtilities.rectTmp;
                ImageView imageView2 = this.f39287c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                rg.l1 l1Var = (rg.l1) this.f41846s;
                l1Var.f46183c.f46199p0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f39289f.f36109e, l1Var.f46183c.f46189e0);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), l1Var.f46183c.f46199p0.f46037f);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public vw0(ww0 ww0Var, Context context) {
        super(context, null);
        this.f41846s = ww0Var;
    }
}
