package si;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import c8.kc;
public final class c extends kc {
    public final RenderNode f57527a = w.n();
    public final Paint f57528b = new Paint(1);
    public final f f57529c;

    public c(f fVar) {
        this.f57529c = fVar;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        float f10;
        f fVar = this.f57529c;
        if (!fVar.f57550x && this.f57527a.hasDisplayList()) {
            return;
        }
        int width = rect.width();
        int height = rect.height();
        int i7 = fVar.f57551y;
        if (i7 != 1 && i7 != 4) {
            f10 = width;
        } else {
            f10 = height;
        }
        float f11 = f10;
        g gVar = fVar.G;
        gVar.getClass();
        LinearGradient k10 = f.k(fVar, gVar, f11, 0, fVar.K, 1);
        Paint paint = this.f57528b;
        paint.setShader(k10);
        this.f57527a.setPosition(0, 0, width, height);
        this.f57527a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
        this.f57527a.endRecording();
        paint.setShader(null);
        fVar.f57550x = false;
    }

    @Override
    public final void b() {
        this.f57527a.discardDisplayList();
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f57527a);
    }

    @Override
    public final boolean d() {
        return this.f57527a.hasDisplayList();
    }

    @Override
    public final void e(float f10) {
        this.f57527a.setAlpha(f10);
    }
}
