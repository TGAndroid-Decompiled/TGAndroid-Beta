package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c91;
public final class j extends c91 {
    public final Path T;
    public final Paint U;
    public boolean V;
    public boolean W;
    public final boolean f47706a0;
    public final x0 f47707b0;
    public final d6 f47708c0;
    public final y f47709d0;
    public final l f47710e0;

    public j(l lVar, Context context, x0 x0Var, d6 d6Var, y yVar) {
        super(context, null);
        this.f47710e0 = lVar;
        this.f47707b0 = x0Var;
        this.f47708c0 = d6Var;
        this.f47709d0 = yVar;
        this.T = new Path();
        this.U = new Paint(1);
        this.f47706a0 = AndroidUtilities.isTablet();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        l lVar = this.f47710e0;
        j jVar = lVar.f47720b;
        int w02 = h6.w0(h6.f21057h5, this.f47708c0);
        Paint paint = this.U;
        paint.setColor(w02);
        if (this.V) {
            int i12 = -AndroidUtilities.dp(16.0f);
            y yVar = this.f47709d0;
            int i13 = yVar.f47832s0;
            if (yVar.e.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int dp = AndroidUtilities.dp(10.0f) + Math.max(i12, i13 - i10);
            x0 x0Var = this.f47707b0;
            int i14 = x0Var.f47812t0;
            if (x0Var.m0.f26093c == 1.0f) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            int max = Math.max(0, i14 - i11);
            int abs = Math.abs(dp - max);
            if (jVar.getCurrentPosition() == 0) {
                float positionAnimated = jVar.getPositionAnimated() * abs;
                if (dp < max) {
                    f7 = dp + positionAnimated;
                } else {
                    f7 = dp - positionAnimated;
                }
            } else {
                float positionAnimated2 = (1.0f - jVar.getPositionAnimated()) * abs;
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
            Path path = this.T;
            path.rewind();
            path.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        if (this.f47706a0 || lVar.d) {
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final float getAvailableTranslationX() {
        if (!this.f47706a0 && !this.f47710e0.d) {
            return super.getAvailableTranslationX();
        }
        return getMeasuredWidth();
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (this.f47710e0.f47720b.getCurrentPosition() == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = this.W;
        l lVar = this.f47710e0;
        if (z11 != lVar.isKeyboardVisible()) {
            boolean isKeyboardVisible = lVar.isKeyboardVisible();
            this.W = isKeyboardVisible;
            if (isKeyboardVisible) {
                this.f47707b0.Y(true);
            }
        }
    }

    @Override
    public final void u() {
        this.V = false;
        this.f47710e0.f47720b.invalidate();
    }

    @Override
    public final void w(boolean z10) {
        l lVar = this.f47710e0;
        j jVar = lVar.f47720b;
        float positionAnimated = jVar.getPositionAnimated();
        if (positionAnimated > 0.0f && positionAnimated < 1.0f) {
            if (!this.V) {
                this.V = true;
                if (lVar.isKeyboardVisible()) {
                    AndroidUtilities.hideKeyboard(lVar.f47721c.getContainerView());
                }
            }
        } else {
            this.V = false;
        }
        jVar.invalidate();
    }
}
