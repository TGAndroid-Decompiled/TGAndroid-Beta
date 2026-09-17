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
import org.telegram.ui.Components.j81;
public final class m extends j81 {
    public final Path U;
    public final Paint V;
    public boolean W;
    public boolean f43185a0;
    public final boolean f43186b0;
    public final a1 f43187c0;
    public final f6 f43188d0;
    public final b0 f43189e0;
    public final o f43190f0;

    public m(o oVar, Context context, a1 a1Var, f6 f6Var, b0 b0Var) {
        super(context, null);
        this.f43190f0 = oVar;
        this.f43187c0 = a1Var;
        this.f43188d0 = f6Var;
        this.f43189e0 = b0Var;
        this.U = new Path();
        this.V = new Paint(1);
        this.f43186b0 = AndroidUtilities.isTablet();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        o oVar = this.f43190f0;
        m mVar = oVar.f43222b;
        int v02 = j6.v0(j6.f18933h5, this.f43188d0);
        Paint paint = this.V;
        paint.setColor(v02);
        if (this.W) {
            int i12 = -AndroidUtilities.dp(16.0f);
            b0 b0Var = this.f43189e0;
            int i13 = b0Var.f43127s0;
            if (b0Var.e.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int dp = AndroidUtilities.dp(10.0f) + Math.max(i12, i13 - i10);
            a1 a1Var = this.f43187c0;
            int i14 = a1Var.f43104t0;
            if (a1Var.m0.f22937c == 1.0f) {
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
            Path path = this.U;
            path.rewind();
            path.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        if (this.f43186b0 || oVar.d) {
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final float getAvailableTranslationX() {
        if (!this.f43186b0 && !this.f43190f0.d) {
            return super.getAvailableTranslationX();
        }
        return getMeasuredWidth();
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (this.f43190f0.f43222b.getCurrentPosition() == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = this.f43185a0;
        o oVar = this.f43190f0;
        if (z11 != oVar.isKeyboardVisible()) {
            boolean isKeyboardVisible = oVar.isKeyboardVisible();
            this.f43185a0 = isKeyboardVisible;
            if (isKeyboardVisible) {
                this.f43187c0.X(true);
            }
        }
    }

    @Override
    public final void u() {
        this.W = false;
        this.f43190f0.f43222b.invalidate();
    }

    @Override
    public final void w(boolean z10) {
        o oVar = this.f43190f0;
        m mVar = oVar.f43222b;
        float positionAnimated = mVar.getPositionAnimated();
        if (positionAnimated > 0.0f && positionAnimated < 1.0f) {
            if (!this.W) {
                this.W = true;
                if (oVar.isKeyboardVisible()) {
                    AndroidUtilities.hideKeyboard(oVar.f43223c.getContainerView());
                }
            }
        } else {
            this.W = false;
        }
        mVar.invalidate();
    }
}
