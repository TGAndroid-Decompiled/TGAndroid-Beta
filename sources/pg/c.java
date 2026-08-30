package pg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import ng.f;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class c extends b {
    public final sg.a E;
    public final Outline F = new Outline();
    public final Rect G = new Rect();
    public final RenderNode H;
    public final RenderNode I;
    public final Paint J;
    public final Paint K;
    public final Paint L;
    public boolean M;
    public f N;

    public c(sg.a aVar) {
        Paint paint = new Paint(1);
        this.J = paint;
        Paint paint2 = new Paint(1);
        this.K = paint2;
        Paint paint3 = new Paint(1);
        this.L = paint3;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.H = renderNode;
        this.I = new RenderNode("BlurredFill");
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        this.E = aVar;
        paint.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint3.setStyle(style);
    }

    @Override
    public final void draw(Canvas canvas) {
        a aVar = this.h;
        if (aVar.f41212m.isEmpty()) {
            return;
        }
        boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
        sg.a aVar2 = this.E;
        if (!isHardwareAccelerated) {
            c(canvas, aVar2);
            return;
        }
        if (!this.H.hasDisplayList()) {
            aVar2.f();
            w();
        } else if (this.M) {
            w();
        }
        this.M = false;
        int l1 = j6.l1(this.H.getAlpha() * this.f41225n, this.d);
        if (Color.alpha(l1) != 0) {
            float f10 = this.f41223l;
            float f11 = this.f41224m;
            Paint paint = this.J;
            paint.setShadowLayer(f10, 0.0f, f11, l1);
            aVar.c(canvas, paint, this.f41222k);
        }
        canvas.save();
        Rect rect = aVar.f41212m;
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.H);
        canvas.restore();
    }

    @Override
    public final sg.a i() {
        return this.E;
    }

    @Override
    public final void j() {
        b();
        a aVar = this.h;
        this.K.setStrokeWidth(aVar.f41208i);
        this.L.setStrokeWidth(aVar.f41209j);
        int width = aVar.f41212m.width();
        int height = aVar.f41212m.height();
        Rect rect = this.G;
        rect.set(0, 0, width, height);
        float[] fArr = aVar.f41204b;
        Outline outline = this.F;
        b.h(outline, rect, fArr);
        outline.setAlpha(1.0f);
        if (!aVar.f41212m.isEmpty()) {
            this.I.setPosition(0, 0, aVar.f41212m.width(), aVar.f41212m.height());
            this.H.setPosition(0, 0, aVar.f41212m.width(), aVar.f41212m.height());
            this.H.setOutline(outline);
            this.M = true;
        }
    }

    @Override
    public final void k() {
        b();
        this.M = true;
    }

    @Override
    public final void l() {
        this.E.f();
    }

    @Override
    public final b m() {
        this.H.setClipToOutline(false);
        return this;
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f41221j;
        this.f41221j = i10;
        this.H.setAlpha(i10 / 255.0f);
        this.M = true;
        if (i11 == 0 && i10 > 0) {
            this.E.f();
        }
    }

    @Override
    public final void u() {
        super.u();
        this.J.setShadowLayer(this.f41223l, 0.0f, this.f41224m, this.d);
        this.K.setColor(this.f41218f);
        this.L.setColor(this.f41219g);
        this.M = true;
    }

    public final boolean v() {
        return this.H.hasDisplayList();
    }

    public final void w() {
        float f10 = this.f41215a;
        float f11 = this.f41216b;
        a aVar = this.h;
        Rect rect = aVar.f41212m;
        Rect rect2 = aVar.f41212m;
        float f12 = rect.left + f10;
        float f13 = rect.top + f11;
        float f14 = rect.right + f10;
        float f15 = rect.bottom + f11;
        RecordingCanvas beginRecording = this.I.beginRecording();
        beginRecording.save();
        beginRecording.translate(-f12, -f13);
        if (this.N != null && Build.VERSION.SDK_INT >= 33) {
            int i10 = aVar.f41206f;
            if (i10 <= 0) {
                i10 = AndroidUtilities.dp(11.0f);
            }
            int max = Math.max(Math.min(i10, Math.min(rect2.width(), rect2.height()) / 5), 1);
            f fVar = this.N;
            float width = rect2.width();
            float height = rect2.height();
            float[] fArr = aVar.f41205c;
            fVar.a(width, height, fArr[0], fArr[2], fArr[4], fArr[6], max, aVar.f41207g, aVar.h, this.e);
        }
        this.E.X(beginRecording, f12, f13, f14, f15);
        beginRecording.save();
        this.I.endRecording();
        RecordingCanvas beginRecording2 = this.H.beginRecording();
        if (Color.alpha(this.e) == 255) {
            beginRecording2.drawColor(this.e);
        } else {
            beginRecording2.drawRenderNode(this.I);
            if (this.N == null && Color.alpha(this.e) != 0) {
                beginRecording2.drawColor(this.e);
            }
        }
        if (this.f41218f != 0) {
            b.e(beginRecording2, rect2.width(), rect2.height(), aVar.f41204b, aVar.f41208i, true, this.K);
        }
        if (this.f41219g != 0) {
            b.e(beginRecording2, rect2.width(), rect2.height(), aVar.f41204b, aVar.f41209j, false, this.L);
        }
        this.H.endRecording();
    }
}
