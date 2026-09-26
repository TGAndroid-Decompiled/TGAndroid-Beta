package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class y30 extends FrameLayout {
    public final Rect f40046a;
    public final RectF f40047b;
    public final Path f40048c;
    public final d60 d;

    public y30(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = d60Var;
        this.f40046a = new Rect();
        this.f40047b = new RectF();
        this.f40048c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.u uVar;
        d60 d60Var = this.d;
        x30 x30Var = d60Var.f32937b;
        if (d60Var.f32949d2 != 1.0f) {
            if (d60Var.X2 != null && d60Var.f32941b3) {
                canvas.save();
                float measuredHeight = (d60Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / d60Var.X2.getAvatarImageView().getMeasuredHeight());
                float f7 = d60Var.f32949d2;
                int dp = (int) ((AndroidUtilities.dp(13.0f) * f7) + ((1.0f - d60Var.f32949d2) * measuredHeight));
                int i10 = (int) ((1.0f - f7) * measuredHeight);
                d60Var.X2.getAvatarWavesDrawable().a(canvas, d60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, d60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, this);
                d60Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                d60Var.X2.getAvatarImageView().r(dp, dp, i10, i10);
                d60Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                d60Var.X2.getAvatarImageView().setRoundRadius(d60Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (d60Var.f32936a3 != null && d60Var.Z2 == null && d60Var.O2) {
                canvas.save();
                float measuredHeight2 = (d60Var.f32936a3.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / d60Var.f32936a3.getAvatarImageView().getMeasuredHeight());
                float f10 = d60Var.f32949d2;
                int dp2 = (int) ((AndroidUtilities.dp(13.0f) * f10) + ((1.0f - d60Var.f32949d2) * measuredHeight2));
                int i11 = (int) ((1.0f - f10) * measuredHeight2);
                d60Var.f32936a3.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                d60Var.f32936a3.getAvatarImageView().r(dp2, dp2, i11, i11);
                d60Var.f32936a3.getAvatarImageView().getImageReceiver().draw(canvas);
                d60Var.f32936a3.getAvatarImageView().setRoundRadius(d60Var.f32936a3.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        x30Var.setAlpha(d60Var.f32949d2);
        Path path = this.f40048c;
        path.reset();
        RectF rectF = this.f40047b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (x30Var.f30886i1) {
            for (int i12 = 0; i12 < x30Var.getChildCount(); i12++) {
                childAt = x30Var.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Components.wh0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (uVar = d60Var.Z2) != null && uVar.v && !d60Var.F2) {
            canvas.save();
            Rect rect = this.f40046a;
            rect.setEmpty();
            x30Var.getChildVisibleRect(childAt, rect, null);
            int i13 = rect.left;
            if (i13 < (-x30Var.getMeasuredWidth())) {
                i13 += x30Var.getMeasuredWidth() * 2;
            } else if (i13 > x30Var.getMeasuredWidth()) {
                i13 -= x30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i13, 0.0f);
            d60Var.Z2.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.d).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
