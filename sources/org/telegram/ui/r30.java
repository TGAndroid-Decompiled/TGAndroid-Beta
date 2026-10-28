package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r30 extends FrameLayout {
    public final Rect f42841a;
    public final RectF f42842b;
    public final Path f42843c;
    public final x50 d;

    public r30(x50 x50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = x50Var;
        this.f42841a = new Rect();
        this.f42842b = new RectF();
        this.f42843c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.t tVar;
        x50 x50Var = this.d;
        q30 q30Var = x50Var.f45493b;
        if (x50Var.f45505d2 != 1.0f) {
            if (x50Var.X2 != null && x50Var.f45497b3) {
                canvas.save();
                float measuredHeight = (x50Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / x50Var.X2.getAvatarImageView().getMeasuredHeight());
                float f7 = x50Var.f45505d2;
                int dp = (int) ((AndroidUtilities.dp(13.0f) * f7) + ((1.0f - x50Var.f45505d2) * measuredHeight));
                int i10 = (int) ((1.0f - f7) * measuredHeight);
                x50Var.X2.getAvatarWavesDrawable().a(canvas, x50Var.X2.getAvatarImageView().getMeasuredHeight() / 2, x50Var.X2.getAvatarImageView().getMeasuredHeight() / 2, this);
                x50Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                x50Var.X2.getAvatarImageView().r(dp, dp, i10, i10);
                x50Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                x50Var.X2.getAvatarImageView().setRoundRadius(x50Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (x50Var.f45492a3 != null && x50Var.Z2 == null && x50Var.O2) {
                canvas.save();
                float measuredHeight2 = (x50Var.f45492a3.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / x50Var.f45492a3.getAvatarImageView().getMeasuredHeight());
                float f10 = x50Var.f45505d2;
                int dp2 = (int) ((AndroidUtilities.dp(13.0f) * f10) + ((1.0f - x50Var.f45505d2) * measuredHeight2));
                int i11 = (int) ((1.0f - f10) * measuredHeight2);
                x50Var.f45492a3.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                x50Var.f45492a3.getAvatarImageView().r(dp2, dp2, i11, i11);
                x50Var.f45492a3.getAvatarImageView().getImageReceiver().draw(canvas);
                x50Var.f45492a3.getAvatarImageView().setRoundRadius(x50Var.f45492a3.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        q30Var.setAlpha(x50Var.f45505d2);
        Path path = this.f42843c;
        path.reset();
        RectF rectF = this.f42842b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (q30Var.f31303i1) {
            for (int i12 = 0; i12 < q30Var.getChildCount(); i12++) {
                childAt = q30Var.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Components.li0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (tVar = x50Var.Z2) != null && tVar.v && !x50Var.F2) {
            canvas.save();
            Rect rect = this.f42841a;
            rect.setEmpty();
            q30Var.getChildVisibleRect(childAt, rect, null);
            int i13 = rect.left;
            if (i13 < (-q30Var.getMeasuredWidth())) {
                i13 += q30Var.getMeasuredWidth() * 2;
            } else if (i13 > q30Var.getMeasuredWidth()) {
                i13 -= q30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i13, 0.0f);
            x50Var.Z2.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.d).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
