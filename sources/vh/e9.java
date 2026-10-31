package vh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class e9 extends View implements y1 {
    public Paint f51117a;
    public Paint f51118b;
    public org.telegram.ui.Components.e6 f51119c;
    public boolean d;
    public org.telegram.ui.Components.t5 e;

    public final void a(long j10, boolean z10) {
        long j11 = j10 % 60;
        long j12 = (j10 - j11) / 60;
        StringBuilder sb2 = new StringBuilder(5);
        if (j12 < 10) {
            sb2.append('0');
        }
        sb2.append(j12);
        sb2.append(':');
        if (j11 < 10) {
            sb2.append('0');
        }
        sb2.append(j11);
        this.f51119c.t(sb2, z10, true);
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        this.d = z10;
        if (!z11) {
            org.telegram.ui.Components.t5 t5Var = this.e;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            t5Var.e(true, f7);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Paint paint = this.f51118b;
        org.telegram.ui.Components.e6 e6Var = this.f51119c;
        super.onDraw(canvas);
        org.telegram.ui.Components.t5 t5Var = this.e;
        if (this.d) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float e = t5Var.e(false, f7);
        float L = org.telegram.messenger.i0.L(12.66f) * e;
        float c10 = e6Var.c() + L;
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(((getWidth() - c10) / 2.0f) - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(18.0f), ((getWidth() + c10) / 2.0f) + org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(40.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), this.f51117a);
        if (e > 0.0f) {
            paint.setAlpha((int) (Utilities.i((((float) Math.sin((((float) (System.currentTimeMillis() % 2000)) / 1000.0f) * 3.141592653589793d)) / 4.0f) + 0.75f, 1.0f, 0.0f) * 255.0f));
            invalidate();
            canvas.drawCircle(rectF.left + org.telegram.messenger.i0.L(10.66f), rectF.centerY(), org.telegram.messenger.i0.L(4.0f) * e, paint);
        }
        e6Var.setBounds((int) (rectF.left + L), ((int) rectF.top) - org.telegram.messenger.i0.L(1.0f), (int) rectF.right, (int) rectF.bottom);
        e6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(45.0f), 1073741824));
    }

    @Override
    public void setInvert(float f7) {
        this.f51117a.setColor(i0.b.f(f7, 1056964608, 268435456));
        this.f51119c.u(i0.b.f(f7, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f51119c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
