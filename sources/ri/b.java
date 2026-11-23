package ri;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import bg.o0;
import org.telegram.messenger.g0;
public final class b {
    public final RenderNode f56675e;
    public final RenderNode f56676f;
    public final RenderNode f56677g;
    public final RenderNode h;
    public final RenderNode f56678i;
    public ColorFilter f56679j;
    public int f56680k;
    public int f56681l;
    public int f56682m;
    public int f56683n;
    public int f56684o;
    public int f56685p;
    public float f56688s;
    public float f56689t;
    public int f56690u;
    public int v;
    public int f56691w;
    public int f56692x;
    public final RectF f56672a = new RectF();
    public final Rect f56673b = new Rect();
    public final RectF f56674c = new RectF();
    public final RectF d = new RectF();
    public int f56686q = 1;
    public final RectF f56687r = new RectF();

    public b(int i7) {
        RenderNode renderNode = new RenderNode("cap-" + i7);
        this.f56675e = renderNode;
        renderNode.setUseCompositingLayer(true, null);
        RenderNode renderNode2 = new RenderNode("glass-" + i7);
        this.f56676f = renderNode2;
        renderNode2.setRenderEffect(o0.d());
        this.f56677g = new RenderNode("glass-frosted-" + i7);
        RenderNode renderNode3 = new RenderNode("filtered-" + i7);
        this.h = renderNode3;
        renderNode3.setRenderEffect(RenderEffect.createColorFilterEffect(d.v));
        this.f56678i = new RenderNode("frosted-filtered-" + i7);
    }

    public final RenderNode a(int i7) {
        int c10 = p1.g.c(i7);
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 == 3) {
                        return this.f56678i;
                    }
                    throw new IllegalArgumentException("Unknown source index: ".concat(p5.c.x(i7)));
                }
                return this.f56677g;
            }
            return this.f56676f;
        }
        return this.f56675e;
    }

    public final void b(int i7, int i10, int i11) {
        float max;
        float f10 = 0.0f;
        if (this.f56684o != i7) {
            this.f56684o = i7;
            float N = g0.N(7.0f);
            if (N <= 0.0f) {
                max = 0.0f;
            } else {
                max = Math.max(0.0f, ((((N * 0.57735f) + 0.5f) / i7) - 0.5f) / 0.57735f);
            }
            this.f56688s = max;
            this.f56675e.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        }
        if (this.f56685p != i10) {
            this.f56685p = i10;
            float N2 = g0.N(36.0f);
            if (N2 > 0.0f) {
                f10 = Math.max(0.0f, ((((N2 * 0.57735f) + 0.5f) / i10) - 0.5f) / 0.57735f);
            }
            this.f56689t = f10;
            RenderNode renderNode = this.f56677g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
            RenderNode renderNode2 = this.f56678i;
            float f11 = this.f56689t;
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(f11, f11, tileMode));
        }
        this.f56686q = i11;
    }

    public final void c(ColorMatrixColorFilter colorMatrixColorFilter) {
        if (this.f56679j != colorMatrixColorFilter) {
            this.f56679j = colorMatrixColorFilter;
            RenderNode renderNode = this.h;
            if (colorMatrixColorFilter == null) {
                colorMatrixColorFilter = d.v;
            }
            renderNode.setRenderEffect(RenderEffect.createColorFilterEffect(colorMatrixColorFilter));
        }
    }
}
