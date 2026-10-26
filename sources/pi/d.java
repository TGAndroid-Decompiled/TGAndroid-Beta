package pi;

import a8.lf;
import android.graphics.Canvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.support.v4.media.session.x;
import org.telegram.ui.Components.vc0;
public final class d extends lf {
    public final RenderNode f46879a = x.o();
    public final RuntimeShader f46880b = vc0.a();
    public int f46881c = -1;
    public int d = -1;
    public int e;
    public RenderEffect[] f46882f;
    public float[] f46883g;
    public float[] h;
    public final e f46884i;

    public d(e eVar) {
        this.f46884i = eVar;
    }

    @Override
    public final void a(android.graphics.Rect r26, android.graphics.RectF r27) {
        throw new UnsupportedOperationException("Method not decompiled: pi.d.a(android.graphics.Rect, android.graphics.RectF):void");
    }

    @Override
    public final void b() {
        this.f46879a.discardDisplayList();
        this.f46881c = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f46879a);
    }

    @Override
    public final boolean d() {
        return this.f46879a.hasDisplayList();
    }

    @Override
    public final void e(float f7) {
        this.f46879a.setAlpha(f7);
    }
}
