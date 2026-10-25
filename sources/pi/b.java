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
    public final RenderNode f46866a = x.n();
    public final Paint f46867b = new Paint(1);
    public final e f46868c;

    public b(e eVar) {
        this.f46868c = eVar;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        float f7;
        e eVar = this.f46868c;
        if (!eVar.v && this.f46866a.hasDisplayList()) {
            return;
        }
        int width = rect.width();
        int height = rect.height();
        int i10 = eVar.f46886w;
        if (i10 != 1 && i10 != 4) {
            f7 = width;
        } else {
            f7 = height;
        }
        float f10 = f7;
        f fVar = eVar.E;
        fVar.getClass();
        LinearGradient l4 = e.l(eVar, fVar, f10, 0, eVar.I, 1);
        Paint paint = this.f46867b;
        paint.setShader(l4);
        this.f46866a.setPosition(0, 0, width, height);
        this.f46866a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
        this.f46866a.endRecording();
        paint.setShader(null);
        eVar.v = false;
    }

    @Override
    public final void b() {
        this.f46866a.discardDisplayList();
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f46866a);
    }

    @Override
    public final boolean d() {
        return this.f46866a.hasDisplayList();
    }

    @Override
    public final void e(float f7) {
        this.f46866a.setAlpha(f7);
    }
}
