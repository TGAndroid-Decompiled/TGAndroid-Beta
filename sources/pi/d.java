package pi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import c8.ob;
import org.telegram.ui.Components.k2;
public final class d extends ob {
    public final RenderNode f53653a = new RenderNode("glass-fade-content");
    public final RenderNode f53654b = new RenderNode("glass-fade-overlay");
    public final Paint f53655c;
    public final Paint d;
    public final Matrix f53656e;
    public LinearGradient f53657f;
    public int f53658g;
    public int h;
    public int f53659i;
    public final f f53660j;

    public d(f fVar) {
        this.f53660j = fVar;
        Paint paint = new Paint();
        this.f53655c = paint;
        this.d = new Paint(1);
        this.f53656e = new Matrix();
        this.f53658g = -1;
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
        f fVar = this.f53660j;
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
        boolean z9 = fVar.f53672w;
        Paint paint = this.f53655c;
        if (!z9 && this.f53658g == rect.width() && this.h == rect.height() && this.f53659i == i10) {
            f13 = f11;
            i13 = i7;
            f12 = f10;
            i12 = ceil;
            i11 = ceil2;
        } else {
            int i14 = fVar.f53674y;
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
            this.f53657f = k10;
            paint.setShader(k10);
            g gVar2 = fVar.E;
            gVar2.getClass();
            LinearGradient k11 = f.k(fVar, gVar2, f17, f18, fVar.H, i10);
            this.f53654b.setPosition(0, 0, ceil3, ceil4);
            this.f53654b.setPivotX(0.0f);
            this.f53654b.setPivotY(0.0f);
            this.f53654b.setScaleX(f16);
            this.f53654b.setScaleY(f16);
            Paint paint2 = this.d;
            paint2.setShader(k11);
            this.f53654b.beginRecording().drawRect(0.0f, 0.0f, ceil3, ceil4, paint2);
            this.f53654b.endRecording();
            paint2.setShader(null);
            this.f53658g = rect.width();
            this.h = rect.height();
            this.f53659i = i10;
        }
        Matrix matrix = this.f53656e;
        matrix.setTranslate((-f14) / f16, (-f15) / f16);
        this.f53657f.setLocalMatrix(matrix);
        this.f53653a.setPosition(0, 0, i12, i11);
        this.f53653a.setPivotX(0.0f);
        this.f53653a.setPivotY(0.0f);
        this.f53653a.setScaleX(f16);
        this.f53653a.setScaleY(f16);
        this.f53653a.setTranslationX(f14);
        this.f53653a.setTranslationY(f15);
        RecordingCanvas beginRecording = this.f53653a.beginRecording();
        float f19 = i12;
        float f20 = i11;
        beginRecording.saveLayer(0.0f, 0.0f, f19, f20, null);
        beginRecording.drawColor((fVar.H & 16777215) | (-16777216));
        if (i13 != 0) {
            fVar.h.d(f12, f13, i10, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            fVar.f53668f.e(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
            beginRecording.restore();
        }
        beginRecording.drawRect(0.0f, 0.0f, f19, f20, paint);
        beginRecording.restore();
        this.f53653a.endRecording();
        fVar.f53672w = false;
    }

    @Override
    public final void b() {
        this.f53653a.discardDisplayList();
        this.f53654b.discardDisplayList();
        this.f53658g = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f53653a);
        canvas.drawRenderNode(this.f53654b);
    }

    @Override
    public final boolean d() {
        if (this.f53653a.hasDisplayList() && this.f53654b.hasDisplayList()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f10) {
        this.f53653a.setAlpha(f10);
        this.f53654b.setAlpha(f10);
    }
}
