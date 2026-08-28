package yf;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import ih.s8;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.su0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.y5;
public final class a2 extends j {
    public qu0 m0;
    public s8 f49741n0;
    public s8 f49742o0;
    public hg.i0 f49743p0;
    public hg.i0 f49744q0;
    public hg.r0 f49745r0;
    public y5 f49746s0;
    public y5 f49747t0;
    public boolean f49748u0;
    public float f49749v0;

    @Override
    public final i a() {
        z1 z1Var = new z1(this, getContext(), 0);
        z1Var.f50198r = new RectF();
        return z1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        qu0 qu0Var = this.m0;
        int padding = getPadding();
        float d = this.f49747t0.d(1.0f, false);
        if (d == 1.0f) {
            this.f49742o0 = null;
        }
        canvas.save();
        float f10 = this.f49749v0;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        s8 s8Var = this.f49742o0;
        if (s8Var != null) {
            s8Var.f12129e = (int) ((1.0f - d) * 255.0f);
            s8Var.setBounds(padding, padding, ((int) qu0Var.f32026a) - padding, ((int) qu0Var.f32027b) - padding);
            this.f49742o0.draw(canvas);
        }
        s8 s8Var2 = this.f49741n0;
        s8Var2.f12129e = (int) (d * 255.0f);
        s8Var2.setBounds(padding, padding, ((int) qu0Var.f32026a) - padding, ((int) qu0Var.f32027b) - padding);
        this.f49741n0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f49741n0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f49741n0.getBounds().centerX() - width), (int) (this.f49741n0.getBounds().centerY() - width), (int) (this.f49741n0.getBounds().centerX() + width), (int) (this.f49741n0.getBounds().centerY() + width));
        float d9 = this.f49746s0.d(1.0f, false);
        this.f49743p0.c(rect);
        this.f49744q0.c(rect);
        hg.i0 i0Var = this.f49743p0;
        if (this.f49741n0.f12126a == 1) {
            i9 = -1;
        } else {
            i9 = -16777216;
        }
        i0Var.d(i9);
        if (d9 == 1.0f) {
            this.f49743p0.a(canvas);
        } else {
            canvas.save();
            float f11 = 1.0f - d9;
            canvas.scale(f11, f11, rect.centerX(), rect.top);
            hg.i0 i0Var2 = this.f49744q0;
            i0Var2.h = f11;
            i0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d9, d9, rect.centerX(), rect.bottom);
            hg.i0 i0Var3 = this.f49743p0;
            i0Var3.h = d9;
            i0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public hg.r0 getCurrentReaction() {
        return this.f49745r0;
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
        return (int) ((this.m0.f32027b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override
    public wj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new wj0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    @Override
    public final void k() {
        qu0 qu0Var = this.m0;
        setX(getPositionX() - (qu0Var.f32026a / 2.0f));
        setY(getPositionY() - (qu0Var.f32027b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49743p0.b(true);
        this.f49744q0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49743p0.b(false);
        this.f49744q0.b(false);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        qu0 qu0Var = this.m0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) qu0Var.f32026a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) qu0Var.f32027b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f49741n0.a();
        } else {
            this.f49742o0 = this.f49741n0;
            s8 s8Var = new s8(this);
            this.f49741n0 = s8Var;
            if (this.f49742o0.f12126a != 1) {
                s8Var.a();
            }
            this.f49741n0.b(this.f49748u0, false);
            this.f49741n0.c(getScaleX());
            this.f49747t0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f49748u0;
        this.f49748u0 = z11;
        if (!z10) {
            this.f49741n0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new zf.h1(1, this, zArr));
        ofFloat.addListener(new su0(21, this, zArr));
        ofFloat.setInterpolator(gr.f28845g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(hg.r0 r0Var, boolean z10) {
        if (Objects.equals(this.f49745r0, r0Var)) {
            return;
        }
        if (!z10) {
            this.f49745r0 = r0Var;
            this.f49743p0.e(r0Var);
            invalidate();
            return;
        }
        this.f49745r0 = r0Var;
        this.f49744q0.e(r0Var);
        hg.i0 i0Var = this.f49743p0;
        this.f49743p0 = this.f49744q0;
        this.f49744q0 = i0Var;
        this.f49746s0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            super.setScaleX(f10);
            this.f49741n0.c(f10);
            invalidate();
        }
    }
}
