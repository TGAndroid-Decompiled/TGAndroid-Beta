package qi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import v7.q;
public final class c extends q {
    public final RenderNode f53956b = w.n();
    public final Paint f53957c = new Paint(1);
    public final f d;

    public c(f fVar) {
        this.d = fVar;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        float f10;
        f fVar = this.d;
        if (!fVar.f53978x && this.f53956b.hasDisplayList()) {
            return;
        }
        int width = rect.width();
        int height = rect.height();
        int i3 = fVar.f53979y;
        if (i3 != 1 && i3 != 4) {
            f10 = width;
        } else {
            f10 = height;
        }
        float f11 = f10;
        g gVar = fVar.G;
        gVar.getClass();
        LinearGradient k10 = f.k(fVar, gVar, f11, 0, fVar.K, 1);
        Paint paint = this.f53957c;
        paint.setShader(k10);
        this.f53956b.setPosition(0, 0, width, height);
        this.f53956b.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
        this.f53956b.endRecording();
        paint.setShader(null);
        fVar.f53978x = false;
    }

    @Override
    public final void b() {
        this.f53956b.discardDisplayList();
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f53956b);
    }

    @Override
    public final boolean d() {
        return this.f53956b.hasDisplayList();
    }

    @Override
    public final void e(float f10) {
        this.f53956b.setAlpha(f10);
    }
}
