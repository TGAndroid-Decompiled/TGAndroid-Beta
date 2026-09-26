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
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.uv0;
public final class b2 extends j {
    public uv0 f41588q0;
    public ob f41589r0;
    public ob f41590s0;
    public zg.f0 f41591t0;
    public zg.f0 f41592u0;
    public zg.o0 f41593v0;
    public e6 f41594w0;
    public e6 f41595x0;
    public boolean f41596y0;
    public float f41597z0;

    @Override
    public final i a() {
        a2 a2Var = new a2(this, getContext(), 0);
        a2Var.f41574r = new RectF();
        return a2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        uv0 uv0Var = this.f41588q0;
        int padding = getPadding();
        float d = this.f41595x0.d(1.0f, false);
        if (d == 1.0f) {
            this.f41590s0 = null;
        }
        canvas.save();
        float f7 = this.f41597z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        ob obVar = this.f41590s0;
        if (obVar != null) {
            obVar.e = (int) ((1.0f - d) * 255.0f);
            obVar.setBounds(padding, padding, ((int) uv0Var.f28932a) - padding, ((int) uv0Var.f28933b) - padding);
            this.f41590s0.draw(canvas);
        }
        ob obVar2 = this.f41589r0;
        obVar2.e = (int) (d * 255.0f);
        obVar2.setBounds(padding, padding, ((int) uv0Var.f28932a) - padding, ((int) uv0Var.f28933b) - padding);
        this.f41589r0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f41589r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f41589r0.getBounds().centerX() - width), (int) (this.f41589r0.getBounds().centerY() - width), (int) (this.f41589r0.getBounds().centerX() + width), (int) (this.f41589r0.getBounds().centerY() + width));
        float d10 = this.f41594w0.d(1.0f, false);
        this.f41591t0.c(rect);
        this.f41592u0.c(rect);
        zg.f0 f0Var = this.f41591t0;
        if (this.f41589r0.f1367a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        f0Var.d(i10);
        if (d10 == 1.0f) {
            this.f41591t0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - d10;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            zg.f0 f0Var2 = this.f41592u0;
            f0Var2.h = f10;
            f0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            zg.f0 f0Var3 = this.f41591t0;
            f0Var3.h = d10;
            f0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public zg.o0 getCurrentReaction() {
        return this.f41593v0;
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
        return (int) ((this.f41588q0.f28933b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override
    public sk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new sk0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    @Override
    public final void k() {
        uv0 uv0Var = this.f41588q0;
        setX(getPositionX() - (uv0Var.f28932a / 2.0f));
        setY(getPositionY() - (uv0Var.f28933b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41591t0.b(true);
        this.f41592u0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41591t0.b(false);
        this.f41592u0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        uv0 uv0Var = this.f41588q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) uv0Var.f28932a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) uv0Var.f28933b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f41589r0.a();
        } else {
            this.f41590s0 = this.f41589r0;
            ob obVar = new ob(this);
            this.f41589r0 = obVar;
            if (this.f41590s0.f1367a != 1) {
                obVar.a();
            }
            this.f41589r0.b(this.f41596y0, false);
            this.f41589r0.c(getScaleX());
            this.f41595x0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f41596y0;
        this.f41596y0 = z11;
        if (!z10) {
            this.f41589r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ai.x(26, this, zArr));
        ofFloat.addListener(new al0(18, this, zArr));
        ofFloat.setInterpolator(rr.f28031g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(zg.o0 o0Var, boolean z10) {
        if (Objects.equals(this.f41593v0, o0Var)) {
            return;
        }
        if (!z10) {
            this.f41593v0 = o0Var;
            this.f41591t0.e(o0Var);
            invalidate();
            return;
        }
        this.f41593v0 = o0Var;
        this.f41592u0.e(o0Var);
        zg.f0 f0Var = this.f41591t0;
        this.f41591t0 = this.f41592u0;
        this.f41592u0 = f0Var;
        this.f41594w0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            super.setScaleX(f7);
            this.f41589r0.c(f7);
            invalidate();
        }
    }
}
