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
    public final RenderNode f56640e;
    public final RenderNode f56641f;
    public final RenderNode f56642g;
    public final RenderNode h;
    public final RenderNode f56643i;
    public ColorFilter f56644j;
    public int f56645k;
    public int f56646l;
    public int f56647m;
    public int f56648n;
    public int f56649o;
    public int f56650p;
    public float f56653s;
    public float f56654t;
    public int f56655u;
    public int v;
    public int f56656w;
    public int f56657x;
    public final RectF f56637a = new RectF();
    public final Rect f56638b = new Rect();
    public final RectF f56639c = new RectF();
    public final RectF d = new RectF();
    public int f56651q = 1;
    public final RectF f56652r = new RectF();

    public b(int i7) {
        RenderNode renderNode = new RenderNode("cap-" + i7);
        this.f56640e = renderNode;
        renderNode.setUseCompositingLayer(true, null);
        RenderNode renderNode2 = new RenderNode("glass-" + i7);
        this.f56641f = renderNode2;
        renderNode2.setRenderEffect(o0.d());
        this.f56642g = new RenderNode("glass-frosted-" + i7);
        RenderNode renderNode3 = new RenderNode("filtered-" + i7);
        this.h = renderNode3;
        renderNode3.setRenderEffect(RenderEffect.createColorFilterEffect(d.v));
        this.f56643i = new RenderNode("frosted-filtered-" + i7);
    }

    public final RenderNode a(int i7) {
        int c10 = p1.g.c(i7);
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 == 3) {
                        return this.f56643i;
                    }
                    throw new IllegalArgumentException("Unknown source index: ".concat(p5.c.x(i7)));
                }
                return this.f56642g;
            }
            return this.f56641f;
        }
        return this.f56640e;
    }

    public final void b(int i7, int i10, int i11) {
        float max;
        float f10 = 0.0f;
        if (this.f56649o != i7) {
            this.f56649o = i7;
            float N = g0.N(7.0f);
            if (N <= 0.0f) {
                max = 0.0f;
            } else {
                max = Math.max(0.0f, ((((N * 0.57735f) + 0.5f) / i7) - 0.5f) / 0.57735f);
            }
            this.f56653s = max;
            this.f56640e.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        }
        if (this.f56650p != i10) {
            this.f56650p = i10;
            float N2 = g0.N(36.0f);
            if (N2 > 0.0f) {
                f10 = Math.max(0.0f, ((((N2 * 0.57735f) + 0.5f) / i10) - 0.5f) / 0.57735f);
            }
            this.f56654t = f10;
            RenderNode renderNode = this.f56642g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
            RenderNode renderNode2 = this.f56643i;
            float f11 = this.f56654t;
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(f11, f11, tileMode));
        }
        this.f56651q = i11;
    }

    public final void c(ColorMatrixColorFilter colorMatrixColorFilter) {
        if (this.f56644j != colorMatrixColorFilter) {
            this.f56644j = colorMatrixColorFilter;
            RenderNode renderNode = this.h;
            if (colorMatrixColorFilter == null) {
                colorMatrixColorFilter = d.v;
            }
            renderNode.setRenderEffect(RenderEffect.createColorFilterEffect(colorMatrixColorFilter));
        }
    }
}
