package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import ci.f3;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p5;
public final class l extends View {
    public final int f52490a;
    public p5 f52491b;
    public final Paint f52492c;
    public long d;
    public TLRPC.Document e;
    public String f52493f;
    public float h;
    public float f52494n;
    public float f52495r;

    public l(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f52492c = paint;
        this.f52494n = 1.0f;
        this.f52495r = 1.0f;
        this.f52490a = i10;
        paint.setColor(738197503);
    }

    public String getKey() {
        return this.f52493f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p5 p5Var = this.f52491b;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p5 p5Var = this.f52491b;
        if (p5Var != null) {
            p5Var.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        f3 f3Var;
        if (isPressed()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float f10 = this.h;
        if (f10 != f7) {
            if (Math.abs(f10 - f7) >= 0.02f) {
                float f11 = this.h;
                f7 = k3.y(f7, f11, 0.35f, f11);
            }
            this.h = f7;
            invalidate();
        }
        float f12 = (1.0f - (this.h * 0.2f)) * this.f52494n * this.f52495r;
        if (f12 > 0.01f) {
            float width = getWidth() * 0.78f * f12;
            float width2 = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            p5 p5Var = this.f52491b;
            if (p5Var == null || (f3Var = p5Var.f29484k) == null || !f3Var.hasBitmapImage()) {
                canvas.drawCircle(width2, height, 0.42f * width, this.f52492c);
            }
            p5 p5Var2 = this.f52491b;
            if (p5Var2 != null) {
                float f13 = width / 2.0f;
                p5Var2.setBounds((int) (width2 - f13), (int) (height - f13), (int) (width2 + f13), (int) (height + f13));
                r.b(canvas, this.f52491b);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size);
    }

    public void set(TLRPC.Document document) {
        long j10 = document.f20350id;
        if (j10 == 0) {
            if (this.f52491b != null && isAttachedToWindow()) {
                this.f52491b.o(this);
            }
            this.f52491b = null;
            this.d = 0L;
            this.e = document;
            this.f52493f = null;
            invalidate();
        } else if (j10 == this.d && this.f52491b != null) {
        } else {
            if (this.f52491b != null && isAttachedToWindow()) {
                this.f52491b.o(this);
            }
            this.d = document.f20350id;
            this.e = document;
            this.f52493f = "c:" + document.f20350id;
            this.f52491b = p5.m(this.f52490a, 2, document);
            if (isAttachedToWindow()) {
                this.f52491b.a(this);
            }
            setContentDescription(document.f20350id + "");
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
