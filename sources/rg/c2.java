package rg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import ci.f9;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.ql0;
public final class c2 extends j {
    public iw0 f45724q0;
    public f9 f45725r0;
    public f9 f45726s0;
    public ah.y0 f45727t0;
    public ah.y0 f45728u0;
    public ah.i1 f45729v0;
    public f6 f45730w0;
    public f6 f45731x0;
    public boolean f45732y0;
    public float f45733z0;

    @Override
    public final i a() {
        b2 b2Var = new b2(this, getContext(), 0);
        b2Var.f45722r = new RectF();
        return b2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        iw0 iw0Var = this.f45724q0;
        int padding = getPadding();
        float d = this.f45731x0.d(1.0f, false);
        if (d == 1.0f) {
            this.f45726s0 = null;
        }
        canvas.save();
        float f7 = this.f45733z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        f9 f9Var = this.f45726s0;
        if (f9Var != null) {
            f9Var.e = (int) ((1.0f - d) * 255.0f);
            f9Var.setBounds(padding, padding, ((int) iw0Var.f27465a) - padding, ((int) iw0Var.f27466b) - padding);
            this.f45726s0.draw(canvas);
        }
        f9 f9Var2 = this.f45725r0;
        f9Var2.e = (int) (d * 255.0f);
        f9Var2.setBounds(padding, padding, ((int) iw0Var.f27465a) - padding, ((int) iw0Var.f27466b) - padding);
        this.f45725r0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f45725r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f45725r0.getBounds().centerX() - width), (int) (this.f45725r0.getBounds().centerY() - width), (int) (this.f45725r0.getBounds().centerX() + width), (int) (this.f45725r0.getBounds().centerY() + width));
        float d10 = this.f45730w0.d(1.0f, false);
        this.f45727t0.c(rect);
        this.f45728u0.c(rect);
        ah.y0 y0Var = this.f45727t0;
        if (this.f45725r0.f5329a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        y0Var.d(i10);
        if (d10 == 1.0f) {
            this.f45727t0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - d10;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            ah.y0 y0Var2 = this.f45728u0;
            y0Var2.h = f10;
            y0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            ah.y0 y0Var3 = this.f45727t0;
            y0Var3.h = d10;
            y0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public ah.i1 getCurrentReaction() {
        return this.f45729v0;
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
        return (int) ((this.f45724q0.f27466b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override
    public il0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new il0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    @Override
    public final void k() {
        iw0 iw0Var = this.f45724q0;
        setX(getPositionX() - (iw0Var.f27465a / 2.0f));
        setY(getPositionY() - (iw0Var.f27466b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45727t0.b(true);
        this.f45728u0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45727t0.b(false);
        this.f45728u0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        iw0 iw0Var = this.f45724q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) iw0Var.f27465a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) iw0Var.f27466b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f45725r0.a();
        } else {
            this.f45726s0 = this.f45725r0;
            f9 f9Var = new f9(this);
            this.f45725r0 = f9Var;
            if (this.f45726s0.f5329a != 1) {
                f9Var.a();
            }
            this.f45725r0.b(this.f45732y0, false);
            this.f45725r0.c(getScaleX());
            this.f45731x0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f45732y0;
        this.f45732y0 = z11;
        if (!z10) {
            this.f45725r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ah.l0(28, this, zArr));
        ofFloat.addListener(new ql0(20, this, zArr));
        ofFloat.setInterpolator(bs.f25134g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(ah.i1 i1Var, boolean z10) {
        if (Objects.equals(this.f45729v0, i1Var)) {
            return;
        }
        if (!z10) {
            this.f45729v0 = i1Var;
            this.f45727t0.e(i1Var);
            invalidate();
            return;
        }
        this.f45729v0 = i1Var;
        this.f45728u0.e(i1Var);
        ah.y0 y0Var = this.f45727t0;
        this.f45727t0 = this.f45728u0;
        this.f45728u0 = y0Var;
        this.f45730w0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            super.setScaleX(f7);
            this.f45725r0.c(f7);
            invalidate();
        }
    }
}
