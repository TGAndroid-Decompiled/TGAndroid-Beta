package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.k71;
public final class j extends k71 {
    public final Path W;
    public final Paint f59882a0;
    public boolean f59883b0;
    public boolean f59884c0;
    public final boolean f59885d0;
    public final v0 f59886e0;
    public final i6 f59887f0;
    public final z f59888g0;
    public final l f59889h0;

    public j(l lVar, Context context, v0 v0Var, i6 i6Var, z zVar) {
        super(context, null);
        this.f59889h0 = lVar;
        this.f59886e0 = v0Var;
        this.f59887f0 = i6Var;
        this.f59888g0 = zVar;
        this.W = new Path();
        this.f59882a0 = new Paint(1);
        this.f59885d0 = org.telegram.messenger.g0.Q1();
    }

    @Override
    public final boolean b(MotionEvent motionEvent) {
        if (this.f59889h0.f59895m1.getCurrentPosition() == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        int i10;
        float f10;
        l lVar = this.f59889h0;
        j jVar = lVar.f59895m1;
        int w02 = n6.w0(n6.f29524h5, this.f59887f0);
        Paint paint = this.f59882a0;
        paint.setColor(w02);
        if (this.f59883b0) {
            int i11 = -org.telegram.messenger.g0.L(16.0f);
            z zVar = this.f59888g0;
            int i12 = zVar.f59982o2;
            if (zVar.f39247p1.getVisibility() == 0) {
                i7 = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.f24220m;
            } else {
                i7 = 0;
            }
            int L = org.telegram.messenger.g0.L(10.0f) + Math.max(i11, i12 - i7);
            v0 v0Var = this.f59886e0;
            int i13 = v0Var.f59953p2;
            if (v0Var.f59946i2.f33931c == 1.0f) {
                i10 = org.telegram.messenger.g0.f24220m;
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
        if (this.f59885d0 || lVar.f59896o1) {
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final float getAvailableTranslationX() {
        if (!this.f59885d0 && !this.f59889h0.f59896o1) {
            return super.getAvailableTranslationX();
        }
        return getMeasuredWidth();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        boolean z11 = this.f59884c0;
        boolean z12 = this.f59889h0.d;
        if (z11 != z12) {
            this.f59884c0 = z12;
            if (z12) {
                this.f59886e0.k1(true);
            }
        }
    }

    @Override
    public final void r() {
        this.f59883b0 = false;
        this.f59889h0.f59895m1.invalidate();
    }

    @Override
    public final void t(boolean z10) {
        l lVar = this.f59889h0;
        j jVar = lVar.f59895m1;
        float positionAnimated = jVar.getPositionAnimated();
        if (positionAnimated > 0.0f && positionAnimated < 1.0f) {
            if (!this.f59883b0) {
                this.f59883b0 = true;
                if (lVar.d) {
                    org.telegram.messenger.g0.v1(lVar.n1.f30226b);
                }
            }
        } else {
            this.f59883b0 = false;
        }
        jVar.invalidate();
    }
}
