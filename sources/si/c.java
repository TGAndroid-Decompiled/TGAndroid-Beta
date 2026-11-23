package si;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import c8.lc;
public final class c extends lc {
    public final RenderNode f57603a = w.n();
    public final Paint f57604b = new Paint(1);
    public final f f57605c;

    public c(f fVar) {
        this.f57605c = fVar;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        float f10;
        f fVar = this.f57605c;
        if (!fVar.f57626x && this.f57603a.hasDisplayList()) {
            return;
        }
        int width = rect.width();
        int height = rect.height();
        int i7 = fVar.f57627y;
        if (i7 != 1 && i7 != 4) {
            f10 = width;
        } else {
            f10 = height;
        }
        float f11 = f10;
        g gVar = fVar.G;
        gVar.getClass();
        LinearGradient k10 = f.k(fVar, gVar, f11, 0, fVar.K, 1);
        Paint paint = this.f57604b;
        paint.setShader(k10);
        this.f57603a.setPosition(0, 0, width, height);
        this.f57603a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
        this.f57603a.endRecording();
        paint.setShader(null);
        fVar.f57626x = false;
    }

    @Override
    public final void b() {
        this.f57603a.discardDisplayList();
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f57603a);
    }

    @Override
    public final boolean d() {
        return this.f57603a.hasDisplayList();
    }

    @Override
    public final void e(float f10) {
        this.f57603a.setAlpha(f10);
    }
}
