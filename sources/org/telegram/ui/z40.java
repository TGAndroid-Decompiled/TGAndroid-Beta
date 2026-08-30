package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class z40 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.pp f40670q1;
    public final c60 f40671r1;

    public z40(c60 c60Var, LaunchActivity launchActivity, org.telegram.ui.Components.pp ppVar) {
        super(launchActivity, null);
        this.f40671r1 = c60Var;
        this.f40670q1 = ppVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.pp ppVar = this.f40670q1;
            ppVar.f27965f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            ppVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f10) {
        ViewGroup viewGroup;
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.f40671r1).containerView;
            viewGroup.invalidate();
        }
    }
}
