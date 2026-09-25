package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class z40 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.sp f40336t1;
    public final d60 f40337u1;

    public z40(d60 d60Var, LaunchActivity launchActivity, org.telegram.ui.Components.sp spVar) {
        super(launchActivity, null);
        this.f40337u1 = d60Var;
        this.f40336t1 = spVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.sp spVar = this.f40336t1;
            spVar.f28304f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            spVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f40337u1).containerView;
            viewGroup.invalidate();
        }
    }
}
