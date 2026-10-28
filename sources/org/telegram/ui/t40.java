package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class t40 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.eq f43490x1;
    public final x50 f43491y1;

    public t40(x50 x50Var, LaunchActivity launchActivity, org.telegram.ui.Components.eq eqVar) {
        super(launchActivity, null);
        this.f43491y1 = x50Var;
        this.f43490x1 = eqVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.eq eqVar = this.f43490x1;
            eqVar.f27906f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
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
            viewGroup = ((org.telegram.ui.ActionBar.k3) this.f43491y1).containerView;
            viewGroup.invalidate();
        }
    }
}
