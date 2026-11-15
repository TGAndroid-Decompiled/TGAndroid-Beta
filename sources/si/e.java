package si;

import ai.r0;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.support.v4.media.session.w;
import c8.hc;
import java.util.Arrays;
public final class e extends hc {
    public final RenderNode f56919a = w.o();
    public final RuntimeShader f56920b = r0.d();
    public int f56921c = -1;
    public int d = -1;
    public int f56922e;
    public RenderEffect[] f56923f;
    public float[] f56924g;
    public float[] h;
    public final f f56925i;

    public e(f fVar) {
        this.f56925i = fVar;
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
        int f13;
        int f14;
        f fVar = this.f56925i;
        a aVar2 = fVar.h;
        if (aVar2 != null && aVar2.g() && aVar2.e() > 0) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (i7 != 0) {
            i10 = aVar2.e();
        } else {
            i10 = 1;
        }
        if (i7 != 0) {
            f10 = f.l(rectF.left, aVar2.f(), i10) - (i7 * i10);
        } else {
            f10 = rectF.left;
        }
        if (i7 != 0) {
            f11 = f.l(rectF.top, aVar2.a(), i10) - (i7 * i10);
        } else {
            f11 = rectF.top;
        }
        float f15 = f10 - rectF.left;
        float f16 = f11 - rectF.top;
        float f17 = i10;
        int ceil = ((int) Math.ceil((rectF.right - f10) / f17)) + i7;
        int ceil2 = ((int) Math.ceil((rectF.bottom - f11) / f17)) + i7;
        if (!fVar.f56930w && this.f56921c == rect.width() && this.d == rect.height() && this.f56922e == i10) {
            aVar = aVar2;
            i12 = i7;
            i11 = ceil;
            f12 = f17;
            i13 = ceil2;
        } else {
            int i16 = fVar.f56932y;
            if (i16 != 1 && i16 != 4) {
                height = rect.width();
            } else {
                height = rect.height();
            }
            float f18 = height;
            RuntimeShader runtimeShader = this.f56920b;
            g gVar = fVar.E;
            gVar.getClass();
            float f19 = 0;
            f12 = f17;
            aVar = aVar2;
            i11 = ceil;
            i12 = i7;
            i13 = ceil2;
            runtimeShader.setInputShader("alphaMask", f.k(fVar, gVar, f18, f19, -1, i10));
            RuntimeShader runtimeShader2 = this.f56920b;
            g gVar2 = fVar.F;
            gVar2.getClass();
            runtimeShader2.setInputShader("overlay", f.k(fVar, gVar2, f18, f19, fVar.I, i10));
            this.f56920b.setFloatUniform("background_color_premultiplied", Color.red(fVar.I) / 255.0f, Color.green(fVar.I) / 255.0f, Color.blue(fVar.I) / 255.0f, 1.0f);
            this.f56921c = rect.width();
            this.d = rect.height();
            this.f56922e = i10;
            int i17 = i10 * i10;
            RenderEffect[] renderEffectArr = this.f56923f;
            if (renderEffectArr != null && renderEffectArr.length == i17) {
                Arrays.fill(renderEffectArr, (Object) null);
            } else {
                this.f56923f = new RenderEffect[i17];
                this.f56924g = new float[i17];
                this.h = new float[i17];
            }
        }
        if (i12 != 0 && (f14 = (f13 = aVar.f()) % i10) != 0) {
            if ((((f13 ^ i10) >> 31) | 1) > 0) {
                i14 = f14;
            } else {
                i14 = f14 + i10;
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
        float f20 = f15 / f12;
        float f21 = f16 / f12;
        RenderEffect renderEffect = this.f56923f[i18];
        if (renderEffect == null || this.f56924g[i18] != f20 || this.h[i18] != f21) {
            this.f56920b.setFloatUniform("shader_offset", f20, f21);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.f56920b, "content");
            this.f56923f[i18] = renderEffect;
            this.f56924g[i18] = f20;
            this.h[i18] = f21;
        }
        this.f56919a.setPosition(0, 0, i11, i13);
        this.f56919a.setPivotX(0.0f);
        this.f56919a.setPivotY(0.0f);
        this.f56919a.setScaleX(f12);
        this.f56919a.setScaleY(f12);
        this.f56919a.setTranslationX(f15);
        this.f56919a.setTranslationY(f16);
        RecordingCanvas beginRecording = this.f56919a.beginRecording();
        if (i12 != 0) {
            fVar.h.d(f10, f11, i10, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            fVar.f56926f.b0(rectF.left, rectF.top, rectF.right, rectF.bottom, beginRecording);
            beginRecording.restore();
        }
        this.f56919a.endRecording();
        this.f56919a.setRenderEffect(renderEffect);
        fVar.f56930w = false;
    }

    @Override
    public final void b() {
        this.f56919a.discardDisplayList();
        this.f56921c = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f56919a);
    }

    @Override
    public final boolean d() {
        return this.f56919a.hasDisplayList();
    }

    @Override
    public final void e(float f10) {
        this.f56919a.setAlpha(f10);
    }
}
