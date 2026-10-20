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
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.nl0;
public final class b2 extends j {
    public fw0 f45296q0;
    public g9 f45297r0;
    public g9 f45298s0;
    public ah.y0 f45299t0;
    public ah.y0 f45300u0;
    public ah.i1 f45301v0;
    public f6 f45302w0;
    public f6 f45303x0;
    public boolean f45304y0;
    public float f45305z0;

    @Override
    public final i a() {
        a2 a2Var = new a2(this, getContext(), 0);
        a2Var.f45286r = new RectF();
        return a2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        fw0 fw0Var = this.f45296q0;
        int padding = getPadding();
        float d = this.f45303x0.d(1.0f, false);
        if (d == 1.0f) {
            this.f45298s0 = null;
        }
        canvas.save();
        float f7 = this.f45305z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        g9 g9Var = this.f45298s0;
        if (g9Var != null) {
            g9Var.e = (int) ((1.0f - d) * 255.0f);
            g9Var.setBounds(padding, padding, ((int) fw0Var.f26428a) - padding, ((int) fw0Var.f26429b) - padding);
            this.f45298s0.draw(canvas);
        }
        g9 g9Var2 = this.f45297r0;
        g9Var2.e = (int) (d * 255.0f);
        g9Var2.setBounds(padding, padding, ((int) fw0Var.f26428a) - padding, ((int) fw0Var.f26429b) - padding);
        this.f45297r0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f45297r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f45297r0.getBounds().centerX() - width), (int) (this.f45297r0.getBounds().centerY() - width), (int) (this.f45297r0.getBounds().centerX() + width), (int) (this.f45297r0.getBounds().centerY() + width));
        float d10 = this.f45302w0.d(1.0f, false);
        this.f45299t0.c(rect);
        this.f45300u0.c(rect);
        ah.y0 y0Var = this.f45299t0;
        if (this.f45297r0.f5426a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        y0Var.d(i10);
        if (d10 == 1.0f) {
            this.f45299t0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - d10;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            ah.y0 y0Var2 = this.f45300u0;
            y0Var2.h = f10;
            y0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            ah.y0 y0Var3 = this.f45299t0;
            y0Var3.h = d10;
            y0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public ah.i1 getCurrentReaction() {
        return this.f45301v0;
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
        return (int) ((this.f45296q0.f26429b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override
    public fl0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new fl0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    @Override
    public final void k() {
        fw0 fw0Var = this.f45296q0;
        setX(getPositionX() - (fw0Var.f26428a / 2.0f));
        setY(getPositionY() - (fw0Var.f26429b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45299t0.b(true);
        this.f45300u0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45299t0.b(false);
        this.f45300u0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        fw0 fw0Var = this.f45296q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) fw0Var.f26428a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) fw0Var.f26429b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f45297r0.a();
        } else {
            this.f45298s0 = this.f45297r0;
            g9 g9Var = new g9(this);
            this.f45297r0 = g9Var;
            if (this.f45298s0.f5426a != 1) {
                g9Var.a();
            }
            this.f45297r0.b(this.f45304y0, false);
            this.f45297r0.c(getScaleX());
            this.f45303x0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f45304y0;
        this.f45304y0 = z11;
        if (!z10) {
            this.f45297r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ah.l0(28, this, zArr));
        ofFloat.addListener(new nl0(20, this, zArr));
        ofFloat.setInterpolator(bs.f25022g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(ah.i1 i1Var, boolean z10) {
        if (Objects.equals(this.f45301v0, i1Var)) {
            return;
        }
        if (!z10) {
            this.f45301v0 = i1Var;
            this.f45299t0.e(i1Var);
            invalidate();
            return;
        }
        this.f45301v0 = i1Var;
        this.f45300u0.e(i1Var);
        ah.y0 y0Var = this.f45299t0;
        this.f45299t0 = this.f45300u0;
        this.f45300u0 = y0Var;
        this.f45302w0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            super.setScaleX(f7);
            this.f45297r0.c(f7);
            invalidate();
        }
    }
}
