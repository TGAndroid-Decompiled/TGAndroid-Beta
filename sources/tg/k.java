package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.h91;
public final class k extends h91 {
    public final Path V;
    public final Paint W;
    public boolean f47039a0;
    public boolean f47040b0;
    public final boolean f47041c0;
    public final z0 f47042d0;
    public final d6 f47043e0;
    public final a0 f47044f0;
    public final m f47045g0;

    public k(m mVar, Context context, z0 z0Var, d6 d6Var, a0 a0Var) {
        super(context, null);
        this.f47045g0 = mVar;
        this.f47042d0 = z0Var;
        this.f47043e0 = d6Var;
        this.f47044f0 = a0Var;
        this.V = new Path();
        this.W = new Paint(1);
        this.f47041c0 = AndroidUtilities.isTablet();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        m mVar = this.f47045g0;
        k kVar = mVar.f47053b;
        int v02 = i6.v0(i6.f20899h5, this.f47043e0);
        Paint paint = this.W;
        paint.setColor(v02);
        if (this.f47039a0) {
            int i12 = -AndroidUtilities.dp(16.0f);
            a0 a0Var = this.f47044f0;
            int i13 = a0Var.f46982s0;
            if (a0Var.f25355e.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int dp = AndroidUtilities.dp(10.0f) + Math.max(i12, i13 - i10);
            z0 z0Var = this.f47042d0;
            int i14 = z0Var.f47153t0;
            if (z0Var.m0.f25987c == 1.0f) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            int max = Math.max(0, i14 - i11);
            int abs = Math.abs(dp - max);
            if (kVar.getCurrentPosition() == 0) {
                float positionAnimated = kVar.getPositionAnimated() * abs;
                if (dp < max) {
                    f7 = dp + positionAnimated;
                } else {
                    f7 = dp - positionAnimated;
                }
            } else {
                float positionAnimated2 = (1.0f - kVar.getPositionAnimated()) * abs;
                if (max < dp) {
                    f7 = max + positionAnimated2;
                } else {
                    f7 = max - positionAnimated2;
                }
            }
            int i15 = (int) f7;
            float dp2 = AndroidUtilities.dp(14.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, i15, getWidth(), AndroidUtilities.dp(8.0f) + getHeight());
            canvas.drawRoundRect(rectF, dp2, dp2, paint);
            canvas.save();
            Path path = this.V;
            path.rewind();
            path.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        if (this.f47041c0 || mVar.d) {
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final float getAvailableTranslationX() {
        if (!this.f47041c0 && !this.f47045g0.d) {
            return super.getAvailableTranslationX();
        }
        return getMeasuredWidth();
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (this.f47045g0.f47053b.getCurrentPosition() == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = this.f47040b0;
        m mVar = this.f47045g0;
        if (z11 != mVar.isKeyboardVisible()) {
            boolean isKeyboardVisible = mVar.isKeyboardVisible();
            this.f47040b0 = isKeyboardVisible;
            if (isKeyboardVisible) {
                this.f47042d0.W(true);
            }
        }
    }

    @Override
    public final void u() {
        this.f47039a0 = false;
        this.f47045g0.f47053b.invalidate();
    }

    @Override
    public final void w(boolean z10) {
        m mVar = this.f47045g0;
        k kVar = mVar.f47053b;
        float positionAnimated = kVar.getPositionAnimated();
        if (positionAnimated > 0.0f && positionAnimated < 1.0f) {
            if (!this.f47039a0) {
                this.f47039a0 = true;
                if (mVar.isKeyboardVisible()) {
                    AndroidUtilities.hideKeyboard(mVar.f47054c.getContainerView());
                }
            }
        } else {
            this.f47039a0 = false;
        }
        kVar.invalidate();
    }
}
