package rg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import ci.g9;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.ml0;
public final class a2 extends j {
    public dw0 f45303q0;
    public g9 f45304r0;
    public g9 f45305s0;
    public ah.y0 f45306t0;
    public ah.y0 f45307u0;
    public ah.i1 f45308v0;
    public f6 f45309w0;
    public f6 f45310x0;
    public boolean f45311y0;
    public float f45312z0;

    @Override
    public final i a() {
        z1 z1Var = new z1(this, getContext(), 0);
        z1Var.f45751r = new RectF();
        return z1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        dw0 dw0Var = this.f45303q0;
        int padding = getPadding();
        float d = this.f45310x0.d(1.0f, false);
        if (d == 1.0f) {
            this.f45305s0 = null;
        }
        canvas.save();
        float f7 = this.f45312z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        g9 g9Var = this.f45305s0;
        if (g9Var != null) {
            g9Var.e = (int) ((1.0f - d) * 255.0f);
            g9Var.setBounds(padding, padding, ((int) dw0Var.f25720a) - padding, ((int) dw0Var.f25721b) - padding);
            this.f45305s0.draw(canvas);
        }
        g9 g9Var2 = this.f45304r0;
        g9Var2.e = (int) (d * 255.0f);
        g9Var2.setBounds(padding, padding, ((int) dw0Var.f25720a) - padding, ((int) dw0Var.f25721b) - padding);
        this.f45304r0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f45304r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f45304r0.getBounds().centerX() - width), (int) (this.f45304r0.getBounds().centerY() - width), (int) (this.f45304r0.getBounds().centerX() + width), (int) (this.f45304r0.getBounds().centerY() + width));
        float d10 = this.f45309w0.d(1.0f, false);
        this.f45306t0.c(rect);
        this.f45307u0.c(rect);
        ah.y0 y0Var = this.f45306t0;
        if (this.f45304r0.f5428a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        y0Var.d(i10);
        if (d10 == 1.0f) {
            this.f45306t0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - d10;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            ah.y0 y0Var2 = this.f45307u0;
            y0Var2.h = f10;
            y0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            ah.y0 y0Var3 = this.f45306t0;
            y0Var3.h = d10;
            y0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public ah.i1 getCurrentReaction() {
        return this.f45308v0;
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
        return (int) ((this.f45303q0.f25721b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override
    public el0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new el0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    @Override
    public final void k() {
        dw0 dw0Var = this.f45303q0;
        setX(getPositionX() - (dw0Var.f25720a / 2.0f));
        setY(getPositionY() - (dw0Var.f25721b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45306t0.b(true);
        this.f45307u0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45306t0.b(false);
        this.f45307u0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        dw0 dw0Var = this.f45303q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) dw0Var.f25720a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) dw0Var.f25721b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f45304r0.a();
        } else {
            this.f45305s0 = this.f45304r0;
            g9 g9Var = new g9(this);
            this.f45304r0 = g9Var;
            if (this.f45305s0.f5428a != 1) {
                g9Var.a();
            }
            this.f45304r0.b(this.f45311y0, false);
            this.f45304r0.c(getScaleX());
            this.f45310x0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f45311y0;
        this.f45311y0 = z11;
        if (!z10) {
            this.f45304r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ah.l0(28, this, zArr));
        ofFloat.addListener(new ml0(20, this, zArr));
        ofFloat.setInterpolator(bs.f25031g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(ah.i1 i1Var, boolean z10) {
        if (Objects.equals(this.f45308v0, i1Var)) {
            return;
        }
        if (!z10) {
            this.f45308v0 = i1Var;
            this.f45306t0.e(i1Var);
            invalidate();
            return;
        }
        this.f45308v0 = i1Var;
        this.f45307u0.e(i1Var);
        ah.y0 y0Var = this.f45306t0;
        this.f45306t0 = this.f45307u0;
        this.f45307u0 = y0Var;
        this.f45309w0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            super.setScaleX(f7);
            this.f45304r0.c(f7);
            invalidate();
        }
    }
}
