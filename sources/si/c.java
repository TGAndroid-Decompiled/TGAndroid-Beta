package si;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import c8.hc;
public final class c extends hc {
    public final RenderNode f56908a = w.n();
    public final Paint f56909b = new Paint(1);
    public final f f56910c;

    public c(f fVar) {
        this.f56910c = fVar;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        float f10;
        f fVar = this.f56910c;
        if (!fVar.f56931x && this.f56908a.hasDisplayList()) {
            return;
        }
        int width = rect.width();
        int height = rect.height();
        int i7 = fVar.f56932y;
        if (i7 != 1 && i7 != 4) {
            f10 = width;
        } else {
            f10 = height;
        }
        float f11 = f10;
        g gVar = fVar.G;
        gVar.getClass();
        LinearGradient k10 = f.k(fVar, gVar, f11, 0, fVar.K, 1);
        Paint paint = this.f56909b;
        paint.setShader(k10);
        this.f56908a.setPosition(0, 0, width, height);
        this.f56908a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
        this.f56908a.endRecording();
        paint.setShader(null);
        fVar.f56931x = false;
    }

    @Override
    public final void b() {
        this.f56908a.discardDisplayList();
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f56908a);
    }

    @Override
    public final boolean d() {
        return this.f56908a.hasDisplayList();
    }

    @Override
    public final void e(float f10) {
        this.f56908a.setAlpha(f10);
    }
}
