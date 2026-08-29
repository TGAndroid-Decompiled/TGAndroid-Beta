package ph;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.xi0;
public final class e0 extends Drawable {
    public final ImageView f45768a;
    public final Paint f45769b;
    public final RectF f45770c;
    public final long d;
    public final Drawable f45771e;
    public boolean f45772f;
    public float f45773g;
    public boolean h;
    public final d6 f45774i;
    public final d6 f45775j;
    public final d6 f45776k;
    public xi0 f45777l;

    public e0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f45769b = paint;
        this.f45770c = new RectF();
        this.h = false;
        org.telegram.ui.web.t1 t1Var = new org.telegram.ui.web.t1(this, 3);
        jr jrVar = jr.h;
        this.f45774i = new d6(t1Var, 320L, jrVar, 0);
        this.f45775j = new d6(new org.telegram.ui.web.t1(this, 3), 320L, jrVar, 0);
        this.f45776k = new d6(new org.telegram.ui.web.t1(this, 3), 320L, jrVar, 0);
        this.f45768a = imageView;
        this.d = System.currentTimeMillis();
        this.f45771e = context.getResources().getDrawable(R.drawable.search_files_filled).mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f9;
        float f10;
        xi0 xi0Var;
        int i10;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float e10 = this.f45776k.e(this.h);
        if (e10 < 1.0f) {
            float f11 = 1.0f - e10;
            float f12 = (0.4f * f11) + 0.6f;
            canvas2.save();
            float f13 = centerX;
            float f14 = centerY;
            canvas2.scale(f12, f12, f13, f14);
            Drawable drawable = this.f45771e;
            drawable.setBounds(org.telegram.ui.b.v(2, centerX, drawable), org.telegram.ui.b.f(2, centerY, drawable), org.telegram.ui.b.A(2, centerX, drawable), org.telegram.ui.b.y(2, centerY, drawable));
            drawable.setAlpha((int) (f11 * 255.0f));
            drawable.draw(canvas2);
            float dp = AndroidUtilities.dp(14.0f);
            int l1 = g6.l1(0.2f * f11, -1);
            Paint paint = this.f45769b;
            paint.setColor(l1);
            canvas2.drawCircle(f13, f14, dp, paint);
            float f15 = f11 * 1.0f;
            paint.setColor(g6.l1(f15, -1));
            float f16 = f13 - dp;
            f9 = 255.0f;
            float f17 = f14 - dp;
            float f18 = f13 + dp;
            float f19 = f14 + dp;
            RectF rectF = this.f45770c;
            rectF.set(f16, f17, f18, f19);
            float e11 = this.f45774i.e(this.f45772f);
            paint.setColor(g6.l1((1.0f - e11) * f11 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.d;
            canvas2.drawArc(rectF, (-(((((float) ((currentTimeMillis - j10) % 600)) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = (((float) (System.currentTimeMillis() - j10)) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            for (int i11 = 0; i11 < 4; i11++) {
                u1.a aVar = np.h;
                aVar.getInterpolation((currentTimeMillis2 - (i11 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (i10 + 667)) / 667.0f) * 250.0f;
            }
            f10 = 0.0f;
            paint.setColor(g6.l1(f15, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f45775j.d(this.f45773g, false)) * (-360.0f) * e11, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f9 = 255.0f;
            f10 = 0.0f;
        }
        if (e10 > f10 && (xi0Var = this.f45777l) != null) {
            int i12 = xi0Var.f34732b / 2;
            int i13 = xi0Var.f34734c / 2;
            xi0Var.setBounds(centerX - i12, centerY - i13, i12 + centerX, i13 + centerY);
            this.f45777l.setAlpha((int) (e10 * f9));
            this.f45777l.draw(canvas2);
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
