package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.z81;
public final class k extends z81 {
    public final Path U;
    public final Paint V;
    public boolean W;
    public boolean f43457a0;
    public final boolean f43458b0;
    public final z0 f43459c0;
    public final f6 f43460d0;
    public final a0 f43461e0;
    public final m f43462f0;

    public k(m mVar, Context context, z0 z0Var, f6 f6Var, a0 a0Var) {
        super(context, null);
        this.f43462f0 = mVar;
        this.f43459c0 = z0Var;
        this.f43460d0 = f6Var;
        this.f43461e0 = a0Var;
        this.U = new Path();
        this.V = new Paint(1);
        this.f43458b0 = AndroidUtilities.isTablet();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        m mVar = this.f43462f0;
        k kVar = mVar.f43469b;
        int v02 = j6.v0(j6.f19180h5, this.f43460d0);
        Paint paint = this.V;
        paint.setColor(v02);
        if (this.W) {
            int i12 = -AndroidUtilities.dp(16.0f);
            a0 a0Var = this.f43461e0;
            int i13 = a0Var.f43403s0;
            if (a0Var.e.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int dp = AndroidUtilities.dp(10.0f) + Math.max(i12, i13 - i10);
            z0 z0Var = this.f43459c0;
            int i14 = z0Var.f43565t0;
            if (z0Var.m0.f23570c == 1.0f) {
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
            Path path = this.U;
            path.rewind();
            path.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        if (this.f43458b0 || mVar.d) {
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final float getAvailableTranslationX() {
        if (!this.f43458b0 && !this.f43462f0.d) {
            return super.getAvailableTranslationX();
        }
        return getMeasuredWidth();
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (this.f43462f0.f43469b.getCurrentPosition() == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = this.f43457a0;
        m mVar = this.f43462f0;
        if (z11 != mVar.isKeyboardVisible()) {
            boolean isKeyboardVisible = mVar.isKeyboardVisible();
            this.f43457a0 = isKeyboardVisible;
            if (isKeyboardVisible) {
                this.f43459c0.X(true);
            }
        }
    }

    @Override
    public final void u() {
        this.W = false;
        this.f43462f0.f43469b.invalidate();
    }

    @Override
    public final void w(boolean z10) {
        m mVar = this.f43462f0;
        k kVar = mVar.f43469b;
        float positionAnimated = kVar.getPositionAnimated();
        if (positionAnimated > 0.0f && positionAnimated < 1.0f) {
            if (!this.W) {
                this.W = true;
                if (mVar.isKeyboardVisible()) {
                    AndroidUtilities.hideKeyboard(mVar.f43470c.getContainerView());
                }
            }
        } else {
            this.W = false;
        }
        kVar.invalidate();
    }
}
