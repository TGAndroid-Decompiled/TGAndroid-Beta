package tg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import bi.de;
import di.w8;
import j$.util.Objects;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.wq;
public final class q1 extends j {
    public nt0 f55919q0;
    public w8 f55920r0;
    public w8 f55921s0;
    public ch.f0 f55922t0;
    public ch.f0 f55923u0;
    public ch.o0 f55924v0;
    public v5 f55925w0;
    public v5 f55926x0;
    public boolean f55927y0;
    public float f55928z0;

    @Override
    public final i a() {
        p1 p1Var = new p1(this, getContext(), 0);
        p1Var.f55914r = new RectF();
        return p1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        nt0 nt0Var = this.f55919q0;
        int padding = getPadding();
        float e10 = this.f55926x0.e(false, 1.0f);
        if (e10 == 1.0f) {
            this.f55921s0 = null;
        }
        canvas.save();
        float f10 = this.f55928z0;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        w8 w8Var = this.f55921s0;
        if (w8Var != null) {
            w8Var.f9913e = (int) ((1.0f - e10) * 255.0f);
            w8Var.setBounds(padding, padding, ((int) nt0Var.f36392a) - padding, ((int) nt0Var.f36393b) - padding);
            this.f55921s0.draw(canvas);
        }
        w8 w8Var2 = this.f55920r0;
        w8Var2.f9913e = (int) (e10 * 255.0f);
        w8Var2.setBounds(padding, padding, ((int) nt0Var.f36392a) - padding, ((int) nt0Var.f36393b) - padding);
        this.f55920r0.draw(canvas);
        Rect rect = org.telegram.messenger.g0.Q;
        float width = (this.f55920r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f55920r0.getBounds().centerX() - width), (int) (this.f55920r0.getBounds().centerY() - width), (int) (this.f55920r0.getBounds().centerX() + width), (int) (this.f55920r0.getBounds().centerY() + width));
        float e11 = this.f55925w0.e(false, 1.0f);
        this.f55922t0.c(rect);
        this.f55923u0.c(rect);
        ch.f0 f0Var = this.f55922t0;
        if (this.f55920r0.f9910a == 1) {
            i7 = -1;
        } else {
            i7 = -16777216;
        }
        f0Var.d(i7);
        if (e11 == 1.0f) {
            this.f55922t0.a(canvas);
        } else {
            canvas.save();
            float f11 = 1.0f - e11;
            canvas.scale(f11, f11, rect.centerX(), rect.top);
            ch.f0 f0Var2 = this.f55923u0;
            f0Var2.h = f11;
            f0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e11, e11, rect.centerX(), rect.bottom);
            ch.f0 f0Var3 = this.f55922t0;
            f0Var3.h = e11;
            f0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public ch.o0 getCurrentReaction() {
        return this.f55924v0;
    }

    @Override
    public float getMaxScale() {
        return 1.8f;
    }

    @Override
    public float getMinScale() {
        return 0.5f;
    }

    public int getPadding() {
        return (int) ((this.f55919q0.f36393b - org.telegram.messenger.g0.L(84.0f)) / 2.0f);
    }

    @Override
    public ki0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new ki0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    @Override
    public final void k() {
        nt0 nt0Var = this.f55919q0;
        setX(getPositionX() - (nt0Var.f36392a / 2.0f));
        setY(getPositionY() - (nt0Var.f36393b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f55922t0.b(true);
        this.f55923u0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f55922t0.b(false);
        this.f55923u0.b(false);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        nt0 nt0Var = this.f55919q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) nt0Var.f36392a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) nt0Var.f36393b, 1073741824));
    }

    public final void q(boolean z9) {
        if (!z9) {
            this.f55920r0.a();
        } else {
            this.f55921s0 = this.f55920r0;
            w8 w8Var = new w8(this);
            this.f55920r0 = w8Var;
            if (this.f55921s0.f9910a != 1) {
                w8Var.a();
            }
            this.f55920r0.b(this.f55927y0, false);
            this.f55920r0.c(getScaleX());
            this.f55926x0.e(true, 0.0f);
        }
        invalidate();
    }

    public final void r(boolean z9) {
        boolean z10 = !this.f55927y0;
        this.f55927y0 = z10;
        if (!z9) {
            this.f55920r0.b(z10, z9);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new de(28, this, zArr));
        ofFloat.addListener(new v50(20, this, zArr));
        ofFloat.setInterpolator(wq.f40047g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(ch.o0 o0Var, boolean z9) {
        if (Objects.equals(this.f55924v0, o0Var)) {
            return;
        }
        if (!z9) {
            this.f55924v0 = o0Var;
            this.f55922t0.e(o0Var);
            invalidate();
            return;
        }
        this.f55924v0 = o0Var;
        this.f55923u0.e(o0Var);
        ch.f0 f0Var = this.f55922t0;
        this.f55922t0 = this.f55923u0;
        this.f55923u0 = f0Var;
        this.f55925w0.e(true, 0.0f);
        invalidate();
    }

    @Override
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            super.setScaleX(f10);
            this.f55920r0.c(f10);
            invalidate();
        }
    }
}
