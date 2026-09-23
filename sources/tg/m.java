package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h81;
public final class m extends h81 {
    public final Path T;
    public final Paint U;
    public boolean V;
    public boolean W;
    public final boolean f43114a0;
    public final a1 f43115b0;
    public final d6 f43116c0;
    public final b0 f43117d0;
    public final o f43118e0;

    public m(o oVar, Context context, a1 a1Var, d6 d6Var, b0 b0Var) {
        super(context, null);
        this.f43118e0 = oVar;
        this.f43115b0 = a1Var;
        this.f43116c0 = d6Var;
        this.f43117d0 = b0Var;
        this.T = new Path();
        this.U = new Paint(1);
        this.f43114a0 = AndroidUtilities.isTablet();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        o oVar = this.f43118e0;
        m mVar = oVar.f43150b;
        int v02 = h6.v0(h6.f18859h5, this.f43116c0);
        Paint paint = this.U;
        paint.setColor(v02);
        if (this.V) {
            int i12 = -AndroidUtilities.dp(16.0f);
            b0 b0Var = this.f43117d0;
            int i13 = b0Var.f43056s0;
            if (b0Var.e.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int dp = AndroidUtilities.dp(10.0f) + Math.max(i12, i13 - i10);
            a1 a1Var = this.f43115b0;
            int i14 = a1Var.f43033t0;
            if (a1Var.m0.f23575c == 1.0f) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            int max = Math.max(0, i14 - i11);
            int abs = Math.abs(dp - max);
            if (mVar.getCurrentPosition() == 0) {
                float positionAnimated = mVar.getPositionAnimated() * abs;
                if (dp < max) {
                    f7 = dp + positionAnimated;
                } else {
                    f7 = dp - positionAnimated;
                }
            } else {
                float positionAnimated2 = (1.0f - mVar.getPositionAnimated()) * abs;
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
        if (this.f43114a0 || oVar.d) {
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final float getAvailableTranslationX() {
        if (!this.f43114a0 && !this.f43118e0.d) {
            return super.getAvailableTranslationX();
        }
        return getMeasuredWidth();
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (this.f43118e0.f43150b.getCurrentPosition() == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = this.W;
        o oVar = this.f43118e0;
        if (z11 != oVar.isKeyboardVisible()) {
            boolean isKeyboardVisible = oVar.isKeyboardVisible();
            this.W = isKeyboardVisible;
            if (isKeyboardVisible) {
                this.f43115b0.X(true);
            }
        }
    }

    @Override
    public final void u() {
        this.V = false;
        this.f43118e0.f43150b.invalidate();
    }

    @Override
    public final void w(boolean z10) {
        o oVar = this.f43118e0;
        m mVar = oVar.f43150b;
        float positionAnimated = mVar.getPositionAnimated();
        if (positionAnimated > 0.0f && positionAnimated < 1.0f) {
            if (!this.V) {
                this.V = true;
                if (oVar.isKeyboardVisible()) {
                    AndroidUtilities.hideKeyboard(oVar.f43151c.getContainerView());
                }
            }
        } else {
            this.V = false;
        }
        mVar.invalidate();
    }
}
