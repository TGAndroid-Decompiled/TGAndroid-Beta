package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.z5;
import qh.u9;
public final class e0 extends Drawable {
    public final ImageView f47427a;
    public final Paint f47428b;
    public final RectF f47429c;
    public final long d;
    public final Drawable f47430e;
    public boolean f47431f;
    public float f47432g;
    public boolean h;
    public final z5 f47433i;
    public final z5 f47434j;
    public final z5 f47435k;
    public hj0 f47436l;

    public e0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f47428b = paint;
        this.f47429c = new RectF();
        this.h = false;
        u9 u9Var = new u9(this, 7);
        pr prVar = pr.h;
        this.f47433i = new z5(u9Var, 320L, prVar, 0);
        this.f47434j = new z5(new u9(this, 7), 320L, prVar, 0);
        this.f47435k = new z5(new u9(this, 7), 320L, prVar, 0);
        this.f47427a = imageView;
        this.d = System.currentTimeMillis();
        this.f47430e = context.getResources().getDrawable(R.drawable.search_files_filled).mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        hj0 hj0Var;
        int i10;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float e6 = this.f47435k.e(this.h);
        if (e6 < 1.0f) {
            float f12 = 1.0f - e6;
            float f13 = (0.4f * f12) + 0.6f;
            canvas2.save();
            float f14 = centerX;
            float f15 = centerY;
            canvas2.scale(f13, f13, f14, f15);
            Drawable drawable = this.f47430e;
            drawable.setBounds(org.telegram.ui.b.u(2, centerX, drawable), org.telegram.ui.b.f(2, centerY, drawable), org.telegram.ui.b.A(2, centerX, drawable), org.telegram.ui.b.y(2, centerY, drawable));
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.draw(canvas2);
            float dp = AndroidUtilities.dp(14.0f);
            int l1 = k6.l1(0.2f * f12, -1);
            Paint paint = this.f47428b;
            paint.setColor(l1);
            canvas2.drawCircle(f14, f15, dp, paint);
            float f16 = f12 * 1.0f;
            paint.setColor(k6.l1(f16, -1));
            float f17 = f14 - dp;
            f10 = 255.0f;
            float f18 = f15 - dp;
            float f19 = f14 + dp;
            float f20 = f15 + dp;
            RectF rectF = this.f47429c;
            rectF.set(f17, f18, f19, f20);
            float e10 = this.f47433i.e(this.f47431f);
            paint.setColor(k6.l1((1.0f - e10) * f12 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.d;
            canvas2.drawArc(rectF, (-(((((float) ((currentTimeMillis - j10) % 600)) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = (((float) (System.currentTimeMillis() - j10)) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            for (int i11 = 0; i11 < 4; i11++) {
                u1.a aVar = tp.h;
                aVar.getInterpolation((currentTimeMillis2 - (i11 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (i10 + 667)) / 667.0f) * 250.0f;
            }
            f11 = 0.0f;
            paint.setColor(k6.l1(f16, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f47434j.d(this.f47432g, false)) * (-360.0f) * e10, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (e6 > f11 && (hj0Var = this.f47436l) != null) {
            int i12 = hj0Var.f27519b / 2;
            int i13 = hj0Var.f27521c / 2;
            hj0Var.setBounds(centerX - i12, centerY - i13, i12 + centerX, i13 + centerY);
            this.f47436l.setAlpha((int) (e6 * f10));
            this.f47436l.draw(canvas2);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(40.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(40.0f);
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
