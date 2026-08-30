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
    public final Rect f40374a;
    public final RectF f40375b;
    public final Path f40376c;
    public final c60 d;

    public y30(c60 c60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = c60Var;
        this.f40374a = new Rect();
        this.f40375b = new RectF();
        this.f40376c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.t tVar;
        c60 c60Var = this.d;
        x30 x30Var = c60Var.f33101b;
        if (c60Var.a2 != 1.0f) {
            if (c60Var.U2 != null && c60Var.Y2) {
                canvas.save();
                float measuredHeight = (c60Var.U2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / c60Var.U2.getAvatarImageView().getMeasuredHeight());
                float f10 = c60Var.a2;
                int dp = (int) ((AndroidUtilities.dp(13.0f) * f10) + ((1.0f - c60Var.a2) * measuredHeight));
                int i10 = (int) ((1.0f - f10) * measuredHeight);
                c60Var.U2.getAvatarWavesDrawable().a(canvas, c60Var.U2.getAvatarImageView().getMeasuredHeight() / 2, c60Var.U2.getAvatarImageView().getMeasuredHeight() / 2, this);
                c60Var.U2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                c60Var.U2.getAvatarImageView().r(dp, dp, i10, i10);
                c60Var.U2.getAvatarImageView().getImageReceiver().draw(canvas);
                c60Var.U2.getAvatarImageView().setRoundRadius(c60Var.U2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (c60Var.X2 != null && c60Var.W2 == null && c60Var.L2) {
                canvas.save();
                float measuredHeight2 = (c60Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / c60Var.X2.getAvatarImageView().getMeasuredHeight());
                float f11 = c60Var.a2;
                int dp2 = (int) ((AndroidUtilities.dp(13.0f) * f11) + ((1.0f - c60Var.a2) * measuredHeight2));
                int i11 = (int) ((1.0f - f11) * measuredHeight2);
                c60Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                c60Var.X2.getAvatarImageView().r(dp2, dp2, i11, i11);
                c60Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                c60Var.X2.getAvatarImageView().setRoundRadius(c60Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        x30Var.setAlpha(c60Var.a2);
        Path path = this.f40376c;
        path.reset();
        RectF rectF = this.f40375b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (x30Var.f29476f1) {
            for (int i12 = 0; i12 < x30Var.getChildCount(); i12++) {
                childAt = x30Var.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Components.sh0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (tVar = c60Var.W2) != null && tVar.v && !c60Var.C2) {
            canvas.save();
            Rect rect = this.f40374a;
            rect.setEmpty();
            x30Var.getChildVisibleRect(childAt, rect, null);
            int i13 = rect.left;
            if (i13 < (-x30Var.getMeasuredWidth())) {
                i13 += x30Var.getMeasuredWidth() * 2;
            } else if (i13 > x30Var.getMeasuredWidth()) {
                i13 -= x30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i13, 0.0f);
            c60Var.W2.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.d).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
