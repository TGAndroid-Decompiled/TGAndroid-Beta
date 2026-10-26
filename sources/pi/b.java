package pi;

import a8.lf;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.x;
public final class b extends lf {
    public final RenderNode f46869a = x.n();
    public final Paint f46870b = new Paint(1);
    public final e f46871c;

    public b(e eVar) {
        this.f46871c = eVar;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        float f7;
        e eVar = this.f46871c;
        if (!eVar.v && this.f46869a.hasDisplayList()) {
            return;
        }
        int width = rect.width();
        int height = rect.height();
        int i10 = eVar.f46889w;
        if (i10 != 1 && i10 != 4) {
            f7 = width;
        } else {
            f7 = height;
        }
        float f10 = f7;
        f fVar = eVar.E;
        fVar.getClass();
        LinearGradient l4 = e.l(eVar, fVar, f10, 0, eVar.I, 1);
        Paint paint = this.f46870b;
        paint.setShader(l4);
        this.f46869a.setPosition(0, 0, width, height);
        this.f46869a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
        this.f46869a.endRecording();
        paint.setShader(null);
        eVar.v = false;
    }

    @Override
    public final void b() {
        this.f46869a.discardDisplayList();
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f46869a);
    }

    @Override
    public final boolean d() {
        return this.f46869a.hasDisplayList();
    }

    @Override
    public final void e(float f7) {
        this.f46869a.setAlpha(f7);
    }
}
