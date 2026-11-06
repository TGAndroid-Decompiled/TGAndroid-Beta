package pi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import c8.nb;
import org.telegram.ui.Components.k2;
public final class d extends nb {
    public final RenderNode f53536a = new RenderNode("glass-fade-content");
    public final RenderNode f53537b = new RenderNode("glass-fade-overlay");
    public final Paint f53538c;
    public final Paint d;
    public final Matrix f53539e;
    public LinearGradient f53540f;
    public int f53541g;
    public int h;
    public int f53542i;
    public final f f53543j;

    public d(f fVar) {
        this.f53543j = fVar;
        Paint paint = new Paint();
        this.f53538c = paint;
        this.d = new Paint(1);
        this.f53539e = new Matrix();
        this.f53541g = -1;
        this.h = -1;
        paint.setBlendMode(k2.l());
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
        f fVar = this.f53543j;
        a aVar = fVar.h;
        if (aVar != null && aVar.h() && aVar.f() > 0) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (i7 != 0) {
            i10 = aVar.f();
        } else {
            i10 = 1;
        }
        if (i7 != 0) {
            f10 = f.l(rectF.left, aVar.g(), i10) - (i7 * i10);
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
        boolean z9 = fVar.f53555w;
        Paint paint = this.f53538c;
        if (!z9 && this.f53541g == rect.width() && this.h == rect.height() && this.f53542i == i10) {
            f13 = f11;
            i13 = i7;
            f12 = f10;
            i12 = ceil;
            i11 = ceil2;
        } else {
            int i14 = fVar.f53557y;
            if (i14 != 1 && i14 != 4) {
                height = rect.width();
            } else {
                height = rect.height();
            }
            float f17 = height;
            g gVar = fVar.D;
            gVar.getClass();
            float f18 = 0;
            f12 = f10;
            f13 = f11;
            i11 = ceil2;
            i12 = ceil;
            i13 = i7;
            LinearGradient k10 = f.k(fVar, gVar, f17, f18, -1, i10);
            this.f53540f = k10;
            paint.setShader(k10);
            g gVar2 = fVar.E;
            gVar2.getClass();
            LinearGradient k11 = f.k(fVar, gVar2, f17, f18, fVar.H, i10);
            this.f53537b.setPosition(0, 0, ceil3, ceil4);
            this.f53537b.setPivotX(0.0f);
            this.f53537b.setPivotY(0.0f);
            this.f53537b.setScaleX(f16);
            this.f53537b.setScaleY(f16);
            Paint paint2 = this.d;
            paint2.setShader(k11);
            this.f53537b.beginRecording().drawRect(0.0f, 0.0f, ceil3, ceil4, paint2);
            this.f53537b.endRecording();
            paint2.setShader(null);
            this.f53541g = rect.width();
            this.h = rect.height();
            this.f53542i = i10;
        }
        Matrix matrix = this.f53539e;
        matrix.setTranslate((-f14) / f16, (-f15) / f16);
        this.f53540f.setLocalMatrix(matrix);
        this.f53536a.setPosition(0, 0, i12, i11);
        this.f53536a.setPivotX(0.0f);
        this.f53536a.setPivotY(0.0f);
        this.f53536a.setScaleX(f16);
        this.f53536a.setScaleY(f16);
        this.f53536a.setTranslationX(f14);
        this.f53536a.setTranslationY(f15);
        RecordingCanvas beginRecording = this.f53536a.beginRecording();
        float f19 = i12;
        float f20 = i11;
        beginRecording.saveLayer(0.0f, 0.0f, f19, f20, null);
        beginRecording.drawColor((fVar.H & 16777215) | (-16777216));
        if (i13 != 0) {
            fVar.h.d(f12, f13, i10, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            fVar.f53551f.e(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
            beginRecording.restore();
        }
        beginRecording.drawRect(0.0f, 0.0f, f19, f20, paint);
        beginRecording.restore();
        this.f53536a.endRecording();
        fVar.f53555w = false;
    }

    @Override
    public final void b() {
        this.f53536a.discardDisplayList();
        this.f53537b.discardDisplayList();
        this.f53541g = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f53536a);
        canvas.drawRenderNode(this.f53537b);
    }

    @Override
    public final boolean d() {
        if (this.f53536a.hasDisplayList() && this.f53537b.hasDisplayList()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f10) {
        this.f53536a.setAlpha(f10);
        this.f53537b.setAlpha(f10);
    }
}
