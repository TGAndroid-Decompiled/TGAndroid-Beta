package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.t5;
public final class b0 extends Drawable {
    public final ImageView f53714a;
    public final Paint f53715b;
    public final RectF f53716c;
    public final long d;
    public final Drawable e;
    public boolean f53717f;
    public float f53718g;
    public boolean h;
    public final t5 f53719i;
    public final t5 f53720j;
    public final t5 f53721k;
    public ci0 f53722l;

    public b0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f53715b = paint;
        this.f53716c = new RectF();
        this.h = false;
        vh.d0 d0Var = new vh.d0(this, 29);
        gr grVar = gr.h;
        this.f53719i = new t5(d0Var, 320L, grVar, 0);
        this.f53720j = new t5(new vh.d0(this, 29), 320L, grVar, 0);
        this.f53721k = new t5(new vh.d0(this, 29), 320L, grVar, 0);
        this.f53714a = imageView;
        this.d = System.currentTimeMillis();
        this.e = i0.a.f(context, 2131232683);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        ci0 ci0Var;
        int i10;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float d = this.f53721k.d(this.h);
        float f11 = 0.0f;
        char c10 = 2;
        if (d < 1.0f) {
            float f12 = 1.0f - d;
            float f13 = (0.4f * f12) + 0.6f;
            canvas2.save();
            float f14 = centerX;
            float f15 = centerY;
            canvas2.scale(f13, f13, f14, f15);
            Drawable drawable = this.e;
            drawable.setBounds(org.telegram.ui.Cells.f1.z(2, centerX, drawable), org.telegram.ui.Cells.f1.y(2, centerY, drawable), org.telegram.ui.Cells.f1.w(2, centerX, drawable), org.telegram.ui.Cells.f1.f(2, centerY, drawable));
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.draw(canvas2);
            float L = org.telegram.messenger.i0.L(14.0f);
            int r12 = t6.r1(0.2f * f12, -1);
            Paint paint = this.f53715b;
            paint.setColor(r12);
            canvas2.drawCircle(f14, f15, L, paint);
            float f16 = f12 * 1.0f;
            paint.setColor(t6.r1(f16, -1));
            float f17 = f14 - L;
            f10 = 255.0f;
            float f18 = f15 - L;
            float f19 = f14 + L;
            float f20 = f15 + L;
            RectF rectF = this.f53716c;
            rectF.set(f17, f18, f19, f20);
            float d10 = this.f53719i.d(this.f53717f);
            paint.setColor(t6.r1((1.0f - d10) * f12 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.d;
            canvas2.drawArc(rectF, (-(((((float) ((currentTimeMillis - j10) % 600)) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = (((float) (System.currentTimeMillis() - j10)) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            int i11 = 0;
            while (i11 < 4) {
                u1.a aVar = kp.h;
                float f21 = f11;
                aVar.getInterpolation((currentTimeMillis2 - (i11 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (i10 + 667)) / 667.0f) * 250.0f;
                i11++;
                f11 = f21;
                c10 = c10;
            }
            f7 = f11;
            paint.setColor(t6.r1(f16, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f53720j.e(false, this.f53718g)) * (-360.0f) * d10, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f7 = 0.0f;
            f10 = 255.0f;
        }
        if (d > f7 && (ci0Var = this.f53722l) != null) {
            int i12 = ci0Var.f25132b / 2;
            int i13 = ci0Var.f25134c / 2;
            ci0Var.setBounds(centerX - i12, centerY - i13, i12 + centerX, i13 + centerY);
            this.f53722l.setAlpha((int) (d * f10));
            this.f53722l.draw(canvas2);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(40.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(40.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
