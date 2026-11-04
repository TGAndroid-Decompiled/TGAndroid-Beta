package pi;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import cg.n0;
import org.telegram.messenger.g0;
import org.telegram.ui.Cells.f1;
public final class b {
    public final RenderNode f53538e;
    public final RenderNode f53539f;
    public final RenderNode f53540g;
    public final RenderNode h;
    public final RenderNode f53541i;
    public ColorFilter f53542j;
    public int f53543k;
    public int f53544l;
    public int f53545m;
    public int f53546n;
    public int f53547o;
    public int f53548p;
    public float f53551s;
    public float f53552t;
    public int f53553u;
    public int v;
    public int f53554w;
    public int f53555x;
    public final RectF f53535a = new RectF();
    public final Rect f53536b = new Rect();
    public final RectF f53537c = new RectF();
    public final RectF d = new RectF();
    public int f53549q = 1;
    public final RectF f53550r = new RectF();

    public b(int i3) {
        RenderNode renderNode = new RenderNode("cap-" + i3);
        this.f53538e = renderNode;
        renderNode.setUseCompositingLayer(true, null);
        RenderNode renderNode2 = new RenderNode("glass-" + i3);
        this.f53539f = renderNode2;
        renderNode2.setRenderEffect(n0.d());
        this.f53540g = new RenderNode("glass-frosted-" + i3);
        RenderNode renderNode3 = new RenderNode("filtered-" + i3);
        this.h = renderNode3;
        renderNode3.setRenderEffect(RenderEffect.createColorFilterEffect(d.v));
        this.f53541i = new RenderNode("frosted-filtered-" + i3);
    }

    public final RenderNode a(int i3) {
        int c2 = o1.g.c(i3);
        if (c2 != 0) {
            if (c2 != 1) {
                if (c2 != 2) {
                    if (c2 == 3) {
                        return this.f53541i;
                    }
                    throw new IllegalArgumentException("Unknown source index: ".concat(f1.F(i3)));
                }
                return this.f53540g;
            }
            return this.f53539f;
        }
        return this.f53538e;
    }

    public final void b(int i3, int i10, int i11) {
        float max;
        float f10 = 0.0f;
        if (this.f53547o != i3) {
            this.f53547o = i3;
            float N = g0.N(7.0f);
            if (N <= 0.0f) {
                max = 0.0f;
            } else {
                max = Math.max(0.0f, ((((N * 0.57735f) + 0.5f) / i3) - 0.5f) / 0.57735f);
            }
            this.f53551s = max;
            this.f53538e.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        }
        if (this.f53548p != i10) {
            this.f53548p = i10;
            float N2 = g0.N(36.0f);
            if (N2 > 0.0f) {
                f10 = Math.max(0.0f, ((((N2 * 0.57735f) + 0.5f) / i10) - 0.5f) / 0.57735f);
            }
            this.f53552t = f10;
            RenderNode renderNode = this.f53540g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
            RenderNode renderNode2 = this.f53541i;
            float f11 = this.f53552t;
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(f11, f11, tileMode));
        }
        this.f53549q = i11;
    }

    public final void c(ColorMatrixColorFilter colorMatrixColorFilter) {
        if (this.f53542j != colorMatrixColorFilter) {
            this.f53542j = colorMatrixColorFilter;
            RenderNode renderNode = this.h;
            if (colorMatrixColorFilter == null) {
                colorMatrixColorFilter = d.v;
            }
            renderNode.setRenderEffect(RenderEffect.createColorFilterEffect(colorMatrixColorFilter));
        }
    }
}
