package xg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.n61;
public final class l extends n61 {
    public final Path W;
    public final Paint f58718a0;
    public boolean f58719b0;
    public boolean f58720c0;
    public final boolean f58721d0;
    public final w0 f58722e0;
    public final e6 f58723f0;
    public final a0 f58724g0;
    public final n f58725h0;

    public l(n nVar, Context context, w0 w0Var, e6 e6Var, a0 a0Var) {
        super(context, null);
        this.f58725h0 = nVar;
        this.f58722e0 = w0Var;
        this.f58723f0 = e6Var;
        this.f58724g0 = a0Var;
        this.W = new Path();
        this.f58718a0 = new Paint(1);
        this.f58721d0 = org.telegram.messenger.g0.Q1();
    }

    @Override
    public final boolean c(MotionEvent motionEvent) {
        if (this.f58725h0.f58731j1.getCurrentPosition() == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i3;
        int i10;
        float f10;
        n nVar = this.f58725h0;
        l lVar = nVar.f58731j1;
        int w02 = k6.w0(k6.f27954h5, this.f58723f0);
        Paint paint = this.f58718a0;
        paint.setColor(w02);
        if (this.f58719b0) {
            int i11 = -org.telegram.messenger.g0.L(16.0f);
            a0 a0Var = this.f58724g0;
            int i12 = a0Var.f58642l2;
            if (a0Var.m1.getVisibility() == 0) {
                i3 = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.f22602m;
            } else {
                i3 = 0;
            }
            int L = org.telegram.messenger.g0.L(10.0f) + Math.max(i11, i12 - i3);
            w0 w0Var = this.f58722e0;
            int i13 = w0Var.f58782m2;
            if (w0Var.f58775f2.f38645c == 1.0f) {
                i10 = org.telegram.messenger.g0.f22602m;
            } else {
                i10 = 0;
            }
            int max = Math.max(0, i13 - i10);
            int abs = Math.abs(L - max);
            if (lVar.getCurrentPosition() == 0) {
                float positionAnimated = lVar.getPositionAnimated() * abs;
                if (L < max) {
                    f10 = L + positionAnimated;
                } else {
                    f10 = L - positionAnimated;
                }
            } else {
                float positionAnimated2 = (1.0f - lVar.getPositionAnimated()) * abs;
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
            Path path = this.W;
            path.rewind();
            path.addRoundRect(rectF, L2, L2, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        if (this.f58721d0 || nVar.f58732l1) {
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final float getAvailableTranslationX() {
        if (!this.f58721d0 && !this.f58725h0.f58732l1) {
            return super.getAvailableTranslationX();
        }
        return getMeasuredWidth();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        boolean z11 = this.f58720c0;
        boolean z12 = this.f58725h0.d;
        if (z11 != z12) {
            this.f58720c0 = z12;
            if (z12) {
                this.f58722e0.j1(true);
            }
        }
    }

    @Override
    public final void s() {
        this.f58719b0 = false;
        this.f58725h0.f58731j1.invalidate();
    }

    @Override
    public final void u(boolean z10) {
        n nVar = this.f58725h0;
        l lVar = nVar.f58731j1;
        float positionAnimated = lVar.getPositionAnimated();
        if (positionAnimated > 0.0f && positionAnimated < 1.0f) {
            if (!this.f58719b0) {
                this.f58719b0 = true;
                if (nVar.d) {
                    org.telegram.messenger.g0.v1(nVar.k1.f28586b);
                }
            }
        } else {
            this.f58719b0 = false;
        }
        lVar.invalidate();
    }
}
