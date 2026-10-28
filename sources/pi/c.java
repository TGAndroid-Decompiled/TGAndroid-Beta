package pi;

import a8.lf;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import org.telegram.ui.Components.rd0;
public final class c extends lf {
    public final RenderNode f46907a = new RenderNode("glass-fade-content");
    public final RenderNode f46908b = new RenderNode("glass-fade-overlay");
    public final Paint f46909c;
    public final Paint d;
    public final Matrix e;
    public LinearGradient f46910f;
    public int f46911g;
    public int h;
    public int f46912i;
    public final e f46913j;

    public c(e eVar) {
        this.f46913j = eVar;
        Paint paint = new Paint();
        this.f46909c = paint;
        this.d = new Paint(1);
        this.e = new Matrix();
        this.f46911g = -1;
        this.h = -1;
        paint.setBlendMode(rd0.a());
    }

    @Override
    public final void a(android.graphics.Rect r29, android.graphics.RectF r30) {
        throw new UnsupportedOperationException("Method not decompiled: pi.c.a(android.graphics.Rect, android.graphics.RectF):void");
    }

    @Override
    public final void b() {
        this.f46907a.discardDisplayList();
        this.f46908b.discardDisplayList();
        this.f46911g = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f46907a);
        canvas.drawRenderNode(this.f46908b);
    }

    @Override
    public final boolean d() {
        if (this.f46907a.hasDisplayList() && this.f46908b.hasDisplayList()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7) {
        this.f46907a.setAlpha(f7);
        this.f46908b.setAlpha(f7);
    }
}
