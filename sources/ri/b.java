package ri;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import bg.n0;
import org.telegram.messenger.g0;
public final class b {
    public final RenderNode f56056e;
    public final RenderNode f56057f;
    public final RenderNode f56058g;
    public final RenderNode h;
    public final RenderNode f56059i;
    public ColorFilter f56060j;
    public int f56061k;
    public int f56062l;
    public int f56063m;
    public int f56064n;
    public int f56065o;
    public int f56066p;
    public float f56069s;
    public float f56070t;
    public int f56071u;
    public int v;
    public int f56072w;
    public int f56073x;
    public final RectF f56053a = new RectF();
    public final Rect f56054b = new Rect();
    public final RectF f56055c = new RectF();
    public final RectF d = new RectF();
    public int f56067q = 1;
    public final RectF f56068r = new RectF();

    public b(int i7) {
        RenderNode renderNode = new RenderNode("cap-" + i7);
        this.f56056e = renderNode;
        renderNode.setUseCompositingLayer(true, null);
        RenderNode renderNode2 = new RenderNode("glass-" + i7);
        this.f56057f = renderNode2;
        renderNode2.setRenderEffect(n0.d());
        this.f56058g = new RenderNode("glass-frosted-" + i7);
        RenderNode renderNode3 = new RenderNode("filtered-" + i7);
        this.h = renderNode3;
        renderNode3.setRenderEffect(RenderEffect.createColorFilterEffect(d.v));
        this.f56059i = new RenderNode("frosted-filtered-" + i7);
    }

    public final RenderNode a(int i7) {
        int c10 = p1.g.c(i7);
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 == 3) {
                        return this.f56059i;
                    }
                    throw new IllegalArgumentException("Unknown source index: ".concat(r.b.w(i7)));
                }
                return this.f56058g;
            }
            return this.f56057f;
        }
        return this.f56056e;
    }

    public final void b(int i7, int i10, int i11) {
        float max;
        float f10 = 0.0f;
        if (this.f56065o != i7) {
            this.f56065o = i7;
            float N = g0.N(7.0f);
            if (N <= 0.0f) {
                max = 0.0f;
            } else {
                max = Math.max(0.0f, ((((N * 0.57735f) + 0.5f) / i7) - 0.5f) / 0.57735f);
            }
            this.f56069s = max;
            this.f56056e.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        }
        if (this.f56066p != i10) {
            this.f56066p = i10;
            float N2 = g0.N(36.0f);
            if (N2 > 0.0f) {
                f10 = Math.max(0.0f, ((((N2 * 0.57735f) + 0.5f) / i10) - 0.5f) / 0.57735f);
            }
            this.f56070t = f10;
            RenderNode renderNode = this.f56058g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
            RenderNode renderNode2 = this.f56059i;
            float f11 = this.f56070t;
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(f11, f11, tileMode));
        }
        this.f56067q = i11;
    }

    public final void c(ColorMatrixColorFilter colorMatrixColorFilter) {
        if (this.f56060j != colorMatrixColorFilter) {
            this.f56060j = colorMatrixColorFilter;
            RenderNode renderNode = this.h;
            if (colorMatrixColorFilter == null) {
                colorMatrixColorFilter = d.v;
            }
            renderNode.setRenderEffect(RenderEffect.createColorFilterEffect(colorMatrixColorFilter));
        }
    }
}
