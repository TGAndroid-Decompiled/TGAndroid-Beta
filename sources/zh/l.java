package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import ci.g3;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r5;
public final class l extends View {
    public final int f51800a;
    public r5 f51801b;
    public final Paint f51802c;
    public long d;
    public TLRPC.Document e;
    public String f51803f;
    public float h;
    public float f51804n;
    public float f51805r;

    public l(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f51802c = paint;
        this.f51804n = 1.0f;
        this.f51805r = 1.0f;
        this.f51800a = i10;
        paint.setColor(738197503);
    }

    public String getKey() {
        return this.f51803f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r5 r5Var = this.f51801b;
        if (r5Var != null) {
            r5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r5 r5Var = this.f51801b;
        if (r5Var != null) {
            r5Var.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        g3 g3Var;
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
        float f12 = (1.0f - (this.h * 0.2f)) * this.f51804n * this.f51805r;
        if (f12 > 0.01f) {
            float width = getWidth() * 0.78f * f12;
            float width2 = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            r5 r5Var = this.f51801b;
            if (r5Var == null || (g3Var = r5Var.f29849k) == null || !g3Var.hasBitmapImage()) {
                canvas.drawCircle(width2, height, 0.42f * width, this.f51802c);
            }
            r5 r5Var2 = this.f51801b;
            if (r5Var2 != null) {
                float f13 = width / 2.0f;
                r5Var2.setBounds((int) (width2 - f13), (int) (height - f13), (int) (width2 + f13), (int) (height + f13));
                r.b(canvas, this.f51801b);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size);
    }

    public void set(TLRPC.Document document) {
        long j10 = document.f20285id;
        if (j10 == 0) {
            if (this.f51801b != null && isAttachedToWindow()) {
                this.f51801b.o(this);
            }
            this.f51801b = null;
            this.d = 0L;
            this.e = document;
            this.f51803f = null;
            invalidate();
        } else if (j10 == this.d && this.f51801b != null) {
        } else {
            if (this.f51801b != null && isAttachedToWindow()) {
                this.f51801b.o(this);
            }
            this.d = document.f20285id;
            this.e = document;
            this.f51803f = "c:" + document.f20285id;
            this.f51801b = r5.m(this.f51800a, 2, document);
            if (isAttachedToWindow()) {
                this.f51801b.a(this);
            }
            setContentDescription(document.f20285id + "");
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
