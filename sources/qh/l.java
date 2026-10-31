package qh;

import ag.c2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f5;
public final class l extends View {
    public final int f45677a;
    public f5 f45678b;
    public final Paint f45679c;
    public long d;
    public TLRPC.Document e;
    public String f45680f;
    public float h;
    public float f45681n;
    public float f45682r;

    public l(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f45679c = paint;
        this.f45681n = 1.0f;
        this.f45682r = 1.0f;
        this.f45677a = i10;
        paint.setColor(738197503);
    }

    public String getKey() {
        return this.f45680f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f5 f5Var = this.f45678b;
        if (f5Var != null) {
            f5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f5 f5Var = this.f45678b;
        if (f5Var != null) {
            f5Var.n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        c2 c2Var;
        if (isPressed()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float f10 = this.h;
        if (f10 != f7) {
            if (Math.abs(f10 - f7) >= 0.02f) {
                float f11 = this.h;
                f7 = c3.i0.z(f7, f11, 0.35f, f11);
            }
            this.h = f7;
            invalidate();
        }
        float f12 = (1.0f - (this.h * 0.2f)) * this.f45681n * this.f45682r;
        if (f12 > 0.01f) {
            float width = getWidth() * 0.78f * f12;
            float width2 = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            f5 f5Var = this.f45678b;
            if (f5Var == null || (c2Var = f5Var.f25975k) == null || !c2Var.I()) {
                canvas.drawCircle(width2, height, 0.42f * width, this.f45679c);
            }
            f5 f5Var2 = this.f45678b;
            if (f5Var2 != null) {
                float f13 = width / 2.0f;
                f5Var2.setBounds((int) (width2 - f13), (int) (height - f13), (int) (width2 + f13), (int) (height + f13));
                r.b(canvas, this.f45678b);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size);
    }

    public void set(TLRPC.Document document) {
        long j10 = document.f19799id;
        if (j10 == 0) {
            if (this.f45678b != null && isAttachedToWindow()) {
                this.f45678b.n(this);
            }
            this.f45678b = null;
            this.d = 0L;
            this.e = document;
            this.f45680f = null;
            invalidate();
        } else if (j10 == this.d && this.f45678b != null) {
        } else {
            if (this.f45678b != null && isAttachedToWindow()) {
                this.f45678b.n(this);
            }
            this.d = document.f19799id;
            this.e = document;
            this.f45680f = "c:" + document.f19799id;
            this.f45678b = f5.l(this.f45677a, 2, document);
            if (isAttachedToWindow()) {
                this.f45678b.a(this);
            }
            setContentDescription(document.f19799id + "");
            invalidate();
        }
    }

    @Override
    public void setPressed(boolean z10) {
        if (z10 != isPressed()) {
            super.setPressed(z10);
            invalidate();
        }
    }
}
