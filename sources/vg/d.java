package vg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.t6;
import w7.k8;
public final class d extends k8 {
    public final float f50824a = i0.N(0.55f);
    public final Outline f50825b = new Outline();
    public final Rect f50826c = new Rect();
    public final RenderNode d;
    public final RenderNode e;
    public final Paint f50827f;
    public tg.g f50828g;
    public boolean h;
    public final f f50829i;

    public d(f fVar) {
        this.f50829i = fVar;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.d = renderNode;
        this.e = new RenderNode("BlurredFill");
        Paint paint = new Paint(1);
        this.f50827f = paint;
        this.h = true;
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
        f fVar = this.f50829i;
        e eVar = fVar.M;
        if (!this.d.hasDisplayList() || this.h) {
            e();
        }
        int r12 = t6.r1(this.d.getAlpha() * fVar.R, fVar.f50845r);
        int alpha = Color.alpha(r12);
        Paint paint = this.f50827f;
        if (alpha != 0) {
            paint.setShadowLayer(fVar.P, 0.0f, fVar.Q, r12);
            eVar.c(canvas, paint, fVar.O);
        }
        int r13 = t6.r1(this.d.getAlpha() * fVar.R, fVar.f50849y);
        if (Color.alpha(r13) != 0) {
            paint.setShadowLayer(this.f50824a, 0.0f, 0.0f, r13);
            eVar.c(canvas, paint, fVar.O);
        }
        Rect rect = eVar.f50839m;
        canvas.save();
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.d);
        canvas.restore();
    }

    public final boolean c() {
        return this.d.hasDisplayList();
    }

    public final void d() {
        f fVar = this.f50829i;
        Rect rect = fVar.M.f50839m;
        int width = rect.width();
        int height = rect.height();
        Rect rect2 = this.f50826c;
        rect2.set(0, 0, width, height);
        float[] fArr = fVar.M.f50831b;
        Outline outline = this.f50825b;
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
        this.h = false;
        f fVar = this.f50829i;
        e eVar = fVar.M;
        Rect rect = eVar.f50839m;
        float f7 = fVar.d;
        float f10 = rect.left + f7;
        float f11 = fVar.e;
        float f12 = rect.top + f11;
        float f13 = rect.right + f7;
        float f14 = rect.bottom + f11;
        RecordingCanvas beginRecording = this.e.beginRecording();
        beginRecording.save();
        beginRecording.translate(-f10, -f12);
        if (this.f50828g != null && Build.VERSION.SDK_INT >= 33) {
            int i10 = eVar.f50833f;
            if (i10 <= 0) {
                i10 = i0.L(11.0f);
            }
            int max = Math.max(Math.min(i10, Math.min(rect.width(), rect.height()) / 5), 1);
            float height = rect.height();
            float[] fArr = eVar.f50832c;
            this.f50828g.a(rect.width(), height, fArr[0], fArr[2], fArr[4], fArr[6], max, eVar.f50834g, eVar.h, fVar.f50846s);
        }
        fVar.f50843f.e(beginRecording, f10, f12, f13, f14);
        beginRecording.restore();
        this.e.endRecording();
        RecordingCanvas beginRecording2 = this.d.beginRecording();
        if (Color.alpha(fVar.f50846s) == 255) {
            beginRecording2.drawColor(fVar.f50846s);
        } else {
            beginRecording2.drawRenderNode(this.e);
            if (this.f50828g == null && Color.alpha(fVar.f50846s) != 0) {
                beginRecording2.drawColor(fVar.f50846s);
            }
        }
        this.d.endRecording();
    }

    public final void f(float f7) {
        this.d.setAlpha(f7);
    }

    public final void g(boolean z10) {
        this.d.setClipToOutline(z10);
    }

    public final void h(boolean z10) {
        boolean z11;
        if (this.f50828g != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11 && Build.VERSION.SDK_INT >= 33) {
            if (z10) {
                this.f50828g = new tg.g(this.e);
            } else {
                this.f50828g = null;
                this.e.setRenderEffect(null);
            }
            this.h = true;
        }
    }
}
