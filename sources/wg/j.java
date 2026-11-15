package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.w61;
public final class j extends w61 {
    public final Path W;
    public final Paint f59189a0;
    public boolean f59190b0;
    public boolean f59191c0;
    public final boolean f59192d0;
    public final u0 f59193e0;
    public final e6 f59194f0;
    public final y f59195g0;
    public final l f59196h0;

    public j(l lVar, Context context, u0 u0Var, e6 e6Var, y yVar) {
        super(context, null);
        this.f59196h0 = lVar;
        this.f59193e0 = u0Var;
        this.f59194f0 = e6Var;
        this.f59195g0 = yVar;
        this.W = new Path();
        this.f59189a0 = new Paint(1);
        this.f59192d0 = org.telegram.messenger.g0.Q1();
    }

    @Override
    public final boolean b(MotionEvent motionEvent) {
        if (this.f59196h0.f59203m1.getCurrentPosition() == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        int i10;
        float f10;
        l lVar = this.f59196h0;
        j jVar = lVar.f59203m1;
        int w02 = j6.w0(j6.f28922h5, this.f59194f0);
        Paint paint = this.f59189a0;
        paint.setColor(w02);
        if (this.f59190b0) {
            int i11 = -org.telegram.messenger.g0.L(16.0f);
            y yVar = this.f59195g0;
            int i12 = yVar.f59286o2;
            if (yVar.f35932p1.getVisibility() == 0) {
                i7 = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.f23605m;
            } else {
                i7 = 0;
            }
            int L = org.telegram.messenger.g0.L(10.0f) + Math.max(i11, i12 - i7);
            u0 u0Var = this.f59193e0;
            int i13 = u0Var.f59257p2;
            if (u0Var.f59250i2.f39900c == 1.0f) {
                i10 = org.telegram.messenger.g0.f23605m;
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
            Path path = this.W;
            path.rewind();
            path.addRoundRect(rectF, L2, L2, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        if (this.f59192d0 || lVar.f59204o1) {
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final float getAvailableTranslationX() {
        if (!this.f59192d0 && !this.f59196h0.f59204o1) {
            return super.getAvailableTranslationX();
        }
        return getMeasuredWidth();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        boolean z11 = this.f59191c0;
        boolean z12 = this.f59196h0.d;
        if (z11 != z12) {
            this.f59191c0 = z12;
            if (z12) {
                this.f59193e0.j1(true);
            }
        }
    }

    @Override
    public final void r() {
        this.f59190b0 = false;
        this.f59196h0.f59203m1.invalidate();
    }

    @Override
    public final void t(boolean z10) {
        l lVar = this.f59196h0;
        j jVar = lVar.f59203m1;
        float positionAnimated = jVar.getPositionAnimated();
        if (positionAnimated > 0.0f && positionAnimated < 1.0f) {
            if (!this.f59190b0) {
                this.f59190b0 = true;
                if (lVar.d) {
                    org.telegram.messenger.g0.v1(lVar.n1.f29682b);
                }
            }
        } else {
            this.f59190b0 = false;
        }
        jVar.invalidate();
    }
}
