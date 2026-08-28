package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class xv0 extends qv0 {
    public final int f44645r = 0;
    public final org.telegram.ui.Components.vk0 f44646s;

    public xv0(zf.j1 j1Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.f44646s = j1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b6 b6Var;
        boolean q10;
        org.telegram.ui.ActionBar.b6 b6Var2;
        switch (this.f44645r) {
            case 0:
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                ImageView imageView = this.f42207c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((yv0) this.f44646s).f44958c;
                premiumPreviewFragment.O.reset();
                premiumPreviewFragment.O.postScale(1.0f, premiumPreviewFragment.J / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.O.postTranslate(0.0f, -this.f42209f.f38613e);
                premiumPreviewFragment.N.setLocalMatrix(premiumPreviewFragment.O);
                canvas.drawRoundRect(rectF, dp, dp, premiumPreviewFragment.P);
                b6Var = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).resourceProvider;
                if (b6Var != null) {
                    b6Var2 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).resourceProvider;
                    q10 = b6Var2.a();
                } else {
                    q10 = org.telegram.ui.ActionBar.f6.I.q();
                }
                if (q10) {
                    float dp2 = AndroidUtilities.dp(1.0f);
                    premiumPreviewFragment.M.setStrokeWidth(dp2);
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    rectF.offset(-rectF.left, -rectF.top);
                    float f10 = dp2 / 2.0f;
                    rectF.inset(f10, f10);
                    canvas.drawRoundRect(rectF, dp, dp, premiumPreviewFragment.M);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            default:
                RectF rectF2 = AndroidUtilities.rectTmp;
                ImageView imageView2 = this.f42207c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                zf.j1 j1Var = (zf.j1) this.f44646s;
                j1Var.f50557c.f50578l0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f42209f.f38613e, j1Var.f50557c.f50567a0);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), j1Var.f50557c.f50578l0.f50792f);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public xv0(yv0 yv0Var, Context context) {
        super(context, null);
        this.f44646s = yv0Var;
    }
}
