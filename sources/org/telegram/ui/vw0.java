package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class vw0 extends ow0 {
    public final int f38721r = 0;
    public final org.telegram.ui.Components.xl0 f38722s;

    public vw0(rg.j1 j1Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f38722s = j1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean q6;
        org.telegram.ui.ActionBar.e6 e6Var2;
        switch (this.f38721r) {
            case 0:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.f36266c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((ww0) this.f38722s).f39467c;
                premiumPreviewFragment.S.reset();
                premiumPreviewFragment.S.postScale(1.0f, premiumPreviewFragment.N / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.S.postTranslate(0.0f, -this.f36267f.e);
                premiumPreviewFragment.R.setLocalMatrix(premiumPreviewFragment.S);
                canvas.drawRoundRect(rectF, dp, dp, premiumPreviewFragment.T);
                e6Var = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).resourceProvider;
                if (e6Var != null) {
                    e6Var2 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).resourceProvider;
                    q6 = e6Var2.a();
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
                ImageView imageView2 = this.f36266c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                rg.j1 j1Var = (rg.j1) this.f38722s;
                j1Var.f42664c.f42687p0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f36267f.e, j1Var.f42664c.f42677e0);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), j1Var.f42664c.f42687p0.f42885f);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public vw0(ww0 ww0Var, Context context) {
        super(context, null);
        this.f38722s = ww0Var;
    }
}
