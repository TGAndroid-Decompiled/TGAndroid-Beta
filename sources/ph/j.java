package ph;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
public final class j extends Drawable {
    public final Paint f41760a;
    public final Paint f41761b;
    public final i f41762c;
    public final i d;
    public boolean e;
    public final org.telegram.ui.Components.z5 f41763f;
    public final Path f41764g;
    public final int h;
    public float f41765i;
    public float f41766j;
    public float f41767k;
    public int f41768l;
    public boolean f41769m;
    public float f41770n;
    public float f41771o;

    public j(int i10) {
        Paint paint = new Paint(1);
        this.f41760a = paint;
        this.f41761b = new Paint(1);
        i iVar = new i(this, 0);
        this.f41762c = iVar;
        i iVar2 = new i(this, 1);
        this.d = iVar2;
        this.e = false;
        org.telegram.ui.web.o0 o0Var = new org.telegram.ui.web.o0(this, 8);
        nr nrVar = nr.h;
        this.f41763f = new org.telegram.ui.Components.z5(o0Var, 350L, nrVar, 0);
        this.f41764g = new Path();
        this.f41765i = 21.0f;
        this.h = i10;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        iVar.k(0.3f, 250L, nrVar);
        iVar.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        iVar.t(AndroidUtilities.dpf2(12.0f));
        iVar.f25884b = 17;
        iVar2.k(0.3f, 250L, nrVar);
        iVar2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        iVar2.t(AndroidUtilities.dpf2(12.0f));
        iVar2.f25884b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f10) {
        float dpf2 = AndroidUtilities.dpf2(this.f41765i) / 2.0f;
        float e = this.f41763f.e(this.e);
        int i10 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint = this.f41761b;
            paint.setAlpha((int) (f10 * 255.0f * e));
            canvas.drawCircle(this.f41770n, this.f41771o, AndroidUtilities.dpf2(11.33f) * e, paint);
        }
        Paint paint2 = this.f41760a;
        paint2.setAlpha((int) ((1.0f - e) * Color.alpha(this.f41768l) * f10));
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = this.f41770n;
        float f12 = this.f41771o;
        rectF.set(f11 - dpf2, f12 - dpf2, f11 + dpf2, f12 + dpf2);
        canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
        int i11 = this.h;
        float f13 = ((i11 + 1) * 1.5f) + (i11 * 1.0f);
        float f14 = (1.0f / f13) * 180.0f;
        float f15 = (1.5f / f13) * 180.0f;
        float f16 = f15;
        int i12 = 0;
        while (i12 < i11) {
            float f17 = f14;
            canvas.drawArc(AndroidUtilities.rectTmp, f16 + 270.0f, f17, false, paint2);
            f16 = f17 + f15 + f16;
            i12++;
            f14 = f17;
        }
        canvas.save();
        canvas.translate(this.f41766j + 0.0f, this.f41767k);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) (this.f41770n - AndroidUtilities.dp(20.0f)), (int) (this.f41771o - AndroidUtilities.dp(20.0f)), (int) (this.f41770n + AndroidUtilities.dp(20.0f)), (int) (this.f41771o + AndroidUtilities.dp(20.0f)));
        i iVar = this.f41762c;
        iVar.setBounds(rect);
        iVar.f25901w = (int) (Color.alpha(this.f41768l) * f10);
        iVar.draw(canvas);
        if (i10 > 0) {
            Path path = this.f41764g;
            path.rewind();
            path.addCircle(this.f41770n, this.f41771o + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(11.33f) * e, Path.Direction.CW);
            canvas.clipPath(path);
            i iVar2 = this.d;
            iVar2.setBounds(rect);
            iVar2.f25901w = (int) (f10 * 255.0f);
            iVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z4) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f41769m != z4) {
            this.f41769m = z4;
            PorterDuffXfermode porterDuffXfermode2 = null;
            if (z4) {
                porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            } else {
                porterDuffXfermode = null;
            }
            this.f41760a.setXfermode(porterDuffXfermode);
            TextPaint textPaint = this.f41762c.f25883a;
            if (z4) {
                porterDuffXfermode2 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            }
            textPaint.setXfermode(porterDuffXfermode2);
        }
    }

    public final void c(float f10) {
        this.d.t(AndroidUtilities.dpf2(f10));
        this.f41762c.t(AndroidUtilities.dpf2(f10));
    }

    public final void d(int i10, boolean z4, boolean z10) {
        this.f41762c.q("" + i10, z10, true);
        this.d.q("" + i10, z10, true);
        this.e = z4;
        if (!z10) {
            this.f41763f.f(z4, true);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i10, int i11, int i12) {
        this.f41768l = i10;
        this.f41760a.setColor(i10);
        this.f41762c.r(i10);
        this.d.r(i12);
        this.f41761b.setColor(i11);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f41770n = getBounds().centerX();
        this.f41771o = getBounds().centerY();
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f41770n = getBounds().centerX();
        this.f41771o = getBounds().centerY();
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
