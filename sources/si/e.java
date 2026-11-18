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
import c8.kc;
import java.util.Arrays;
public final class e extends kc {
    public final RenderNode f57495a = w.o();
    public final RuntimeShader f57496b = r0.d();
    public int f57497c = -1;
    public int d = -1;
    public int f57498e;
    public RenderEffect[] f57499f;
    public float[] f57500g;
    public float[] h;
    public final f f57501i;

    public e(f fVar) {
        this.f57501i = fVar;
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
        f fVar = this.f57501i;
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
        if (!fVar.f57506w && this.f57497c == rect.width() && this.d == rect.height() && this.f57498e == i10) {
            aVar = aVar2;
            i12 = i7;
            i11 = ceil;
            f12 = f17;
            i13 = ceil2;
        } else {
            int i16 = fVar.f57508y;
            if (i16 != 1 && i16 != 4) {
                height = rect.width();
            } else {
                height = rect.height();
            }
            float f18 = height;
            RuntimeShader runtimeShader = this.f57496b;
            g gVar = fVar.E;
            gVar.getClass();
            float f19 = 0;
            f12 = f17;
            aVar = aVar2;
            i11 = ceil;
            i12 = i7;
            i13 = ceil2;
            runtimeShader.setInputShader("alphaMask", f.k(fVar, gVar, f18, f19, -1, i10));
            RuntimeShader runtimeShader2 = this.f57496b;
            g gVar2 = fVar.F;
            gVar2.getClass();
            runtimeShader2.setInputShader("overlay", f.k(fVar, gVar2, f18, f19, fVar.I, i10));
            this.f57496b.setFloatUniform("background_color_premultiplied", Color.red(fVar.I) / 255.0f, Color.green(fVar.I) / 255.0f, Color.blue(fVar.I) / 255.0f, 1.0f);
            this.f57497c = rect.width();
            this.d = rect.height();
            this.f57498e = i10;
            int i17 = i10 * i10;
            RenderEffect[] renderEffectArr = this.f57499f;
            if (renderEffectArr != null && renderEffectArr.length == i17) {
                Arrays.fill(renderEffectArr, (Object) null);
            } else {
                this.f57499f = new RenderEffect[i17];
                this.f57500g = new float[i17];
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
        RenderEffect renderEffect = this.f57499f[i18];
        if (renderEffect == null || this.f57500g[i18] != f20 || this.h[i18] != f21) {
            this.f57496b.setFloatUniform("shader_offset", f20, f21);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.f57496b, "content");
            this.f57499f[i18] = renderEffect;
            this.f57500g[i18] = f20;
            this.h[i18] = f21;
        }
        this.f57495a.setPosition(0, 0, i11, i13);
        this.f57495a.setPivotX(0.0f);
        this.f57495a.setPivotY(0.0f);
        this.f57495a.setScaleX(f12);
        this.f57495a.setScaleY(f12);
        this.f57495a.setTranslationX(f15);
        this.f57495a.setTranslationY(f16);
        RecordingCanvas beginRecording = this.f57495a.beginRecording();
        if (i12 != 0) {
            fVar.h.d(f10, f11, i10, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            fVar.f57502f.o(rectF.left, rectF.top, rectF.right, rectF.bottom, beginRecording);
            beginRecording.restore();
        }
        this.f57495a.endRecording();
        this.f57495a.setRenderEffect(renderEffect);
        fVar.f57506w = false;
    }

    @Override
    public final void b() {
        this.f57495a.discardDisplayList();
        this.f57497c = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f57495a);
    }

    @Override
    public final boolean d() {
        return this.f57495a.hasDisplayList();
    }

    @Override
    public final void e(float f10) {
        this.f57495a.setAlpha(f10);
    }
}
