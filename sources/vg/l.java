package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.v91;
public final class l extends v91 {
    public final Path V;
    public final Paint W;
    public boolean f50226a0;
    public boolean f50227b0;
    public final boolean f50228c0;
    public final z0 f50229d0;
    public final u6 f50230e0;
    public final a0 f50231f0;
    public final n f50232g0;

    public l(n nVar, Context context, z0 z0Var, u6 u6Var, a0 a0Var) {
        super(context, null);
        this.f50232g0 = nVar;
        this.f50229d0 = z0Var;
        this.f50230e0 = u6Var;
        this.f50231f0 = a0Var;
        this.V = new Path();
        this.W = new Paint(1);
        this.f50228c0 = AndroidUtilities.isTablet();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        n nVar = this.f50232g0;
        l lVar = nVar.f50242b;
        int w02 = y6.w0(y6.f23428h5, this.f50230e0);
        Paint paint = this.W;
        paint.setColor(w02);
        if (this.f50226a0) {
            int i12 = -AndroidUtilities.dp(16.0f);
            a0 a0Var = this.f50231f0;
            int i13 = a0Var.f50170s0;
            if (a0Var.e.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int dp = AndroidUtilities.dp(10.0f) + Math.max(i12, i13 - i10);
            z0 z0Var = this.f50229d0;
            int i14 = z0Var.f50334t0;
            if (z0Var.m0.f28864c == 1.0f) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            int max = Math.max(0, i14 - i11);
            int abs = Math.abs(dp - max);
            if (lVar.getCurrentPosition() == 0) {
                float positionAnimated = lVar.getPositionAnimated() * abs;
                if (dp < max) {
                    f7 = dp + positionAnimated;
                } else {
                    f7 = dp - positionAnimated;
                }
            } else {
                float positionAnimated2 = (1.0f - lVar.getPositionAnimated()) * abs;
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
        if (this.f50228c0 || nVar.d) {
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final float getAvailableTranslationX() {
        if (!this.f50228c0 && !this.f50232g0.d) {
            return super.getAvailableTranslationX();
        }
        return getMeasuredWidth();
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (this.f50232g0.f50242b.getCurrentPosition() == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = this.f50227b0;
        n nVar = this.f50232g0;
        if (z11 != nVar.isKeyboardVisible()) {
            boolean isKeyboardVisible = nVar.isKeyboardVisible();
            this.f50227b0 = isKeyboardVisible;
            if (isKeyboardVisible) {
                this.f50229d0.X(true);
            }
        }
    }

    @Override
    public final void u() {
        this.f50226a0 = false;
        this.f50232g0.f50242b.invalidate();
    }

    @Override
    public final void w(boolean z10) {
        n nVar = this.f50232g0;
        l lVar = nVar.f50242b;
        float positionAnimated = lVar.getPositionAnimated();
        if (positionAnimated > 0.0f && positionAnimated < 1.0f) {
            if (!this.f50226a0) {
                this.f50226a0 = true;
                if (nVar.isKeyboardVisible()) {
                    AndroidUtilities.hideKeyboard(nVar.f50243c.getContainerView());
                }
            }
        } else {
            this.f50226a0 = false;
        }
        lVar.invalidate();
    }
}
