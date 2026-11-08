package pi;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.support.v4.media.session.w;
import c8.ob;
import java.util.Arrays;
import org.telegram.ui.Components.ra0;
public final class e extends ob {
    public final RenderNode f53662a = w.o();
    public final RuntimeShader f53663b = ra0.a();
    public int f53664c = -1;
    public int d = -1;
    public int f53665e;
    public RenderEffect[] f53666f;
    public float[] f53667g;
    public float[] h;
    public final f f53668i;

    public e(f fVar) {
        this.f53668i = fVar;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        int i7;
        int i10;
        float f10;
        float f11;
        int height;
        float f12;
        a aVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int a10;
        int a11;
        int g10;
        int g11;
        f fVar = this.f53668i;
        a aVar2 = fVar.h;
        if (aVar2 != null && aVar2.h() && aVar2.f() > 0) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (i7 != 0) {
            i10 = aVar2.f();
        } else {
            i10 = 1;
        }
        if (i7 != 0) {
            f10 = f.l(rectF.left, aVar2.g(), i10) - (i7 * i10);
        } else {
            f10 = rectF.left;
        }
        if (i7 != 0) {
            f11 = f.l(rectF.top, aVar2.a(), i10) - (i7 * i10);
        } else {
            f11 = rectF.top;
        }
        float f13 = f10 - rectF.left;
        float f14 = f11 - rectF.top;
        float f15 = i10;
        int ceil = ((int) Math.ceil((rectF.right - f10) / f15)) + i7;
        int ceil2 = ((int) Math.ceil((rectF.bottom - f11) / f15)) + i7;
        if (!fVar.f53673w && this.f53664c == rect.width() && this.d == rect.height() && this.f53665e == i10) {
            aVar = aVar2;
            i12 = i7;
            i11 = ceil;
            f12 = f15;
            i13 = ceil2;
        } else {
            int i16 = fVar.f53675y;
            if (i16 != 1 && i16 != 4) {
                height = rect.width();
            } else {
                height = rect.height();
            }
            float f16 = height;
            RuntimeShader runtimeShader = this.f53663b;
            g gVar = fVar.D;
            gVar.getClass();
            float f17 = 0;
            f12 = f15;
            aVar = aVar2;
            i11 = ceil;
            i12 = i7;
            i13 = ceil2;
            runtimeShader.setInputShader("alphaMask", f.k(fVar, gVar, f16, f17, -1, i10));
            RuntimeShader runtimeShader2 = this.f53663b;
            g gVar2 = fVar.E;
            gVar2.getClass();
            runtimeShader2.setInputShader("overlay", f.k(fVar, gVar2, f16, f17, fVar.H, i10));
            this.f53663b.setFloatUniform("background_color_premultiplied", Color.red(fVar.H) / 255.0f, Color.green(fVar.H) / 255.0f, Color.blue(fVar.H) / 255.0f, 1.0f);
            this.f53664c = rect.width();
            this.d = rect.height();
            this.f53665e = i10;
            int i17 = i10 * i10;
            RenderEffect[] renderEffectArr = this.f53666f;
            if (renderEffectArr != null && renderEffectArr.length == i17) {
                Arrays.fill(renderEffectArr, (Object) null);
            } else {
                this.f53666f = new RenderEffect[i17];
                this.f53667g = new float[i17];
                this.h = new float[i17];
            }
        }
        if (i12 != 0 && (g11 = (g10 = aVar.g()) % i10) != 0) {
            if ((((g10 ^ i10) >> 31) | 1) > 0) {
                i14 = g11;
            } else {
                i14 = g11 + i10;
            }
        } else {
            i14 = 0;
        }
        if (i12 != 0 && (a11 = (a10 = aVar.a()) % i10) != 0) {
            if ((((a10 ^ i10) >> 31) | 1) > 0) {
                i15 = a11;
            } else {
                i15 = a11 + i10;
            }
        } else {
            i15 = 0;
        }
        int i18 = (i15 * i10) + i14;
        float f18 = f13 / f12;
        float f19 = f14 / f12;
        RenderEffect renderEffect = this.f53666f[i18];
        if (renderEffect == null || this.f53667g[i18] != f18 || this.h[i18] != f19) {
            this.f53663b.setFloatUniform("shader_offset", f18, f19);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.f53663b, "content");
            this.f53666f[i18] = renderEffect;
            this.f53667g[i18] = f18;
            this.h[i18] = f19;
        }
        this.f53662a.setPosition(0, 0, i11, i13);
        this.f53662a.setPivotX(0.0f);
        this.f53662a.setPivotY(0.0f);
        this.f53662a.setScaleX(f12);
        this.f53662a.setScaleY(f12);
        this.f53662a.setTranslationX(f13);
        this.f53662a.setTranslationY(f14);
        RecordingCanvas beginRecording = this.f53662a.beginRecording();
        if (i12 != 0) {
            fVar.h.d(f10, f11, i10, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            fVar.f53669f.e(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
            beginRecording.restore();
        }
        this.f53662a.endRecording();
        this.f53662a.setRenderEffect(renderEffect);
        fVar.f53673w = false;
    }

    @Override
    public final void b() {
        this.f53662a.discardDisplayList();
        this.f53664c = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f53662a);
    }

    @Override
    public final boolean d() {
        return this.f53662a.hasDisplayList();
    }

    @Override
    public final void e(float f10) {
        this.f53662a.setAlpha(f10);
    }
}
