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
    public final RenderNode f56753e;
    public final RenderNode f56754f;
    public final RenderNode f56755g;
    public final RenderNode h;
    public final RenderNode f56756i;
    public ColorFilter f56757j;
    public int f56758k;
    public int f56759l;
    public int f56760m;
    public int f56761n;
    public int f56762o;
    public int f56763p;
    public float f56766s;
    public float f56767t;
    public int f56768u;
    public int v;
    public int f56769w;
    public int f56770x;
    public final RectF f56750a = new RectF();
    public final Rect f56751b = new Rect();
    public final RectF f56752c = new RectF();
    public final RectF d = new RectF();
    public int f56764q = 1;
    public final RectF f56765r = new RectF();

    public b(int i7) {
        RenderNode renderNode = new RenderNode("cap-" + i7);
        this.f56753e = renderNode;
        renderNode.setUseCompositingLayer(true, null);
        RenderNode renderNode2 = new RenderNode("glass-" + i7);
        this.f56754f = renderNode2;
        renderNode2.setRenderEffect(o0.d());
        this.f56755g = new RenderNode("glass-frosted-" + i7);
        RenderNode renderNode3 = new RenderNode("filtered-" + i7);
        this.h = renderNode3;
        renderNode3.setRenderEffect(RenderEffect.createColorFilterEffect(d.v));
        this.f56756i = new RenderNode("frosted-filtered-" + i7);
    }

    public final RenderNode a(int i7) {
        int c10 = p1.g.c(i7);
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 == 3) {
                        return this.f56756i;
                    }
                    throw new IllegalArgumentException("Unknown source index: ".concat(p5.c.x(i7)));
                }
                return this.f56755g;
            }
            return this.f56754f;
        }
        return this.f56753e;
    }

    public final void b(int i7, int i10, int i11) {
        float max;
        float f10 = 0.0f;
        if (this.f56762o != i7) {
            this.f56762o = i7;
            float N = g0.N(7.0f);
            if (N <= 0.0f) {
                max = 0.0f;
            } else {
                max = Math.max(0.0f, ((((N * 0.57735f) + 0.5f) / i7) - 0.5f) / 0.57735f);
            }
            this.f56766s = max;
            this.f56753e.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        }
        if (this.f56763p != i10) {
            this.f56763p = i10;
            float N2 = g0.N(36.0f);
            if (N2 > 0.0f) {
                f10 = Math.max(0.0f, ((((N2 * 0.57735f) + 0.5f) / i10) - 0.5f) / 0.57735f);
            }
            this.f56767t = f10;
            RenderNode renderNode = this.f56755g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
            RenderNode renderNode2 = this.f56756i;
            float f11 = this.f56767t;
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(f11, f11, tileMode));
        }
        this.f56764q = i11;
    }

    public final void c(ColorMatrixColorFilter colorMatrixColorFilter) {
        if (this.f56757j != colorMatrixColorFilter) {
            this.f56757j = colorMatrixColorFilter;
            RenderNode renderNode = this.h;
            if (colorMatrixColorFilter == null) {
                colorMatrixColorFilter = d.v;
            }
            renderNode.setRenderEffect(RenderEffect.createColorFilterEffect(colorMatrixColorFilter));
        }
    }
}
