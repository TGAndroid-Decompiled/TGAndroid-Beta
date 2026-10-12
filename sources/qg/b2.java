package qg;

import ai.pb;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sw0;
public final class b2 extends j {
    public sw0 f46129q0;
    public pb f46130r0;
    public pb f46131s0;
    public zg.e0 f46132t0;
    public zg.e0 f46133u0;
    public zg.n0 f46134v0;
    public g6 f46135w0;
    public g6 f46136x0;
    public boolean f46137y0;
    public float f46138z0;

    @Override
    public final i a() {
        a2 a2Var = new a2(this, getContext(), 0);
        a2Var.f46117r = new RectF();
        return a2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        sw0 sw0Var = this.f46129q0;
        int padding = getPadding();
        float d = this.f46136x0.d(1.0f, false);
        if (d == 1.0f) {
            this.f46131s0 = null;
        }
        canvas.save();
        float f7 = this.f46138z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        pb pbVar = this.f46131s0;
        if (pbVar != null) {
            pbVar.f1592e = (int) ((1.0f - d) * 255.0f);
            pbVar.setBounds(padding, padding, ((int) sw0Var.f30696a) - padding, ((int) sw0Var.f30697b) - padding);
            this.f46131s0.draw(canvas);
        }
        pb pbVar2 = this.f46130r0;
        pbVar2.f1592e = (int) (d * 255.0f);
        pbVar2.setBounds(padding, padding, ((int) sw0Var.f30696a) - padding, ((int) sw0Var.f30697b) - padding);
        this.f46130r0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f46130r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f46130r0.getBounds().centerX() - width), (int) (this.f46130r0.getBounds().centerY() - width), (int) (this.f46130r0.getBounds().centerX() + width), (int) (this.f46130r0.getBounds().centerY() + width));
        float d10 = this.f46135w0.d(1.0f, false);
        this.f46132t0.c(rect);
        this.f46133u0.c(rect);
        zg.e0 e0Var = this.f46132t0;
        if (this.f46130r0.f1589a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        e0Var.d(i10);
        if (d10 == 1.0f) {
            this.f46132t0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - d10;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            zg.e0 e0Var2 = this.f46133u0;
            e0Var2.h = f10;
            e0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            zg.e0 e0Var3 = this.f46132t0;
            e0Var3.h = d10;
            e0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public zg.n0 getCurrentReaction() {
        return this.f46134v0;
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
        return (int) ((this.f46129q0.f30697b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override
    public sl0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new sl0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    @Override
    public final void k() {
        sw0 sw0Var = this.f46129q0;
        setX(getPositionX() - (sw0Var.f30696a / 2.0f));
        setY(getPositionY() - (sw0Var.f30697b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46132t0.b(true);
        this.f46133u0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46132t0.b(false);
        this.f46133u0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        sw0 sw0Var = this.f46129q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) sw0Var.f30696a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) sw0Var.f30697b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f46130r0.a();
        } else {
            this.f46131s0 = this.f46130r0;
            pb pbVar = new pb(this);
            this.f46130r0 = pbVar;
            if (this.f46131s0.f1589a != 1) {
                pbVar.a();
            }
            this.f46130r0.b(this.f46137y0, false);
            this.f46130r0.c(getScaleX());
            this.f46136x0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f46137y0;
        this.f46137y0 = z11;
        if (!z10) {
            this.f46130r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ai.x(26, this, zArr));
        ofFloat.addListener(new am0(18, this, zArr));
        ofFloat.setInterpolator(js.f27628g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(zg.n0 n0Var, boolean z10) {
        if (Objects.equals(this.f46134v0, n0Var)) {
            return;
        }
        if (!z10) {
            this.f46134v0 = n0Var;
            this.f46132t0.e(n0Var);
            invalidate();
            return;
        }
        this.f46134v0 = n0Var;
        this.f46133u0.e(n0Var);
        zg.e0 e0Var = this.f46132t0;
        this.f46132t0 = this.f46133u0;
        this.f46133u0 = e0Var;
        this.f46135w0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            super.setScaleX(f7);
            this.f46130r0.c(f7);
            invalidate();
        }
    }
}
