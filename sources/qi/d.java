package qi;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import v7.q;
public final class d extends q {
    public final RenderNode f53958b = new RenderNode("glass-fade-content");
    public final RenderNode f53959c = new RenderNode("glass-fade-overlay");
    public final Paint d;
    public final Paint f53960e;
    public final Matrix f53961f;
    public LinearGradient f53962g;
    public int h;
    public int f53963i;
    public int f53964j;
    public final f f53965k;

    public d(f fVar) {
        BlendMode blendMode;
        this.f53965k = fVar;
        Paint paint = new Paint();
        this.d = paint;
        this.f53960e = new Paint(1);
        this.f53961f = new Matrix();
        this.h = -1;
        this.f53963i = -1;
        blendMode = BlendMode.DST_IN;
        paint.setBlendMode(blendMode);
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        int i3;
        int i10;
        float f10;
        float f11;
        int height;
        float f12;
        float f13;
        int i11;
        int i12;
        int i13;
        f fVar = this.f53965k;
        a aVar = fVar.h;
        if (aVar != null && aVar.g() && aVar.e() > 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i3 != 0) {
            i10 = aVar.e();
        } else {
            i10 = 1;
        }
        if (i3 != 0) {
            f10 = f.l(rectF.left, aVar.f(), i10) - (i3 * i10);
        } else {
            f10 = rectF.left;
        }
        if (i3 != 0) {
            f11 = f.l(rectF.top, aVar.a(), i10) - (i3 * i10);
        } else {
            f11 = rectF.top;
        }
        float f14 = f10 - rectF.left;
        float f15 = f11 - rectF.top;
        float f16 = i10;
        int ceil = ((int) Math.ceil((rectF.right - f10) / f16)) + i3;
        int ceil2 = ((int) Math.ceil((rectF.bottom - f11) / f16)) + i3;
        int ceil3 = (int) Math.ceil(rect.width() / f16);
        int ceil4 = (int) Math.ceil(rect.height() / f16);
        boolean z10 = fVar.f53977w;
        Paint paint = this.d;
        if (!z10 && this.h == rect.width() && this.f53963i == rect.height() && this.f53964j == i10) {
            f13 = f11;
            i13 = i3;
            f12 = f10;
            i12 = ceil;
            i11 = ceil2;
        } else {
            int i14 = fVar.f53979y;
            if (i14 != 1 && i14 != 4) {
                height = rect.width();
            } else {
                height = rect.height();
            }
            float f17 = height;
            g gVar = fVar.E;
            gVar.getClass();
            float f18 = 0;
            f12 = f10;
            f13 = f11;
            i11 = ceil2;
            i12 = ceil;
            i13 = i3;
            LinearGradient k10 = f.k(fVar, gVar, f17, f18, -1, i10);
            this.f53962g = k10;
            paint.setShader(k10);
            g gVar2 = fVar.F;
            gVar2.getClass();
            LinearGradient k11 = f.k(fVar, gVar2, f17, f18, fVar.I, i10);
            this.f53959c.setPosition(0, 0, ceil3, ceil4);
            this.f53959c.setPivotX(0.0f);
            this.f53959c.setPivotY(0.0f);
            this.f53959c.setScaleX(f16);
            this.f53959c.setScaleY(f16);
            Paint paint2 = this.f53960e;
            paint2.setShader(k11);
            this.f53959c.beginRecording().drawRect(0.0f, 0.0f, ceil3, ceil4, paint2);
            this.f53959c.endRecording();
            paint2.setShader(null);
            this.h = rect.width();
            this.f53963i = rect.height();
            this.f53964j = i10;
        }
        Matrix matrix = this.f53961f;
        matrix.setTranslate((-f14) / f16, (-f15) / f16);
        this.f53962g.setLocalMatrix(matrix);
        this.f53958b.setPosition(0, 0, i12, i11);
        this.f53958b.setPivotX(0.0f);
        this.f53958b.setPivotY(0.0f);
        this.f53958b.setScaleX(f16);
        this.f53958b.setScaleY(f16);
        this.f53958b.setTranslationX(f14);
        this.f53958b.setTranslationY(f15);
        RecordingCanvas beginRecording = this.f53958b.beginRecording();
        float f19 = i12;
        float f20 = i11;
        beginRecording.saveLayer(0.0f, 0.0f, f19, f20, null);
        beginRecording.drawColor((fVar.I & 16777215) | (-16777216));
        if (i13 != 0) {
            fVar.h.c(f12, f13, i10, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            fVar.f53973f.l(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
            beginRecording.restore();
        }
        beginRecording.drawRect(0.0f, 0.0f, f19, f20, paint);
        beginRecording.restore();
        this.f53958b.endRecording();
        fVar.f53977w = false;
    }

    @Override
    public final void b() {
        this.f53958b.discardDisplayList();
        this.f53959c.discardDisplayList();
        this.h = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f53958b);
        canvas.drawRenderNode(this.f53959c);
    }

    @Override
    public final boolean d() {
        if (this.f53958b.hasDisplayList() && this.f53959c.hasDisplayList()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f10) {
        this.f53958b.setAlpha(f10);
        this.f53959c.setAlpha(f10);
    }
}
