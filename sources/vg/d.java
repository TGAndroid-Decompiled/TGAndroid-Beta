package vg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.t6;
import w7.k8;
public final class d extends k8 {
    public final float f50838a = i0.N(0.55f);
    public final Outline f50839b = new Outline();
    public final Rect f50840c = new Rect();
    public final RenderNode d;
    public final RenderNode e;
    public final Paint f50841f;
    public tg.g f50842g;
    public boolean h;
    public final RectF f50843i;
    public final f f50844j;

    public d(f fVar) {
        this.f50844j = fVar;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.d = renderNode;
        this.e = new RenderNode("BlurredFill");
        Paint paint = new Paint(1);
        this.f50841f = paint;
        this.h = true;
        this.f50843i = new RectF();
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        paint.setColor(0);
    }

    @Override
    public final void a() {
        this.d.discardDisplayList();
        this.e.discardDisplayList();
        this.h = true;
    }

    @Override
    public final void b(Canvas canvas, hi.a aVar) {
        f fVar = this.f50844j;
        e eVar = fVar.P;
        if (!this.d.hasDisplayList() || this.h) {
            e();
        }
        int r12 = t6.r1(this.d.getAlpha() * fVar.U, fVar.f50866x);
        int alpha = Color.alpha(r12);
        Paint paint = this.f50841f;
        if (alpha != 0) {
            paint.setShadowLayer(fVar.S, 0.0f, fVar.T, r12);
            eVar.c(canvas, paint, fVar.R);
        }
        int r13 = t6.r1(this.d.getAlpha() * fVar.U, fVar.F);
        if (Color.alpha(r13) != 0) {
            paint.setShadowLayer(this.f50838a, 0.0f, 0.0f, r13);
            eVar.c(canvas, paint, fVar.R);
        }
        Rect rect = eVar.f50854m;
        canvas.save();
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.d);
        canvas.restore();
    }

    public final boolean c() {
        return this.d.hasDisplayList();
    }

    public final void d() {
        f fVar = this.f50844j;
        Rect rect = fVar.P.f50854m;
        int width = rect.width();
        int height = rect.height();
        Rect rect2 = this.f50840c;
        rect2.set(0, 0, width, height);
        float[] fArr = fVar.P.f50846b;
        Outline outline = this.f50839b;
        f.l(outline, rect2, fArr);
        outline.setAlpha(1.0f);
        if (!rect.isEmpty()) {
            this.e.setPosition(0, 0, rect.width(), rect.height());
            this.d.setPosition(0, 0, rect.width(), rect.height());
            this.d.setOutline(outline);
            this.h = true;
        }
    }

    public final void e() {
        throw new UnsupportedOperationException("Method not decompiled: vg.d.e():void");
    }

    public final void f(float f7) {
        this.d.setAlpha(f7);
    }

    public final void g(boolean z10) {
        this.d.setClipToOutline(z10);
    }

    public final void h(boolean z10) {
        boolean z11;
        if (this.f50842g != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11 && Build.VERSION.SDK_INT >= 33) {
            if (z10) {
                this.f50842g = new tg.g(this.e);
            } else {
                this.f50842g = null;
                this.e.setRenderEffect(null);
            }
            this.h = true;
        }
    }
}
