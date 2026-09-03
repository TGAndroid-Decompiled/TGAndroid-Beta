package rh;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.z5;
import ph.ga;
public final class e0 extends Drawable {
    public final ImageView f43557a;
    public final Paint f43558b;
    public final RectF f43559c;
    public final long d;
    public final Drawable e;
    public boolean f43560f;
    public float f43561g;
    public boolean h;
    public final z5 f43562i;
    public final z5 f43563j;
    public final z5 f43564k;
    public gj0 f43565l;

    public e0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f43558b = paint;
        this.f43559c = new RectF();
        this.h = false;
        ga gaVar = new ga(this, 6);
        mr mrVar = mr.h;
        this.f43562i = new z5(gaVar, 320L, mrVar, 0);
        this.f43563j = new z5(new ga(this, 6), 320L, mrVar, 0);
        this.f43564k = new z5(new ga(this, 6), 320L, mrVar, 0);
        this.f43557a = imageView;
        this.d = System.currentTimeMillis();
        this.e = context.getResources().getDrawable(R.drawable.search_files_filled).mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        gj0 gj0Var;
        int i10;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float e = this.f43564k.e(this.h);
        if (e < 1.0f) {
            float f12 = 1.0f - e;
            float f13 = (0.4f * f12) + 0.6f;
            canvas2.save();
            float f14 = centerX;
            float f15 = centerY;
            canvas2.scale(f13, f13, f14, f15);
            Drawable drawable = this.e;
            drawable.setBounds(org.telegram.ui.b.u(2, centerX, drawable), org.telegram.ui.b.f(2, centerY, drawable), org.telegram.ui.b.A(2, centerX, drawable), org.telegram.ui.b.y(2, centerY, drawable));
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.draw(canvas2);
            float dp = AndroidUtilities.dp(14.0f);
            int l1 = j6.l1(0.2f * f12, -1);
            Paint paint = this.f43558b;
            paint.setColor(l1);
            canvas2.drawCircle(f14, f15, dp, paint);
            float f16 = f12 * 1.0f;
            paint.setColor(j6.l1(f16, -1));
            float f17 = f14 - dp;
            f10 = 255.0f;
            float f18 = f15 - dp;
            float f19 = f14 + dp;
            float f20 = f15 + dp;
            RectF rectF = this.f43559c;
            rectF.set(f17, f18, f19, f20);
            float e6 = this.f43562i.e(this.f43560f);
            paint.setColor(j6.l1((1.0f - e6) * f12 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.d;
            canvas2.drawArc(rectF, (-(((((float) ((currentTimeMillis - j10) % 600)) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = (((float) (System.currentTimeMillis() - j10)) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            for (int i11 = 0; i11 < 4; i11++) {
                u1.a aVar = qp.h;
                aVar.getInterpolation((currentTimeMillis2 - (i11 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (i10 + 667)) / 667.0f) * 250.0f;
            }
            f11 = 0.0f;
            paint.setColor(j6.l1(f16, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f43563j.d(this.f43561g, false)) * (-360.0f) * e6, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (e > f11 && (gj0Var = this.f43565l) != null) {
            int i12 = gj0Var.f25154b / 2;
            int i13 = gj0Var.f25156c / 2;
            gj0Var.setBounds(centerX - i12, centerY - i13, i12 + centerX, i13 + centerY);
            this.f43565l.setAlpha((int) (e * f10));
            this.f43565l.draw(canvas2);
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
