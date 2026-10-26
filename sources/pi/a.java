package pi;

import a8.lf;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
public final class a extends lf {
    public final boolean f46864a;
    public final Paint f46865b = new Paint();
    public final Paint f46866c;
    public final Paint d;
    public int e;
    public int f46867f;
    public final e f46868g;

    public a(e eVar, boolean z10) {
        this.f46868g = eVar;
        Paint paint = new Paint(1);
        this.f46866c = paint;
        this.d = new Paint(1);
        this.e = -1;
        this.f46867f = -1;
        this.f46864a = z10;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override
    public final void b() {
        this.e = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        boolean z10;
        Paint paint;
        boolean z11;
        boolean z12;
        e eVar;
        float f7;
        float f10;
        e eVar2 = this.f46868g;
        Rect bounds = eVar2.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        float f11 = width;
        int ceil = (int) Math.ceil(f11 / 5.0f);
        float f12 = height;
        int ceil2 = (int) Math.ceil(f12 / 5.0f);
        boolean z13 = this.f46864a;
        if (z13) {
            z10 = eVar2.f46888s;
        } else {
            z10 = eVar2.v;
        }
        Paint paint2 = this.f46866c;
        Paint paint3 = this.d;
        if (!z10 && this.e == width && this.f46867f == height) {
            eVar = eVar2;
            paint = paint3;
            z11 = z13;
        } else {
            int i10 = eVar2.f46889w;
            if (i10 != 1 && i10 != 4) {
                f12 = f11;
            }
            if (z13) {
                f fVar = eVar2.f46890x;
                fVar.getClass();
                float f13 = 0;
                paint = paint3;
                z11 = z13;
                z12 = false;
                paint2.setShader(e.l(eVar2, fVar, f12, f13, -1, 5));
                f fVar2 = eVar2.f46891y;
                fVar2.getClass();
                paint.setShader(e.l(eVar2, fVar2, f12, f13, eVar2.G, 5));
                eVar = eVar2;
            } else {
                paint = paint3;
                z11 = z13;
                z12 = false;
                f fVar3 = eVar2.E;
                fVar3.getClass();
                eVar = eVar2;
                paint.setShader(e.l(eVar2, fVar3, f12, 0, eVar2.I, 5));
            }
            this.e = width;
            this.f46867f = height;
            if (z11) {
                eVar.f46888s = z12;
            } else {
                eVar.v = z12;
            }
        }
        canvas.save();
        canvas.scale(5.0f, 5.0f);
        float f14 = ceil;
        float f15 = ceil2;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f14, f15, this.f46865b);
        if (z11) {
            canvas.drawColor((eVar.G & 16777215) | (-16777216));
            canvas.save();
            canvas.scale(0.2f, 0.2f);
            float f16 = eVar.f19462c;
            float f17 = bounds.left + f16;
            float f18 = eVar.d;
            float f19 = bounds.top + f18;
            canvas.translate(-f17, -f19);
            eVar.e.w(canvas, f17, f19, bounds.right + f16, bounds.bottom + f18);
            canvas.restore();
            f7 = f14;
            f10 = f15;
            canvas.drawRect(0.0f, 0.0f, f7, f10, paint2);
        } else {
            f7 = f14;
            f10 = f15;
        }
        canvas.drawRect(0.0f, 0.0f, f7, f10, paint);
        canvas.restoreToCount(saveLayer);
        canvas.restore();
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void e(float f7) {
        this.f46865b.setAlpha(Math.round(f7 * 255.0f));
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
    }
}
