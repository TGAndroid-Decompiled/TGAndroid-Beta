package qi;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.support.v4.media.session.w;
import java.util.Arrays;
import org.telegram.ui.Components.ma0;
import v7.q;
public final class e extends q {
    public final RenderNode f53966b = w.o();
    public final RuntimeShader f53967c = ma0.a();
    public int d = -1;
    public int f53968e = -1;
    public int f53969f;
    public RenderEffect[] f53970g;
    public float[] h;
    public float[] f53971i;
    public final f f53972j;

    public e(f fVar) {
        this.f53972j = fVar;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        int i3;
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
        f fVar = this.f53972j;
        a aVar2 = fVar.h;
        if (aVar2 != null && aVar2.g() && aVar2.e() > 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i3 != 0) {
            i10 = aVar2.e();
        } else {
            i10 = 1;
        }
        if (i3 != 0) {
            f10 = f.l(rectF.left, aVar2.f(), i10) - (i3 * i10);
        } else {
            f10 = rectF.left;
        }
        if (i3 != 0) {
            f11 = f.l(rectF.top, aVar2.a(), i10) - (i3 * i10);
        } else {
            f11 = rectF.top;
        }
        float f15 = f10 - rectF.left;
        float f16 = f11 - rectF.top;
        float f17 = i10;
        int ceil = ((int) Math.ceil((rectF.right - f10) / f17)) + i3;
        int ceil2 = ((int) Math.ceil((rectF.bottom - f11) / f17)) + i3;
        if (!fVar.f53977w && this.d == rect.width() && this.f53968e == rect.height() && this.f53969f == i10) {
            aVar = aVar2;
            i12 = i3;
            i11 = ceil;
            f12 = f17;
            i13 = ceil2;
        } else {
            int i16 = fVar.f53979y;
            if (i16 != 1 && i16 != 4) {
                height = rect.width();
            } else {
                height = rect.height();
            }
            float f18 = height;
            RuntimeShader runtimeShader = this.f53967c;
            g gVar = fVar.E;
            gVar.getClass();
            float f19 = 0;
            f12 = f17;
            aVar = aVar2;
            i11 = ceil;
            i12 = i3;
            i13 = ceil2;
            runtimeShader.setInputShader("alphaMask", f.k(fVar, gVar, f18, f19, -1, i10));
            RuntimeShader runtimeShader2 = this.f53967c;
            g gVar2 = fVar.F;
            gVar2.getClass();
            runtimeShader2.setInputShader("overlay", f.k(fVar, gVar2, f18, f19, fVar.I, i10));
            this.f53967c.setFloatUniform("background_color_premultiplied", Color.red(fVar.I) / 255.0f, Color.green(fVar.I) / 255.0f, Color.blue(fVar.I) / 255.0f, 1.0f);
            this.d = rect.width();
            this.f53968e = rect.height();
            this.f53969f = i10;
            int i17 = i10 * i10;
            RenderEffect[] renderEffectArr = this.f53970g;
            if (renderEffectArr != null && renderEffectArr.length == i17) {
                Arrays.fill(renderEffectArr, (Object) null);
            } else {
                this.f53970g = new RenderEffect[i17];
                this.h = new float[i17];
                this.f53971i = new float[i17];
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
        RenderEffect renderEffect = this.f53970g[i18];
        if (renderEffect == null || this.h[i18] != f20 || this.f53971i[i18] != f21) {
            this.f53967c.setFloatUniform("shader_offset", f20, f21);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.f53967c, "content");
            this.f53970g[i18] = renderEffect;
            this.h[i18] = f20;
            this.f53971i[i18] = f21;
        }
        this.f53966b.setPosition(0, 0, i11, i13);
        this.f53966b.setPivotX(0.0f);
        this.f53966b.setPivotY(0.0f);
        this.f53966b.setScaleX(f12);
        this.f53966b.setScaleY(f12);
        this.f53966b.setTranslationX(f15);
        this.f53966b.setTranslationY(f16);
        RecordingCanvas beginRecording = this.f53966b.beginRecording();
        if (i12 != 0) {
            fVar.h.c(f10, f11, i10, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            fVar.f53973f.l(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
            beginRecording.restore();
        }
        this.f53966b.endRecording();
        this.f53966b.setRenderEffect(renderEffect);
        fVar.f53977w = false;
    }

    @Override
    public final void b() {
        this.f53966b.discardDisplayList();
        this.d = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f53966b);
    }

    @Override
    public final boolean d() {
        return this.f53966b.hasDisplayList();
    }

    @Override
    public final void e(float f10) {
        this.f53966b.setAlpha(f10);
    }
}
