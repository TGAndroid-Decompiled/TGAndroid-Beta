package tg;

import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.i0;
public final class g {
    public final RenderNode f48746a;
    public final RuntimeShader f48747b;
    public RenderEffect f48748c;
    public RenderEffect[] d;
    public float[] e;
    public float[] f48749f;
    public int f48750g;
    public float h;
    public float f48751i;
    public float f48752j;
    public float f48753k;
    public float f48754l;
    public float f48755m;
    public float f48756n;
    public float f48757o;
    public float f48758p;
    public int f48759q;

    public g(RenderNode renderNode) {
        this.f48746a = renderNode;
        RuntimeShader runtimeShader = new RuntimeShader(i0.y2(null, 2131624080));
        this.f48747b = runtimeShader;
        RenderEffect createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
        this.f48748c = createRuntimeShaderEffect;
        renderNode.setRenderEffect(createRuntimeShaderEffect);
    }

    public final void a(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i10, float f18, float f19, int i11) {
        float f20;
        float f21;
        float f22;
        float f23;
        int length;
        float f24 = f11 + f14;
        if (f24 > f10) {
            float f25 = f11 / f24;
            f20 = f10 * f25;
            f21 = (1.0f - f25) * f10;
        } else {
            f20 = f11;
            f21 = f14;
        }
        float f26 = f12 + f13;
        if (f26 > f10) {
            float f27 = f12 / f26;
            f22 = f10 * f27;
            f23 = (1.0f - f27) * f10;
        } else {
            f22 = f12;
            f23 = f13;
        }
        if (this.f48750g != i11 || Math.abs(this.h - f7) > 0.1f || Math.abs(this.f48751i - f10) > 0.1f || Math.abs(this.f48752j - f20) > 0.1f || Math.abs(this.f48753k - f22) > 0.1f || Math.abs(this.f48754l - f23) > 0.1f || Math.abs(this.f48755m - f21) > 0.1f || Math.abs(this.f48756n - f15) > 0.1f || Math.abs(this.f48757o - f16) > 0.1f || Math.abs(this.f48758p - f17) > 0.1f || this.f48759q != i10) {
            this.f48759q = i10;
            float alpha = Color.alpha(i10) / 255.0f;
            float f28 = 1.0f / i11;
            this.f48750g = i11;
            this.h = f7;
            this.f48751i = f10;
            this.f48754l = f23;
            this.f48753k = f22;
            this.f48755m = f21;
            this.f48752j = f20;
            this.f48756n = f15;
            this.f48747b.setFloatUniform("size", (f7 / 2.0f) * f28, (f10 / 2.0f) * f28);
            this.f48747b.setFloatUniform("radius", f23 * f28, f22 * f28, f21 * f28, f20 * f28);
            this.f48747b.setFloatUniform("thickness", f15 * f28);
            RuntimeShader runtimeShader = this.f48747b;
            this.f48757o = f16;
            runtimeShader.setFloatUniform("refract_intensity", f16);
            RuntimeShader runtimeShader2 = this.f48747b;
            this.f48758p = f17;
            runtimeShader2.setFloatUniform("refract_index", f17);
            this.f48747b.setFloatUniform("foreground_color_premultiplied", (Color.red(i10) / 255.0f) * alpha, (Color.green(i10) / 255.0f) * alpha, (Color.blue(i10) / 255.0f) * alpha, alpha);
            int i12 = (i11 * i11) + 1;
            RenderEffect[] renderEffectArr = this.d;
            if (renderEffectArr != null && renderEffectArr.length == i12) {
                Arrays.fill(renderEffectArr, (Object) null);
            } else {
                this.d = new RenderEffect[i12];
                this.e = new float[i12];
                this.f48749f = new float[i12];
            }
        }
        float f29 = i11;
        float f30 = ((f7 / 2.0f) - f18) / f29;
        float f31 = ((f10 / 2.0f) - f19) / f29;
        if (f18 == ((int) f18) && f19 == ((int) f19)) {
            int i13 = (int) (-f19);
            int i14 = i13 % i11;
            if (i14 == 0) {
                i14 = 0;
            } else if ((((i13 ^ i11) >> 31) | 1) <= 0) {
                i14 += i11;
            }
            int i15 = (int) (-f18);
            int i16 = i15 % i11;
            length = (i14 * i11) + (i16 != 0 ? (((i15 ^ i11) >> 31) | 1) > 0 ? i16 : i16 + i11 : 0);
        } else {
            length = this.d.length - 1;
        }
        RenderEffect renderEffect = this.d[length];
        if (renderEffect == null || this.e[length] != f30 || this.f48749f[length] != f31) {
            this.f48747b.setFloatUniform("center", f30, f31);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.f48747b, "img");
            this.d[length] = renderEffect;
            this.e[length] = f30;
            this.f48749f[length] = f31;
        }
        if (this.f48748c != renderEffect) {
            RenderNode renderNode = this.f48746a;
            this.f48748c = renderEffect;
            renderNode.setRenderEffect(renderEffect);
        }
    }
}
