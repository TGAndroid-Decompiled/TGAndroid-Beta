package si;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import c8.kc;
public final class d extends kc {
    public final RenderNode f57487a = new RenderNode("glass-fade-content");
    public final RenderNode f57488b = new RenderNode("glass-fade-overlay");
    public final Paint f57489c;
    public final Paint d;
    public final Matrix f57490e;
    public LinearGradient f57491f;
    public int f57492g;
    public int h;
    public int f57493i;
    public final f f57494j;

    public d(f fVar) {
        BlendMode blendMode;
        this.f57494j = fVar;
        Paint paint = new Paint();
        this.f57489c = paint;
        this.d = new Paint(1);
        this.f57490e = new Matrix();
        this.f57492g = -1;
        this.h = -1;
        blendMode = BlendMode.DST_IN;
        paint.setBlendMode(blendMode);
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        int i7;
        int i10;
        float f10;
        float f11;
        int height;
        float f12;
        float f13;
        int i11;
        int i12;
        int i13;
        f fVar = this.f57494j;
        a aVar = fVar.h;
        if (aVar != null && aVar.g() && aVar.e() > 0) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (i7 != 0) {
            i10 = aVar.e();
        } else {
            i10 = 1;
        }
        if (i7 != 0) {
            f10 = f.l(rectF.left, aVar.f(), i10) - (i7 * i10);
        } else {
            f10 = rectF.left;
        }
        if (i7 != 0) {
            f11 = f.l(rectF.top, aVar.a(), i10) - (i7 * i10);
        } else {
            f11 = rectF.top;
        }
        float f14 = f10 - rectF.left;
        float f15 = f11 - rectF.top;
        float f16 = i10;
        int ceil = ((int) Math.ceil((rectF.right - f10) / f16)) + i7;
        int ceil2 = ((int) Math.ceil((rectF.bottom - f11) / f16)) + i7;
        int ceil3 = (int) Math.ceil(rect.width() / f16);
        int ceil4 = (int) Math.ceil(rect.height() / f16);
        boolean z10 = fVar.f57506w;
        Paint paint = this.f57489c;
        if (!z10 && this.f57492g == rect.width() && this.h == rect.height() && this.f57493i == i10) {
            f13 = f11;
            i13 = i7;
            f12 = f10;
            i12 = ceil;
            i11 = ceil2;
        } else {
            int i14 = fVar.f57508y;
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
            i13 = i7;
            LinearGradient k10 = f.k(fVar, gVar, f17, f18, -1, i10);
            this.f57491f = k10;
            paint.setShader(k10);
            g gVar2 = fVar.F;
            gVar2.getClass();
            LinearGradient k11 = f.k(fVar, gVar2, f17, f18, fVar.I, i10);
            this.f57488b.setPosition(0, 0, ceil3, ceil4);
            this.f57488b.setPivotX(0.0f);
            this.f57488b.setPivotY(0.0f);
            this.f57488b.setScaleX(f16);
            this.f57488b.setScaleY(f16);
            Paint paint2 = this.d;
            paint2.setShader(k11);
            this.f57488b.beginRecording().drawRect(0.0f, 0.0f, ceil3, ceil4, paint2);
            this.f57488b.endRecording();
            paint2.setShader(null);
            this.f57492g = rect.width();
            this.h = rect.height();
            this.f57493i = i10;
        }
        Matrix matrix = this.f57490e;
        matrix.setTranslate((-f14) / f16, (-f15) / f16);
        this.f57491f.setLocalMatrix(matrix);
        this.f57487a.setPosition(0, 0, i12, i11);
        this.f57487a.setPivotX(0.0f);
        this.f57487a.setPivotY(0.0f);
        this.f57487a.setScaleX(f16);
        this.f57487a.setScaleY(f16);
        this.f57487a.setTranslationX(f14);
        this.f57487a.setTranslationY(f15);
        RecordingCanvas beginRecording = this.f57487a.beginRecording();
        float f19 = i12;
        float f20 = i11;
        beginRecording.saveLayer(0.0f, 0.0f, f19, f20, null);
        beginRecording.drawColor((fVar.I & 16777215) | (-16777216));
        if (i13 != 0) {
            fVar.h.d(f12, f13, i10, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            fVar.f57502f.o(rectF.left, rectF.top, rectF.right, rectF.bottom, beginRecording);
            beginRecording.restore();
        }
        beginRecording.drawRect(0.0f, 0.0f, f19, f20, paint);
        beginRecording.restore();
        this.f57487a.endRecording();
        fVar.f57506w = false;
    }

    @Override
    public final void b() {
        this.f57487a.discardDisplayList();
        this.f57488b.discardDisplayList();
        this.f57492g = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f57487a);
        canvas.drawRenderNode(this.f57488b);
    }

    @Override
    public final boolean d() {
        if (this.f57487a.hasDisplayList() && this.f57488b.hasDisplayList()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f10) {
        this.f57487a.setAlpha(f10);
        this.f57488b.setAlpha(f10);
    }
}
