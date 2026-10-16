package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.l91;
public final class l extends l91 {
    public final Path T;
    public final Paint U;
    public boolean V;
    public boolean W;
    public final boolean f46328a0;
    public final z0 f46329b0;
    public final c6 f46330c0;
    public final a0 f46331d0;
    public final n f46332e0;

    public l(n nVar, Context context, z0 z0Var, c6 c6Var, a0 a0Var) {
        super(context, null);
        this.f46332e0 = nVar;
        this.f46329b0 = z0Var;
        this.f46330c0 = c6Var;
        this.f46331d0 = a0Var;
        this.T = new Path();
        this.U = new Paint(1);
        this.f46328a0 = AndroidUtilities.isTablet();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        n nVar = this.f46332e0;
        l lVar = nVar.f46364b;
        int w02 = g6.w0(g6.f19672h5, this.f46330c0);
        Paint paint = this.U;
        paint.setColor(w02);
        if (this.V) {
            int i12 = -AndroidUtilities.dp(16.0f);
            a0 a0Var = this.f46331d0;
            int i13 = a0Var.f46270s0;
            if (a0Var.e.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int dp = AndroidUtilities.dp(10.0f) + Math.max(i12, i13 - i10);
            z0 z0Var = this.f46329b0;
            int i14 = z0Var.f46431t0;
            if (z0Var.m0.f24885c == 1.0f) {
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
            Path path = this.T;
            path.rewind();
            path.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        if (this.f46328a0 || nVar.d) {
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final float getAvailableTranslationX() {
        if (!this.f46328a0 && !this.f46332e0.d) {
            return super.getAvailableTranslationX();
        }
        return getMeasuredWidth();
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (this.f46332e0.f46364b.getCurrentPosition() == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = this.W;
        n nVar = this.f46332e0;
        if (z11 != nVar.isKeyboardVisible()) {
            boolean isKeyboardVisible = nVar.isKeyboardVisible();
            this.W = isKeyboardVisible;
            if (isKeyboardVisible) {
                this.f46329b0.Y(true);
            }
        }
    }

    @Override
    public final void u() {
        this.V = false;
        this.f46332e0.f46364b.invalidate();
    }

    @Override
    public final void w(boolean z10) {
        n nVar = this.f46332e0;
        l lVar = nVar.f46364b;
        float positionAnimated = lVar.getPositionAnimated();
        if (positionAnimated > 0.0f && positionAnimated < 1.0f) {
            if (!this.V) {
                this.V = true;
                if (nVar.isKeyboardVisible()) {
                    AndroidUtilities.hideKeyboard(nVar.f46365c.getContainerView());
                }
            }
        } else {
            this.V = false;
        }
        lVar.invalidate();
    }
}
