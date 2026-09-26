package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class sw0 extends lw0 {
    public final int f37877r = 0;
    public final org.telegram.ui.Components.wl0 f37878s;

    public sw0(rg.j1 j1Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f37878s = j1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d6 d6Var;
        boolean q6;
        org.telegram.ui.ActionBar.d6 d6Var2;
        switch (this.f37877r) {
            case 0:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.f35423c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((tw0) this.f37878s).f38247c;
                premiumPreviewFragment.S.reset();
                premiumPreviewFragment.S.postScale(1.0f, premiumPreviewFragment.N / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.S.postTranslate(0.0f, -this.f35424f.e);
                premiumPreviewFragment.R.setLocalMatrix(premiumPreviewFragment.S);
                canvas.drawRoundRect(rectF, dp, dp, premiumPreviewFragment.T);
                d6Var = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).resourceProvider;
                if (d6Var != null) {
                    d6Var2 = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).resourceProvider;
                    q6 = d6Var2.a();
                } else {
                    q6 = org.telegram.ui.ActionBar.h6.I.q();
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
                ImageView imageView2 = this.f35423c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                rg.j1 j1Var = (rg.j1) this.f37878s;
                j1Var.f42618c.f42641p0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f35424f.e, j1Var.f42618c.f42631e0);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), j1Var.f42618c.f42641p0.f42839f);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public sw0(tw0 tw0Var, Context context) {
        super(context, null);
        this.f37878s = tw0Var;
    }
}
