package pi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import c8.ob;
public final class b extends ob {
    public final boolean f53551a;
    public final Paint f53552b = new Paint();
    public final Paint f53553c;
    public final Paint d;
    public int f53554e;
    public int f53555f;
    public final f f53556g;

    public b(f fVar, boolean z9) {
        this.f53556g = fVar;
        Paint paint = new Paint(1);
        this.f53553c = paint;
        this.d = new Paint(1);
        this.f53554e = -1;
        this.f53555f = -1;
        this.f53551a = z9;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override
    public final void b() {
        this.f53554e = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        boolean z9;
        Paint paint;
        boolean z10;
        boolean z11;
        f fVar;
        float f10;
        float f11;
        f fVar2 = this.f53556g;
        Rect bounds = fVar2.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        float f12 = width;
        int ceil = (int) Math.ceil(f12 / 5.0f);
        float f13 = height;
        int ceil2 = (int) Math.ceil(f13 / 5.0f);
        boolean z12 = this.f53551a;
        if (z12) {
            z9 = fVar2.f53579w;
        } else {
            z9 = fVar2.f53580x;
        }
        Paint paint2 = this.f53553c;
        Paint paint3 = this.d;
        if (!z9 && this.f53554e == width && this.f53555f == height) {
            fVar = fVar2;
            paint = paint3;
            z10 = z12;
        } else {
            int i7 = fVar2.f53581y;
            if (i7 != 1 && i7 != 4) {
                f13 = f12;
            }
            if (z12) {
                g gVar = fVar2.D;
                gVar.getClass();
                float f14 = 0;
                paint = paint3;
                z10 = z12;
                z11 = false;
                paint2.setShader(f.k(fVar2, gVar, f13, f14, -1, 5));
                g gVar2 = fVar2.E;
                gVar2.getClass();
                paint.setShader(f.k(fVar2, gVar2, f13, f14, fVar2.H, 5));
                fVar = fVar2;
            } else {
                paint = paint3;
                z10 = z12;
                z11 = false;
                g gVar3 = fVar2.F;
                gVar3.getClass();
                fVar = fVar2;
                paint.setShader(f.k(fVar2, gVar3, f13, 0, fVar2.J, 5));
            }
            this.f53554e = width;
            this.f53555f = height;
            if (z10) {
                fVar.f53579w = z11;
            } else {
                fVar.f53580x = z11;
            }
        }
        canvas.save();
        canvas.scale(5.0f, 5.0f);
        float f15 = ceil;
        float f16 = ceil2;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f15, f16, this.f53552b);
        if (z10) {
            canvas.drawColor((fVar.H & 16777215) | (-16777216));
            canvas.save();
            canvas.scale(0.2f, 0.2f);
            float f17 = fVar.d;
            float f18 = bounds.left + f17;
            float f19 = fVar.f21074e;
            float f20 = bounds.top + f19;
            canvas.translate(-f18, -f20);
            fVar.f53575f.e(canvas, f18, f20, bounds.right + f17, bounds.bottom + f19);
            canvas.restore();
            f10 = f15;
            f11 = f16;
            canvas.drawRect(0.0f, 0.0f, f10, f11, paint2);
        } else {
            f10 = f15;
            f11 = f16;
        }
        canvas.drawRect(0.0f, 0.0f, f10, f11, paint);
        canvas.restoreToCount(saveLayer);
        canvas.restore();
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void e(float f10) {
        this.f53552b.setAlpha(Math.round(f10 * 255.0f));
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
    }
}
