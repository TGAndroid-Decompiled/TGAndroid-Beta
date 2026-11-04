package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
public final class vu0 extends vq0 {
    public final ProfileActivity T;

    public vu0(ProfileActivity profileActivity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = profileActivity;
    }

    @Override
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        if (f10 > 0.0f) {
            RectF rectF = org.telegram.messenger.g0.P;
            ProfileActivity profileActivity = this.T;
            rectF.set(0.0f, 0.0f, profileActivity.f41817o0.getMeasuredWidth(), org.telegram.messenger.g0.L(30.0f) + profileActivity.f41817o0.getMeasuredHeight());
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f10), 31);
            profileActivity.Z.draw(canvas);
            canvas.save();
            kVar = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
            float x10 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
            canvas.translate(x10, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
            kVar3.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.fh0 fh0Var = profileActivity.f41845s;
            if (fh0Var != null && fh0Var.getVisibility() == 0 && profileActivity.f41845s.getAlpha() > 0.0f) {
                canvas.save();
                float f15 = (f10 * 0.5f) + 0.5f;
                canvas.scale(f15, f15, (profileActivity.f41845s.getMeasuredWidth() / 2.0f) + profileActivity.f41845s.getX(), (profileActivity.f41845s.getMeasuredHeight() / 2.0f) + profileActivity.f41845s.getY());
                canvas.translate(profileActivity.f41845s.getX(), profileActivity.f41845s.getY());
                profileActivity.f41845s.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        super.e();
        ProfileActivity profileActivity = this.T;
        profileActivity.fragmentView.invalidate();
        for (int i3 = 0; i3 < profileActivity.f41817o0.getChildCount(); i3++) {
            profileActivity.f41817o0.getChildAt(i3).invalidate();
        }
        org.telegram.ui.Components.fh0 fh0Var = profileActivity.f41845s;
        if (fh0Var != null) {
            fh0Var.invalidate();
        }
    }

    @Override
    public final boolean j(View view, ImageReceiver imageReceiver) {
        if (super.j(view, imageReceiver) && this.T.f41719a.getScrollState() != 1) {
            return true;
        }
        return false;
    }
}
