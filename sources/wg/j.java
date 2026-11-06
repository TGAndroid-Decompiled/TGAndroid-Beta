package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.v61;
public final class j extends v61 {
    public final Path V;
    public final Paint W;
    public boolean f57669a0;
    public boolean f57670b0;
    public final boolean f57671c0;
    public final w0 f57672d0;
    public final f6 f57673e0;
    public final a0 f57674f0;
    public final l f57675g0;

    public j(l lVar, Context context, w0 w0Var, f6 f6Var, a0 a0Var) {
        super(context, null);
        this.f57675g0 = lVar;
        this.f57672d0 = w0Var;
        this.f57673e0 = f6Var;
        this.f57674f0 = a0Var;
        this.V = new Path();
        this.W = new Paint(1);
        this.f57671c0 = org.telegram.messenger.g0.Q1();
    }

    @Override
    public final boolean b(MotionEvent motionEvent) {
        if (this.f57675g0.f57679i1.getCurrentPosition() == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        int i10;
        float f10;
        l lVar = this.f57675g0;
        j jVar = lVar.f57679i1;
        int w02 = k6.w0(k6.f27922h5, this.f57673e0);
        Paint paint = this.W;
        paint.setColor(w02);
        if (this.f57669a0) {
            int i11 = -org.telegram.messenger.g0.L(16.0f);
            a0 a0Var = this.f57674f0;
            int i12 = a0Var.f57594k2;
            if (a0Var.l1.getVisibility() == 0) {
                i7 = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.f22538m;
            } else {
                i7 = 0;
            }
            int L = org.telegram.messenger.g0.L(10.0f) + Math.max(i11, i12 - i7);
            w0 w0Var = this.f57672d0;
            int i13 = w0Var.f57738l2;
            if (w0Var.f57731e2.f39855c == 1.0f) {
                i10 = org.telegram.messenger.g0.f22538m;
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
        if (this.f57671c0 || lVar.f57681k1) {
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final float getAvailableTranslationX() {
        if (!this.f57671c0 && !this.f57675g0.f57681k1) {
            return super.getAvailableTranslationX();
        }
        return getMeasuredWidth();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        boolean z10 = this.f57670b0;
        boolean z11 = this.f57675g0.d;
        if (z10 != z11) {
            this.f57670b0 = z11;
            if (z11) {
                this.f57672d0.j1(true);
            }
        }
    }

    @Override
    public final void u() {
        this.f57669a0 = false;
        this.f57675g0.f57679i1.invalidate();
    }

    @Override
    public final void w(boolean z9) {
        l lVar = this.f57675g0;
        j jVar = lVar.f57679i1;
        float positionAnimated = jVar.getPositionAnimated();
        if (positionAnimated > 0.0f && positionAnimated < 1.0f) {
            if (!this.f57669a0) {
                this.f57669a0 = true;
                if (lVar.d) {
                    org.telegram.messenger.g0.v1(lVar.f57680j1.f28616b);
                }
            }
        } else {
            this.f57669a0 = false;
        }
        jVar.invalidate();
    }
}
