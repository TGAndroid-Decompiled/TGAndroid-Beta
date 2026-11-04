package ug;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import ei.v8;
import j$.util.Objects;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
public final class q1 extends j {
    public float A0;
    public lt0 f56221r0;
    public v8 f56222s0;
    public v8 f56223t0;
    public dh.e0 f56224u0;
    public dh.e0 f56225v0;
    public dh.n0 f56226w0;
    public u5 f56227x0;
    public u5 f56228y0;
    public boolean f56229z0;

    @Override
    public final i a() {
        p1 p1Var = new p1(this, getContext(), 0);
        p1Var.f56212r = new RectF();
        return p1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i3;
        lt0 lt0Var = this.f56221r0;
        int padding = getPadding();
        float e10 = this.f56228y0.e(false, 1.0f);
        if (e10 == 1.0f) {
            this.f56223t0 = null;
        }
        canvas.save();
        float f10 = this.A0;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        v8 v8Var = this.f56223t0;
        if (v8Var != null) {
            v8Var.f11135e = (int) ((1.0f - e10) * 255.0f);
            v8Var.setBounds(padding, padding, ((int) lt0Var.f35877a) - padding, ((int) lt0Var.f35878b) - padding);
            this.f56223t0.draw(canvas);
        }
        v8 v8Var2 = this.f56222s0;
        v8Var2.f11135e = (int) (e10 * 255.0f);
        v8Var2.setBounds(padding, padding, ((int) lt0Var.f35877a) - padding, ((int) lt0Var.f35878b) - padding);
        this.f56222s0.draw(canvas);
        Rect rect = org.telegram.messenger.g0.Q;
        float width = (this.f56222s0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f56222s0.getBounds().centerX() - width), (int) (this.f56222s0.getBounds().centerY() - width), (int) (this.f56222s0.getBounds().centerX() + width), (int) (this.f56222s0.getBounds().centerY() + width));
        float e11 = this.f56227x0.e(false, 1.0f);
        this.f56224u0.c(rect);
        this.f56225v0.c(rect);
        dh.e0 e0Var = this.f56224u0;
        if (this.f56222s0.f11132a == 1) {
            i3 = -1;
        } else {
            i3 = -16777216;
        }
        e0Var.d(i3);
        if (e11 == 1.0f) {
            this.f56224u0.a(canvas);
        } else {
            canvas.save();
            float f11 = 1.0f - e11;
            canvas.scale(f11, f11, rect.centerX(), rect.top);
            dh.e0 e0Var2 = this.f56225v0;
            e0Var2.h = f11;
            e0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e11, e11, rect.centerX(), rect.bottom);
            dh.e0 e0Var3 = this.f56224u0;
            e0Var3.h = e11;
            e0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public dh.n0 getCurrentReaction() {
        return this.f56226w0;
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
        return (int) ((this.f56221r0.f35878b - org.telegram.messenger.g0.L(84.0f)) / 2.0f);
    }

    @Override
    public ni0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new ni0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    @Override
    public final void k() {
        lt0 lt0Var = this.f56221r0;
        setX(getPositionX() - (lt0Var.f35877a / 2.0f));
        setY(getPositionY() - (lt0Var.f35878b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f56224u0.b(true);
        this.f56225v0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f56224u0.b(false);
        this.f56225v0.b(false);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        lt0 lt0Var = this.f56221r0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) lt0Var.f35877a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) lt0Var.f35878b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f56222s0.a();
        } else {
            this.f56223t0 = this.f56222s0;
            v8 v8Var = new v8(this);
            this.f56222s0 = v8Var;
            if (this.f56223t0.f11132a != 1) {
                v8Var.a();
            }
            this.f56222s0.b(this.f56229z0, false);
            this.f56222s0.c(getScaleX());
            this.f56228y0.e(true, 0.0f);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f56229z0;
        this.f56229z0 = z11;
        if (!z10) {
            this.f56222s0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new vg.e1(1, this, zArr));
        ofFloat.addListener(new ri0(20, this, zArr));
        ofFloat.setInterpolator(xq.f40453g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(dh.n0 n0Var, boolean z10) {
        if (Objects.equals(this.f56226w0, n0Var)) {
            return;
        }
        if (!z10) {
            this.f56226w0 = n0Var;
            this.f56224u0.e(n0Var);
            invalidate();
            return;
        }
        this.f56226w0 = n0Var;
        this.f56225v0.e(n0Var);
        dh.e0 e0Var = this.f56224u0;
        this.f56224u0 = this.f56225v0;
        this.f56225v0 = e0Var;
        this.f56227x0.e(true, 0.0f);
        invalidate();
    }

    @Override
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            super.setScaleX(f10);
            this.f56222s0.c(f10);
            invalidate();
        }
    }
}
