package rg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import bi.ya;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.ql0;
public final class c2 extends j {
    public iw0 f44215q0;
    public ya f44216r0;
    public ya f44217s0;
    public ah.y0 f44218t0;
    public ah.y0 f44219u0;
    public ah.i1 f44220v0;
    public g6 f44221w0;
    public g6 f44222x0;
    public boolean f44223y0;
    public float f44224z0;

    @Override
    public final i a() {
        b2 b2Var = new b2(this, getContext(), 0);
        b2Var.f44211r = new RectF();
        return b2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        iw0 iw0Var = this.f44215q0;
        int padding = getPadding();
        float d = this.f44222x0.d(1.0f, false);
        if (d == 1.0f) {
            this.f44217s0 = null;
        }
        canvas.save();
        float f7 = this.f44224z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        ya yaVar = this.f44217s0;
        if (yaVar != null) {
            yaVar.e = (int) ((1.0f - d) * 255.0f);
            yaVar.setBounds(padding, padding, ((int) iw0Var.f26116a) - padding, ((int) iw0Var.f26117b) - padding);
            this.f44217s0.draw(canvas);
        }
        ya yaVar2 = this.f44216r0;
        yaVar2.e = (int) (d * 255.0f);
        yaVar2.setBounds(padding, padding, ((int) iw0Var.f26116a) - padding, ((int) iw0Var.f26117b) - padding);
        this.f44216r0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f44216r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f44216r0.getBounds().centerX() - width), (int) (this.f44216r0.getBounds().centerY() - width), (int) (this.f44216r0.getBounds().centerX() + width), (int) (this.f44216r0.getBounds().centerY() + width));
        float d10 = this.f44221w0.d(1.0f, false);
        this.f44218t0.c(rect);
        this.f44219u0.c(rect);
        ah.y0 y0Var = this.f44218t0;
        if (this.f44216r0.f4033a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        y0Var.d(i10);
        if (d10 == 1.0f) {
            this.f44218t0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - d10;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            ah.y0 y0Var2 = this.f44219u0;
            y0Var2.h = f10;
            y0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            ah.y0 y0Var3 = this.f44218t0;
            y0Var3.h = d10;
            y0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public ah.i1 getCurrentReaction() {
        return this.f44220v0;
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
        return (int) ((this.f44215q0.f26117b - AndroidUtilities.dp(84.0f)) / 2.0f);
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
        iw0 iw0Var = this.f44215q0;
        setX(getPositionX() - (iw0Var.f26116a / 2.0f));
        setY(getPositionY() - (iw0Var.f26117b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44218t0.b(true);
        this.f44219u0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44218t0.b(false);
        this.f44219u0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        iw0 iw0Var = this.f44215q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) iw0Var.f26116a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) iw0Var.f26117b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f44216r0.a();
        } else {
            this.f44217s0 = this.f44216r0;
            ya yaVar = new ya(this);
            this.f44216r0 = yaVar;
            if (this.f44217s0.f4033a != 1) {
                yaVar.a();
            }
            this.f44216r0.b(this.f44223y0, false);
            this.f44216r0.c(getScaleX());
            this.f44222x0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f44223y0;
        this.f44223y0 = z11;
        if (!z10) {
            this.f44216r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ah.l0(28, this, zArr));
        ofFloat.addListener(new ql0(20, this, zArr));
        ofFloat.setInterpolator(es.f24772g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(ah.i1 i1Var, boolean z10) {
        if (Objects.equals(this.f44220v0, i1Var)) {
            return;
        }
        if (!z10) {
            this.f44220v0 = i1Var;
            this.f44218t0.e(i1Var);
            invalidate();
            return;
        }
        this.f44220v0 = i1Var;
        this.f44219u0.e(i1Var);
        ah.y0 y0Var = this.f44218t0;
        this.f44218t0 = this.f44219u0;
        this.f44219u0 = y0Var;
        this.f44221w0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            super.setScaleX(f7);
            this.f44216r0.c(f7);
            invalidate();
        }
    }
}
