package pi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import c8.ob;
public final class c extends ob {
    public final RenderNode f53663a = w.n();
    public final Paint f53664b = new Paint(1);
    public final f f53665c;

    public c(f fVar) {
        this.f53665c = fVar;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        float f10;
        f fVar = this.f53665c;
        if (!fVar.f53686x && this.f53663a.hasDisplayList()) {
            return;
        }
        int width = rect.width();
        int height = rect.height();
        int i7 = fVar.f53687y;
        if (i7 != 1 && i7 != 4) {
            f10 = width;
        } else {
            f10 = height;
        }
        float f11 = f10;
        g gVar = fVar.F;
        gVar.getClass();
        LinearGradient k10 = f.k(fVar, gVar, f11, 0, fVar.J, 1);
        Paint paint = this.f53664b;
        paint.setShader(k10);
        this.f53663a.setPosition(0, 0, width, height);
        this.f53663a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
        this.f53663a.endRecording();
        paint.setShader(null);
        fVar.f53686x = false;
    }

    @Override
    public final void b() {
        this.f53663a.discardDisplayList();
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f53663a);
    }

    @Override
    public final boolean d() {
        return this.f53663a.hasDisplayList();
    }

    @Override
    public final void e(float f10) {
        this.f53663a.setAlpha(f10);
    }
}
