package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class z40 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.up f40445t1;
    public final d60 f40446u1;

    public z40(d60 d60Var, LaunchActivity launchActivity, org.telegram.ui.Components.up upVar) {
        super(launchActivity, null);
        this.f40446u1 = d60Var;
        this.f40445t1 = upVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.up upVar = this.f40445t1;
            upVar.f28905f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            upVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f40446u1).containerView;
            viewGroup.invalidate();
        }
    }
}
