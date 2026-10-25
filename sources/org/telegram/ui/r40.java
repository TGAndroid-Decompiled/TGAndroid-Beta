package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class r40 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.eq f42991x1;
    public final v50 f42992y1;

    public r40(v50 v50Var, LaunchActivity launchActivity, org.telegram.ui.Components.eq eqVar) {
        super(launchActivity, null);
        this.f42992y1 = v50Var;
        this.f42991x1 = eqVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.eq eqVar = this.f42991x1;
            eqVar.f27959f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            eqVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.k3) this.f42992y1).containerView;
            viewGroup.invalidate();
        }
    }
}
