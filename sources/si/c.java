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
    public final RenderNode f57492a = w.n();
    public final Paint f57493b = new Paint(1);
    public final f f57494c;

    public c(f fVar) {
        this.f57494c = fVar;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        float f10;
        f fVar = this.f57494c;
        if (!fVar.f57515x && this.f57492a.hasDisplayList()) {
            return;
        }
        int width = rect.width();
        int height = rect.height();
        int i7 = fVar.f57516y;
        if (i7 != 1 && i7 != 4) {
            f10 = width;
        } else {
            f10 = height;
        }
        float f11 = f10;
        g gVar = fVar.G;
        gVar.getClass();
        LinearGradient k10 = f.k(fVar, gVar, f11, 0, fVar.K, 1);
        Paint paint = this.f57493b;
        paint.setShader(k10);
        this.f57492a.setPosition(0, 0, width, height);
        this.f57492a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
        this.f57492a.endRecording();
        paint.setShader(null);
        fVar.f57515x = false;
    }

    @Override
    public final void b() {
        this.f57492a.discardDisplayList();
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f57492a);
    }

    @Override
    public final boolean d() {
        return this.f57492a.hasDisplayList();
    }

    @Override
    public final void e(float f10) {
        this.f57492a.setAlpha(f10);
    }
}
