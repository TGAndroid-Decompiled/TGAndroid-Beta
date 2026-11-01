package vh;

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
import org.telegram.ui.Components.gr;
public final class j extends Drawable {
    public final Paint f51304a;
    public final Paint f51305b;
    public final i f51306c;
    public final i d;
    public boolean e;
    public final org.telegram.ui.Components.t5 f51307f;
    public final Path f51308g;
    public final int h;
    public float f51309i;
    public float f51310j;
    public float f51311k;
    public int f51312l;
    public boolean f51313m;
    public float f51314n;
    public float f51315o;

    public j(int i10) {
        Paint paint = new Paint(1);
        this.f51304a = paint;
        this.f51305b = new Paint(1);
        i iVar = new i(this, 0);
        this.f51306c = iVar;
        i iVar2 = new i(this, 1);
        this.d = iVar2;
        this.e = false;
        sg.v vVar = new sg.v(this, 28);
        gr grVar = gr.h;
        this.f51307f = new org.telegram.ui.Components.t5(vVar, 350L, grVar, 0);
        this.f51308g = new Path();
        this.f51309i = 21.0f;
        this.h = i10;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        iVar.n(0.3f, 250L, grVar);
        iVar.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        iVar.w(org.telegram.messenger.i0.N(12.0f));
        iVar.f25744b = 17;
        iVar2.n(0.3f, 250L, grVar);
        iVar2.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        iVar2.w(org.telegram.messenger.i0.N(12.0f));
        iVar2.f25744b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f7) {
        float N = org.telegram.messenger.i0.N(this.f51309i) / 2.0f;
        float d = this.f51307f.d(this.e);
        int i10 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint = this.f51305b;
            paint.setAlpha((int) (f7 * 255.0f * d));
            canvas.drawCircle(this.f51314n, this.f51315o, org.telegram.messenger.i0.N(11.33f) * d, paint);
        }
        Paint paint2 = this.f51304a;
        paint2.setAlpha((int) ((1.0f - d) * Color.alpha(this.f51312l) * f7));
        RectF rectF = org.telegram.messenger.i0.P;
        float f10 = this.f51314n;
        float f11 = this.f51315o;
        rectF.set(f10 - N, f11 - N, f10 + N, f11 + N);
        canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
        int i11 = this.h;
        float f12 = ((i11 + 1) * 1.5f) + (i11 * 1.0f);
        float f13 = (1.0f / f12) * 180.0f;
        float f14 = (1.5f / f12) * 180.0f;
        int i12 = 0;
        float f15 = f14;
        while (i12 < i11) {
            float f16 = f13;
            canvas.drawArc(org.telegram.messenger.i0.P, f15 + 270.0f, f16, false, paint2);
            f15 = f16 + f14 + f15;
            i12++;
            f13 = f16;
        }
        canvas.save();
        canvas.translate(this.f51310j + 0.0f, this.f51311k);
        Rect rect = org.telegram.messenger.i0.Q;
        rect.set((int) (this.f51314n - org.telegram.messenger.i0.L(20.0f)), (int) (this.f51315o - org.telegram.messenger.i0.L(20.0f)), (int) (this.f51314n + org.telegram.messenger.i0.L(20.0f)), (int) (this.f51315o + org.telegram.messenger.i0.L(20.0f)));
        i iVar = this.f51306c;
        iVar.setBounds(rect);
        iVar.B = (int) (Color.alpha(this.f51312l) * f7);
        iVar.draw(canvas);
        if (i10 > 0) {
            Path path = this.f51308g;
            path.rewind();
            path.addCircle(this.f51314n, this.f51315o + org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.N(11.33f) * d, Path.Direction.CW);
            canvas.clipPath(path);
            i iVar2 = this.d;
            iVar2.setBounds(rect);
            iVar2.B = (int) (f7 * 255.0f);
            iVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z10) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f51313m != z10) {
            this.f51313m = z10;
            PorterDuffXfermode porterDuffXfermode2 = null;
            if (z10) {
                porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            } else {
                porterDuffXfermode = null;
            }
            this.f51304a.setXfermode(porterDuffXfermode);
            TextPaint textPaint = this.f51306c.f25742a;
            if (z10) {
                porterDuffXfermode2 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            }
            textPaint.setXfermode(porterDuffXfermode2);
        }
    }

    public final void c(float f7) {
        this.d.w(org.telegram.messenger.i0.N(f7));
        this.f51306c.w(org.telegram.messenger.i0.N(f7));
    }

    public final void d(int i10, boolean z10, boolean z11) {
        this.f51306c.t("" + i10, z11, true);
        this.d.t("" + i10, z11, true);
        this.e = z10;
        if (!z11) {
            this.f51307f.f(z10, true);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i10, int i11, int i12) {
        this.f51312l = i10;
        this.f51304a.setColor(i10);
        this.f51306c.u(i10);
        this.d.u(i12);
        this.f51305b.setColor(i11);
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f51314n = getBounds().centerX();
        this.f51315o = getBounds().centerY();
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f51314n = getBounds().centerX();
        this.f51315o = getBounds().centerY();
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
