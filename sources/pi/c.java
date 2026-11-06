package pi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import c8.nb;
public final class c extends nb {
    public final RenderNode f53558a = w.n();
    public final Paint f53559b = new Paint(1);
    public final f f53560c;

    public c(f fVar) {
        this.f53560c = fVar;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        float f10;
        f fVar = this.f53560c;
        if (!fVar.f53581x && this.f53558a.hasDisplayList()) {
            return;
        }
        int width = rect.width();
        int height = rect.height();
        int i7 = fVar.f53582y;
        if (i7 != 1 && i7 != 4) {
            f10 = width;
        } else {
            f10 = height;
        }
        float f11 = f10;
        g gVar = fVar.F;
        gVar.getClass();
        LinearGradient k10 = f.k(fVar, gVar, f11, 0, fVar.J, 1);
        Paint paint = this.f53559b;
        paint.setShader(k10);
        this.f53558a.setPosition(0, 0, width, height);
        this.f53558a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
        this.f53558a.endRecording();
        paint.setShader(null);
        fVar.f53581x = false;
    }

    @Override
    public final void b() {
        this.f53558a.discardDisplayList();
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f53558a);
    }

    @Override
    public final boolean d() {
        return this.f53558a.hasDisplayList();
    }

    @Override
    public final void e(float f10) {
        this.f53558a.setAlpha(f10);
    }
}
