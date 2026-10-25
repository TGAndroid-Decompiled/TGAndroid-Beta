package pi;

import a8.lf;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import org.telegram.ui.Components.qd0;
public final class c extends lf {
    public final RenderNode f46869a = new RenderNode("glass-fade-content");
    public final RenderNode f46870b = new RenderNode("glass-fade-overlay");
    public final Paint f46871c;
    public final Paint d;
    public final Matrix e;
    public LinearGradient f46872f;
    public int f46873g;
    public int h;
    public int f46874i;
    public final e f46875j;

    public c(e eVar) {
        this.f46875j = eVar;
        Paint paint = new Paint();
        this.f46871c = paint;
        this.d = new Paint(1);
        this.e = new Matrix();
        this.f46873g = -1;
        this.h = -1;
        paint.setBlendMode(qd0.a());
    }

    @Override
    public final void a(android.graphics.Rect r29, android.graphics.RectF r30) {
        throw new UnsupportedOperationException("Method not decompiled: pi.c.a(android.graphics.Rect, android.graphics.RectF):void");
    }

    @Override
    public final void b() {
        this.f46869a.discardDisplayList();
        this.f46870b.discardDisplayList();
        this.f46873g = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f46869a);
        canvas.drawRenderNode(this.f46870b);
    }

    @Override
    public final boolean d() {
        if (this.f46869a.hasDisplayList() && this.f46870b.hasDisplayList()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7) {
        this.f46869a.setAlpha(f7);
        this.f46870b.setAlpha(f7);
    }
}
