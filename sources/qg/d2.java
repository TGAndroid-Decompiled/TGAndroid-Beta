package qg;

import ai.ob;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.qr;
public final class d2 extends j {
    public kv0 f41353q0;
    public ob f41354r0;
    public ob f41355s0;
    public zg.g0 f41356t0;
    public zg.g0 f41357u0;
    public zg.p0 f41358v0;
    public c6 f41359w0;
    public c6 f41360x0;
    public boolean f41361y0;
    public float f41362z0;

    @Override
    public final i a() {
        c2 c2Var = new c2(this, getContext(), 0);
        c2Var.f41345r = new RectF();
        return c2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        kv0 kv0Var = this.f41353q0;
        int padding = getPadding();
        float d = this.f41360x0.d(1.0f, false);
        if (d == 1.0f) {
            this.f41355s0 = null;
        }
        canvas.save();
        float f7 = this.f41362z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        ob obVar = this.f41355s0;
        if (obVar != null) {
            obVar.e = (int) ((1.0f - d) * 255.0f);
            obVar.setBounds(padding, padding, ((int) kv0Var.f25695a) - padding, ((int) kv0Var.f25696b) - padding);
            this.f41355s0.draw(canvas);
        }
        ob obVar2 = this.f41354r0;
        obVar2.e = (int) (d * 255.0f);
        obVar2.setBounds(padding, padding, ((int) kv0Var.f25695a) - padding, ((int) kv0Var.f25696b) - padding);
        this.f41354r0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f41354r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f41354r0.getBounds().centerX() - width), (int) (this.f41354r0.getBounds().centerY() - width), (int) (this.f41354r0.getBounds().centerX() + width), (int) (this.f41354r0.getBounds().centerY() + width));
        float d10 = this.f41359w0.d(1.0f, false);
        this.f41356t0.c(rect);
        this.f41357u0.c(rect);
        zg.g0 g0Var = this.f41356t0;
        if (this.f41354r0.f1369a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        g0Var.d(i10);
        if (d10 == 1.0f) {
            this.f41356t0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - d10;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            zg.g0 g0Var2 = this.f41357u0;
            g0Var2.h = f10;
            g0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            zg.g0 g0Var3 = this.f41356t0;
            g0Var3.h = d10;
            g0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public zg.p0 getCurrentReaction() {
        return this.f41358v0;
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
        return (int) ((this.f41353q0.f25696b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override
    public ik0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new ik0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    @Override
    public final void k() {
        kv0 kv0Var = this.f41353q0;
        setX(getPositionX() - (kv0Var.f25695a / 2.0f));
        setY(getPositionY() - (kv0Var.f25696b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41356t0.b(true);
        this.f41357u0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41356t0.b(false);
        this.f41357u0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        kv0 kv0Var = this.f41353q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) kv0Var.f25695a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) kv0Var.f25696b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f41354r0.a();
        } else {
            this.f41355s0 = this.f41354r0;
            ob obVar = new ob(this);
            this.f41354r0 = obVar;
            if (this.f41355s0.f1369a != 1) {
                obVar.a();
            }
            this.f41354r0.b(this.f41361y0, false);
            this.f41354r0.c(getScaleX());
            this.f41360x0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f41361y0;
        this.f41361y0 = z11;
        if (!z10) {
            this.f41354r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ai.x(26, this, zArr));
        ofFloat.addListener(new qk0(18, this, zArr));
        ofFloat.setInterpolator(qr.f27381g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(zg.p0 p0Var, boolean z10) {
        if (Objects.equals(this.f41358v0, p0Var)) {
            return;
        }
        if (!z10) {
            this.f41358v0 = p0Var;
            this.f41356t0.e(p0Var);
            invalidate();
            return;
        }
        this.f41358v0 = p0Var;
        this.f41357u0.e(p0Var);
        zg.g0 g0Var = this.f41356t0;
        this.f41356t0 = this.f41357u0;
        this.f41357u0 = g0Var;
        this.f41359w0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            super.setScaleX(f7);
            this.f41354r0.c(f7);
            invalidate();
        }
    }
}
