package qi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import v7.q;
public final class b extends q {
    public final boolean f53951b;
    public final Paint f53952c = new Paint();
    public final Paint d;
    public final Paint f53953e;
    public int f53954f;
    public int f53955g;
    public final f h;

    public b(f fVar, boolean z10) {
        this.h = fVar;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f53953e = new Paint(1);
        this.f53954f = -1;
        this.f53955g = -1;
        this.f53951b = z10;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override
    public final void b() {
        this.f53954f = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        boolean z10;
        Paint paint;
        boolean z11;
        boolean z12;
        f fVar;
        float f10;
        float f11;
        f fVar2 = this.h;
        Rect bounds = fVar2.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        float f12 = width;
        int ceil = (int) Math.ceil(f12 / 5.0f);
        float f13 = height;
        int ceil2 = (int) Math.ceil(f13 / 5.0f);
        boolean z13 = this.f53951b;
        if (z13) {
            z10 = fVar2.f53977w;
        } else {
            z10 = fVar2.f53978x;
        }
        Paint paint2 = this.d;
        Paint paint3 = this.f53953e;
        if (!z10 && this.f53954f == width && this.f53955g == height) {
            fVar = fVar2;
            paint = paint3;
            z11 = z13;
        } else {
            int i3 = fVar2.f53979y;
            if (i3 != 1 && i3 != 4) {
                f13 = f12;
            }
            if (z13) {
                g gVar = fVar2.E;
                gVar.getClass();
                float f14 = 0;
                paint = paint3;
                z11 = z13;
                z12 = false;
                paint2.setShader(f.k(fVar2, gVar, f13, f14, -1, 5));
                g gVar2 = fVar2.F;
                gVar2.getClass();
                paint.setShader(f.k(fVar2, gVar2, f13, f14, fVar2.I, 5));
                fVar = fVar2;
            } else {
                paint = paint3;
                z11 = z13;
                z12 = false;
                g gVar3 = fVar2.G;
                gVar3.getClass();
                fVar = fVar2;
                paint.setShader(f.k(fVar2, gVar3, f13, 0, fVar2.K, 5));
            }
            this.f53954f = width;
            this.f53955g = height;
            if (z11) {
                fVar.f53977w = z12;
            } else {
                fVar.f53978x = z12;
            }
        }
        canvas.save();
        canvas.scale(5.0f, 5.0f);
        float f15 = ceil;
        float f16 = ceil2;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f15, f16, this.f53952c);
        if (z11) {
            canvas.drawColor((fVar.I & 16777215) | (-16777216));
            canvas.save();
            canvas.scale(0.2f, 0.2f);
            float f17 = fVar.d;
            float f18 = bounds.left + f17;
            float f19 = fVar.f53580e;
            float f20 = bounds.top + f19;
            canvas.translate(-f18, -f20);
            fVar.f53973f.l(canvas, f18, f20, bounds.right + f17, bounds.bottom + f19);
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
        this.f53952c.setAlpha(Math.round(f10 * 255.0f));
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
    }
}
