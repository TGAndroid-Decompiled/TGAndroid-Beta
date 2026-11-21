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
    public final RenderNode f57523a = w.n();
    public final Paint f57524b = new Paint(1);
    public final f f57525c;

    public c(f fVar) {
        this.f57525c = fVar;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        float f10;
        f fVar = this.f57525c;
        if (!fVar.f57546x && this.f57523a.hasDisplayList()) {
            return;
        }
        int width = rect.width();
        int height = rect.height();
        int i7 = fVar.f57547y;
        if (i7 != 1 && i7 != 4) {
            f10 = width;
        } else {
            f10 = height;
        }
        float f11 = f10;
        g gVar = fVar.G;
        gVar.getClass();
        LinearGradient k10 = f.k(fVar, gVar, f11, 0, fVar.K, 1);
        Paint paint = this.f57524b;
        paint.setShader(k10);
        this.f57523a.setPosition(0, 0, width, height);
        this.f57523a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
        this.f57523a.endRecording();
        paint.setShader(null);
        fVar.f57546x = false;
    }

    @Override
    public final void b() {
        this.f57523a.discardDisplayList();
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f57523a);
    }

    @Override
    public final boolean d() {
        return this.f57523a.hasDisplayList();
    }

    @Override
    public final void e(float f10) {
        this.f57523a.setAlpha(f10);
    }
}
