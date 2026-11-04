package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class x10 extends FrameLayout {
    public final Rect f51689a;
    public final RectF f51690b;
    public final Path f51691c;
    public final x30 d;

    public x10(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = x30Var;
        this.f51689a = new Rect();
        this.f51690b = new RectF();
        this.f51691c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.r rVar;
        x30 x30Var = this.d;
        w10 w10Var = x30Var.f51750j1;
        if (x30Var.V3 != 1.0f) {
            if (x30Var.P4 != null && x30Var.T4) {
                canvas.save();
                float measuredHeight = (x30Var.P4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / x30Var.P4.getAvatarImageView().getMeasuredHeight());
                float f10 = x30Var.V3;
                int L = (int) ((org.telegram.messenger.g0.L(13.0f) * f10) + ((1.0f - x30Var.V3) * measuredHeight));
                int i3 = (int) ((1.0f - f10) * measuredHeight);
                x30Var.P4.getAvatarWavesDrawable().a(canvas, x30Var.P4.getAvatarImageView().getMeasuredHeight() / 2, x30Var.P4.getAvatarImageView().getMeasuredHeight() / 2, this);
                x30Var.P4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                x30Var.P4.getAvatarImageView().t(L, L, i3, i3);
                x30Var.P4.getAvatarImageView().getImageReceiver().h(canvas, null);
                x30Var.P4.getAvatarImageView().setRoundRadius(x30Var.P4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (x30Var.S4 != null && x30Var.R4 == null && x30Var.G4) {
                canvas.save();
                float measuredHeight2 = (x30Var.S4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / x30Var.S4.getAvatarImageView().getMeasuredHeight());
                float f11 = x30Var.V3;
                int L2 = (int) ((org.telegram.messenger.g0.L(13.0f) * f11) + ((1.0f - x30Var.V3) * measuredHeight2));
                int i10 = (int) ((1.0f - f11) * measuredHeight2);
                x30Var.S4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                x30Var.S4.getAvatarImageView().t(L2, L2, i10, i10);
                x30Var.S4.getAvatarImageView().getImageReceiver().h(canvas, null);
                x30Var.S4.getAvatarImageView().setRoundRadius(x30Var.S4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        w10Var.setAlpha(x30Var.V3);
        Path path = this.f51691c;
        path.reset();
        RectF rectF = this.f51690b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (w10Var.f39101j1) {
            for (int i11 = 0; i11 < w10Var.getChildCount(); i11++) {
                childAt = w10Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.tf0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (rVar = x30Var.R4) != null && rVar.f39575w && !x30Var.f51817x4) {
            canvas.save();
            Rect rect = this.f51689a;
            rect.setEmpty();
            w10Var.getChildVisibleRect(childAt, rect, null);
            int i12 = rect.left;
            if (i12 < (-w10Var.getMeasuredWidth())) {
                i12 += w10Var.getMeasuredWidth() * 2;
            } else if (i12 > w10Var.getMeasuredWidth()) {
                i12 -= w10Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i12, 0.0f);
            x30Var.R4.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.d.f28586b.invalidate();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
