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
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.t5;
public final class b0 extends Drawable {
    public final ImageView f53696a;
    public final Paint f53697b;
    public final RectF f53698c;
    public final long d;
    public final Drawable e;
    public boolean f53699f;
    public float f53700g;
    public boolean h;
    public final t5 f53701i;
    public final t5 f53702j;
    public final t5 f53703k;
    public bi0 f53704l;

    public b0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f53697b = paint;
        this.f53698c = new RectF();
        this.h = false;
        vh.d0 d0Var = new vh.d0(this, 29);
        gr grVar = gr.h;
        this.f53701i = new t5(d0Var, 320L, grVar, 0);
        this.f53702j = new t5(new vh.d0(this, 29), 320L, grVar, 0);
        this.f53703k = new t5(new vh.d0(this, 29), 320L, grVar, 0);
        this.f53696a = imageView;
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
        bi0 bi0Var;
        int i10;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float d = this.f53703k.d(this.h);
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
            Paint paint = this.f53697b;
            paint.setColor(r12);
            canvas2.drawCircle(f14, f15, L, paint);
            float f16 = f12 * 1.0f;
            paint.setColor(t6.r1(f16, -1));
            float f17 = f14 - L;
            f10 = 255.0f;
            float f18 = f15 - L;
            float f19 = f14 + L;
            float f20 = f15 + L;
            RectF rectF = this.f53698c;
            rectF.set(f17, f18, f19, f20);
            float d10 = this.f53701i.d(this.f53699f);
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
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f53702j.e(false, this.f53700g)) * (-360.0f) * d10, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f7 = 0.0f;
            f10 = 255.0f;
        }
        if (d > f7 && (bi0Var = this.f53704l) != null) {
            int i12 = bi0Var.f24753b / 2;
            int i13 = bi0Var.f24755c / 2;
            bi0Var.setBounds(centerX - i12, centerY - i13, i12 + centerX, i13 + centerY);
            this.f53704l.setAlpha((int) (d * f10));
            this.f53704l.draw(canvas2);
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
