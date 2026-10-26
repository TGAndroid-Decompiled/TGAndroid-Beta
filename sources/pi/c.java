package pi;

import a8.lf;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import org.telegram.ui.Components.qd0;
public final class c extends lf {
    public final RenderNode f46872a = new RenderNode("glass-fade-content");
    public final RenderNode f46873b = new RenderNode("glass-fade-overlay");
    public final Paint f46874c;
    public final Paint d;
    public final Matrix e;
    public LinearGradient f46875f;
    public int f46876g;
    public int h;
    public int f46877i;
    public final e f46878j;

    public c(e eVar) {
        this.f46878j = eVar;
        Paint paint = new Paint();
        this.f46874c = paint;
        this.d = new Paint(1);
        this.e = new Matrix();
        this.f46876g = -1;
        this.h = -1;
        paint.setBlendMode(qd0.a());
    }

    @Override
    public final void a(android.graphics.Rect r29, android.graphics.RectF r30) {
        throw new UnsupportedOperationException("Method not decompiled: pi.c.a(android.graphics.Rect, android.graphics.RectF):void");
    }

    @Override
    public final void b() {
        this.f46872a.discardDisplayList();
        this.f46873b.discardDisplayList();
        this.f46876g = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f46872a);
        canvas.drawRenderNode(this.f46873b);
    }

    @Override
    public final boolean d() {
        if (this.f46872a.hasDisplayList() && this.f46873b.hasDisplayList()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7) {
        this.f46872a.setAlpha(f7);
        this.f46873b.setAlpha(f7);
    }
}
