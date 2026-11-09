package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.w61;
public final class j extends w61 {
    public final Path V;
    public final Paint W;
    public boolean f57760a0;
    public boolean f57761b0;
    public final boolean f57762c0;
    public final w0 f57763d0;
    public final g6 f57764e0;
    public final z f57765f0;
    public final l f57766g0;

    public j(l lVar, Context context, w0 w0Var, g6 g6Var, z zVar) {
        super(context, null);
        this.f57766g0 = lVar;
        this.f57763d0 = w0Var;
        this.f57764e0 = g6Var;
        this.f57765f0 = zVar;
        this.V = new Path();
        this.W = new Paint(1);
        this.f57762c0 = org.telegram.messenger.g0.Q1();
    }

    @Override
    public final boolean b(MotionEvent motionEvent) {
        if (this.f57766g0.f57770i1.getCurrentPosition() == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        int i10;
        float f10;
        l lVar = this.f57766g0;
        j jVar = lVar.f57770i1;
        int w02 = l6.w0(l6.f27938h5, this.f57764e0);
        Paint paint = this.W;
        paint.setColor(w02);
        if (this.f57760a0) {
            int i11 = -org.telegram.messenger.g0.L(16.0f);
            z zVar = this.f57765f0;
            int i12 = zVar.f57849k2;
            if (zVar.l1.getVisibility() == 0) {
                i7 = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.f22557m;
            } else {
                i7 = 0;
            }
            int L = org.telegram.messenger.g0.L(10.0f) + Math.max(i11, i12 - i7);
            w0 w0Var = this.f57763d0;
            int i13 = w0Var.f57829l2;
            if (w0Var.f57822e2.f39910c == 1.0f) {
                i10 = org.telegram.messenger.g0.f22557m;
            } else {
                i10 = 0;
            }
            int max = Math.max(0, i13 - i10);
            int abs = Math.abs(L - max);
            if (jVar.getCurrentPosition() == 0) {
                float positionAnimated = jVar.getPositionAnimated() * abs;
                if (L < max) {
                    f10 = L + positionAnimated;
                } else {
                    f10 = L - positionAnimated;
                }
            } else {
                float positionAnimated2 = (1.0f - jVar.getPositionAnimated()) * abs;
                if (max < L) {
                    f10 = max + positionAnimated2;
                } else {
                    f10 = max - positionAnimated2;
                }
            }
            int i14 = (int) f10;
            float L2 = org.telegram.messenger.g0.L(14.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, i14, getWidth(), org.telegram.messenger.g0.L(8.0f) + getHeight());
            canvas.drawRoundRect(rectF, L2, L2, paint);
            canvas.save();
            Path path = this.V;
            path.rewind();
            path.addRoundRect(rectF, L2, L2, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        if (this.f57762c0 || lVar.f57772k1) {
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final float getAvailableTranslationX() {
        if (!this.f57762c0 && !this.f57766g0.f57772k1) {
            return super.getAvailableTranslationX();
        }
        return getMeasuredWidth();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        boolean z10 = this.f57761b0;
        boolean z11 = this.f57766g0.d;
        if (z10 != z11) {
            this.f57761b0 = z11;
            if (z11) {
                this.f57763d0.j1(true);
            }
        }
    }

    @Override
    public final void u() {
        this.f57760a0 = false;
        this.f57766g0.f57770i1.invalidate();
    }

    @Override
    public final void w(boolean z9) {
        l lVar = this.f57766g0;
        j jVar = lVar.f57770i1;
        float positionAnimated = jVar.getPositionAnimated();
        if (positionAnimated > 0.0f && positionAnimated < 1.0f) {
            if (!this.f57760a0) {
                this.f57760a0 = true;
                if (lVar.d) {
                    org.telegram.messenger.g0.v1(lVar.f57771j1.f28624b);
                }
            }
        } else {
            this.f57760a0 = false;
        }
        jVar.invalidate();
    }
}
