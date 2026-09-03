package qh;

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
import org.telegram.ui.Components.pr;
public final class j extends Drawable {
    public final Paint f45502a;
    public final Paint f45503b;
    public final i f45504c;
    public final i d;
    public boolean f45505e;
    public final org.telegram.ui.Components.z5 f45506f;
    public final Path f45507g;
    public final int h;
    public float f45508i;
    public float f45509j;
    public float f45510k;
    public int f45511l;
    public boolean f45512m;
    public float f45513n;
    public float f45514o;

    public j(int i10) {
        Paint paint = new Paint(1);
        this.f45502a = paint;
        this.f45503b = new Paint(1);
        i iVar = new i(this, 0);
        this.f45504c = iVar;
        i iVar2 = new i(this, 1);
        this.d = iVar2;
        this.f45505e = false;
        org.telegram.ui.web.s0 s0Var = new org.telegram.ui.web.s0(this, 9);
        pr prVar = pr.h;
        this.f45506f = new org.telegram.ui.Components.z5(s0Var, 350L, prVar, 0);
        this.f45507g = new Path();
        this.f45508i = 21.0f;
        this.h = i10;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        iVar.k(0.3f, 250L, prVar);
        iVar.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        iVar.t(AndroidUtilities.dpf2(12.0f));
        iVar.f27999b = 17;
        iVar2.k(0.3f, 250L, prVar);
        iVar2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        iVar2.t(AndroidUtilities.dpf2(12.0f));
        iVar2.f27999b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f10) {
        float dpf2 = AndroidUtilities.dpf2(this.f45508i) / 2.0f;
        float e6 = this.f45506f.e(this.f45505e);
        int i10 = (e6 > 0.0f ? 1 : (e6 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint = this.f45503b;
            paint.setAlpha((int) (f10 * 255.0f * e6));
            canvas.drawCircle(this.f45513n, this.f45514o, AndroidUtilities.dpf2(11.33f) * e6, paint);
        }
        Paint paint2 = this.f45502a;
        paint2.setAlpha((int) ((1.0f - e6) * Color.alpha(this.f45511l) * f10));
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = this.f45513n;
        float f12 = this.f45514o;
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
        canvas.translate(this.f45509j + 0.0f, this.f45510k);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) (this.f45513n - AndroidUtilities.dp(20.0f)), (int) (this.f45514o - AndroidUtilities.dp(20.0f)), (int) (this.f45513n + AndroidUtilities.dp(20.0f)), (int) (this.f45514o + AndroidUtilities.dp(20.0f)));
        i iVar = this.f45504c;
        iVar.setBounds(rect);
        iVar.f28017w = (int) (Color.alpha(this.f45511l) * f10);
        iVar.draw(canvas);
        if (i10 > 0) {
            Path path = this.f45507g;
            path.rewind();
            path.addCircle(this.f45513n, this.f45514o + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(11.33f) * e6, Path.Direction.CW);
            canvas.clipPath(path);
            i iVar2 = this.d;
            iVar2.setBounds(rect);
            iVar2.f28017w = (int) (f10 * 255.0f);
            iVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z4) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f45512m != z4) {
            this.f45512m = z4;
            PorterDuffXfermode porterDuffXfermode2 = null;
            if (z4) {
                porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            } else {
                porterDuffXfermode = null;
            }
            this.f45502a.setXfermode(porterDuffXfermode);
            TextPaint textPaint = this.f45504c.f27998a;
            if (z4) {
                porterDuffXfermode2 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            }
            textPaint.setXfermode(porterDuffXfermode2);
        }
    }

    public final void c(float f10) {
        this.d.t(AndroidUtilities.dpf2(f10));
        this.f45504c.t(AndroidUtilities.dpf2(f10));
    }

    public final void d(int i10, boolean z4, boolean z10) {
        this.f45504c.q("" + i10, z10, true);
        this.d.q("" + i10, z10, true);
        this.f45505e = z4;
        if (!z10) {
            this.f45506f.f(z4, true);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i10, int i11, int i12) {
        this.f45511l = i10;
        this.f45502a.setColor(i10);
        this.f45504c.r(i10);
        this.d.r(i12);
        this.f45503b.setColor(i11);
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
        this.f45513n = getBounds().centerX();
        this.f45514o = getBounds().centerY();
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f45513n = getBounds().centerX();
        this.f45514o = getBounds().centerY();
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
