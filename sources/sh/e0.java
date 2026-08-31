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
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.z5;
import qh.v9;
public final class e0 extends Drawable {
    public final ImageView f47391a;
    public final Paint f47392b;
    public final RectF f47393c;
    public final long d;
    public final Drawable f47394e;
    public boolean f47395f;
    public float f47396g;
    public boolean h;
    public final z5 f47397i;
    public final z5 f47398j;
    public final z5 f47399k;
    public ij0 f47400l;

    public e0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f47392b = paint;
        this.f47393c = new RectF();
        this.h = false;
        v9 v9Var = new v9(this, 7);
        pr prVar = pr.h;
        this.f47397i = new z5(v9Var, 320L, prVar, 0);
        this.f47398j = new z5(new v9(this, 7), 320L, prVar, 0);
        this.f47399k = new z5(new v9(this, 7), 320L, prVar, 0);
        this.f47391a = imageView;
        this.d = System.currentTimeMillis();
        this.f47394e = context.getResources().getDrawable(R.drawable.search_files_filled).mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        ij0 ij0Var;
        int i10;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float e6 = this.f47399k.e(this.h);
        if (e6 < 1.0f) {
            float f12 = 1.0f - e6;
            float f13 = (0.4f * f12) + 0.6f;
            canvas2.save();
            float f14 = centerX;
            float f15 = centerY;
            canvas2.scale(f13, f13, f14, f15);
            Drawable drawable = this.f47394e;
            drawable.setBounds(org.telegram.ui.b.u(2, centerX, drawable), org.telegram.ui.b.f(2, centerY, drawable), org.telegram.ui.b.A(2, centerX, drawable), org.telegram.ui.b.y(2, centerY, drawable));
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.draw(canvas2);
            float dp = AndroidUtilities.dp(14.0f);
            int l1 = k6.l1(0.2f * f12, -1);
            Paint paint = this.f47392b;
            paint.setColor(l1);
            canvas2.drawCircle(f14, f15, dp, paint);
            float f16 = f12 * 1.0f;
            paint.setColor(k6.l1(f16, -1));
            float f17 = f14 - dp;
            f10 = 255.0f;
            float f18 = f15 - dp;
            float f19 = f14 + dp;
            float f20 = f15 + dp;
            RectF rectF = this.f47393c;
            rectF.set(f17, f18, f19, f20);
            float e10 = this.f47397i.e(this.f47395f);
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
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f47398j.d(this.f47396g, false)) * (-360.0f) * e10, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (e6 > f11 && (ij0Var = this.f47400l) != null) {
            int i12 = ij0Var.f27812b / 2;
            int i13 = ij0Var.f27814c / 2;
            ij0Var.setBounds(centerX - i12, centerY - i13, i12 + centerX, i13 + centerY);
            this.f47400l.setAlpha((int) (e6 * f10));
            this.f47400l.draw(canvas2);
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
