package si;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import c8.kc;
public final class b extends kc {
    public final boolean f57478a;
    public final Paint f57479b = new Paint();
    public final Paint f57480c;
    public final Paint d;
    public int f57481e;
    public int f57482f;
    public final f f57483g;

    public b(f fVar, boolean z10) {
        this.f57483g = fVar;
        Paint paint = new Paint(1);
        this.f57480c = paint;
        this.d = new Paint(1);
        this.f57481e = -1;
        this.f57482f = -1;
        this.f57478a = z10;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override
    public final void b() {
        this.f57481e = -1;
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
        f fVar2 = this.f57483g;
        Rect bounds = fVar2.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        float f12 = width;
        int ceil = (int) Math.ceil(f12 / 5.0f);
        float f13 = height;
        int ceil2 = (int) Math.ceil(f13 / 5.0f);
        boolean z13 = this.f57478a;
        if (z13) {
            z10 = fVar2.f57506w;
        } else {
            z10 = fVar2.f57507x;
        }
        Paint paint2 = this.f57480c;
        Paint paint3 = this.d;
        if (!z10 && this.f57481e == width && this.f57482f == height) {
            fVar = fVar2;
            paint = paint3;
            z11 = z13;
        } else {
            int i7 = fVar2.f57508y;
            if (i7 != 1 && i7 != 4) {
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
            this.f57481e = width;
            this.f57482f = height;
            if (z11) {
                fVar.f57506w = z12;
            } else {
                fVar.f57507x = z12;
            }
        }
        canvas.save();
        canvas.scale(5.0f, 5.0f);
        float f15 = ceil;
        float f16 = ceil2;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f15, f16, this.f57479b);
        if (z11) {
            canvas.drawColor((fVar.I & 16777215) | (-16777216));
            canvas.save();
            canvas.scale(0.2f, 0.2f);
            float f17 = fVar.d;
            float f18 = bounds.left + f17;
            float f19 = fVar.f56672e;
            float f20 = bounds.top + f19;
            canvas.translate(-f18, -f20);
            fVar.f57502f.o(f18, f20, bounds.right + f17, f19 + bounds.bottom, canvas);
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
        this.f57479b.setAlpha(Math.round(f10 * 255.0f));
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
    }
}
