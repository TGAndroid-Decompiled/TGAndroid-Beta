package w4;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import c3.h0;
import org.telegram.ui.Components.iy0;
public final class c extends Drawable implements Animatable {
    public static final LinearInterpolator h = new LinearInterpolator();
    public static final u1.a f50792n = new u1.a();
    public static final int[] f50793r = {-16777216};
    public final b f50794a;
    public float f50795b;
    public final Resources f50796c;
    public final ValueAnimator d;
    public float e;
    public boolean f50797f;

    public c(Context context) {
        context.getClass();
        this.f50796c = context.getResources();
        b bVar = new b();
        this.f50794a = bVar;
        bVar.f50779i = f50793r;
        bVar.a(0);
        bVar.h = 2.5f;
        bVar.f50775b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new iy0(2, this, bVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(h);
        ofFloat.addListener(new a(this, bVar));
        this.d = ofFloat;
    }

    public static void b(float f7, b bVar) {
        if (f7 > 0.75f) {
            float f10 = (f7 - 0.75f) / 0.25f;
            int[] iArr = bVar.f50779i;
            int i10 = bVar.f50780j;
            int i11 = iArr[i10];
            int i12 = iArr[(i10 + 1) % iArr.length];
            int i13 = (i11 >> 24) & 255;
            int i14 = (i11 >> 16) & 255;
            int i15 = (i11 >> 8) & 255;
            int i16 = i11 & 255;
            bVar.f50791u = ((i13 + ((int) ((((i12 >> 24) & 255) - i13) * f10))) << 24) | ((i14 + ((int) ((((i12 >> 16) & 255) - i14) * f10))) << 16) | ((i15 + ((int) ((((i12 >> 8) & 255) - i15) * f10))) << 8) | (i16 + ((int) (f10 * ((i12 & 255) - i16))));
            return;
        }
        bVar.f50791u = bVar.f50779i[bVar.f50780j];
    }

    public final void a(float f7, b bVar, boolean z10) {
        float interpolation;
        float f10;
        if (this.f50797f) {
            b(f7, bVar);
            float floor = (float) (Math.floor(bVar.f50783m / 0.8f) + 1.0d);
            float f11 = bVar.f50781k;
            float f12 = bVar.f50782l;
            bVar.e = (((f12 - 0.01f) - f11) * f7) + f11;
            bVar.f50777f = f12;
            float f13 = bVar.f50783m;
            bVar.f50778g = h0.z(floor, f13, f7, f13);
        } else if (f7 == 1.0f && !z10) {
        } else {
            float f14 = bVar.f50783m;
            int i10 = (f7 > 0.5f ? 1 : (f7 == 0.5f ? 0 : -1));
            u1.a aVar = f50792n;
            if (i10 < 0) {
                interpolation = bVar.f50781k;
                f10 = (aVar.getInterpolation(f7 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f15 = bVar.f50781k + 0.79f;
                interpolation = f15 - (((1.0f - aVar.getInterpolation((f7 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f10 = f15;
            }
            bVar.e = interpolation;
            bVar.f50777f = f10;
            bVar.f50778g = (0.20999998f * f7) + f14;
            this.f50795b = (f7 + this.e) * 216.0f;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f50795b, bounds.exactCenterX(), bounds.exactCenterY());
        b bVar = this.f50794a;
        Paint paint = bVar.f50775b;
        RectF rectF = bVar.f50774a;
        float f7 = bVar.f50787q;
        float f10 = (bVar.h / 2.0f) + f7;
        if (f7 <= 0.0f) {
            f10 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((bVar.f50788r * bVar.f50786p) / 2.0f, bVar.h / 2.0f);
        }
        rectF.set(bounds.centerX() - f10, bounds.centerY() - f10, bounds.centerX() + f10, bounds.centerY() + f10);
        float f11 = bVar.e;
        float f12 = bVar.f50778g;
        float f13 = (f11 + f12) * 360.0f;
        float f14 = ((bVar.f50777f + f12) * 360.0f) - f13;
        paint.setColor(bVar.f50791u);
        paint.setAlpha(bVar.f50790t);
        float f15 = bVar.h / 2.0f;
        rectF.inset(f15, f15);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, bVar.d);
        float f16 = -f15;
        rectF.inset(f16, f16);
        canvas.drawArc(rectF, f13, f14, false, paint);
        Paint paint2 = bVar.f50776c;
        if (bVar.f50784n) {
            Path path = bVar.f50785o;
            if (path == null) {
                Path path2 = new Path();
                bVar.f50785o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            bVar.f50785o.moveTo(0.0f, 0.0f);
            bVar.f50785o.lineTo(bVar.f50788r * bVar.f50786p, 0.0f);
            Path path3 = bVar.f50785o;
            float f17 = bVar.f50786p;
            path3.lineTo((bVar.f50788r * f17) / 2.0f, bVar.f50789s * f17);
            bVar.f50785o.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((bVar.f50788r * bVar.f50786p) / 2.0f), (bVar.h / 2.0f) + rectF.centerY());
            bVar.f50785o.close();
            paint2.setColor(bVar.f50791u);
            paint2.setAlpha(bVar.f50790t);
            canvas.save();
            canvas.rotate(f13 + f14, rectF.centerX(), rectF.centerY());
            canvas.drawPath(bVar.f50785o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f50794a.f50790t;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final boolean isRunning() {
        return this.d.isRunning();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f50794a.f50790t = i10;
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f50794a.f50775b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override
    public final void start() {
        this.d.cancel();
        b bVar = this.f50794a;
        float f7 = bVar.e;
        bVar.f50781k = f7;
        float f10 = bVar.f50777f;
        bVar.f50782l = f10;
        bVar.f50783m = bVar.f50778g;
        if (f10 != f7) {
            this.f50797f = true;
            this.d.setDuration(666L);
            this.d.start();
            return;
        }
        bVar.a(0);
        bVar.f50781k = 0.0f;
        bVar.f50782l = 0.0f;
        bVar.f50783m = 0.0f;
        bVar.e = 0.0f;
        bVar.f50777f = 0.0f;
        bVar.f50778g = 0.0f;
        this.d.setDuration(1332L);
        this.d.start();
    }

    @Override
    public final void stop() {
        this.d.cancel();
        this.f50795b = 0.0f;
        b bVar = this.f50794a;
        if (bVar.f50784n) {
            bVar.f50784n = false;
        }
        bVar.a(0);
        bVar.f50781k = 0.0f;
        bVar.f50782l = 0.0f;
        bVar.f50783m = 0.0f;
        bVar.e = 0.0f;
        bVar.f50777f = 0.0f;
        bVar.f50778g = 0.0f;
        invalidateSelf();
    }
}
