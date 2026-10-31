package rh;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
public final class a9 extends b2.h {
    public final ArrayList f46647b;
    public final RuntimeShader f46648c;
    public RenderEffect d;
    public int e;
    public int f46649f;
    public int f46650g;
    public float h;
    public final float[] f46651i;
    public final float[] f46652j;
    public final float[] f46653k;
    public final float[] f46654l;

    public a9(View view) {
        super(view);
        this.f46647b = new ArrayList();
        this.f46651i = new float[7];
        this.f46652j = new float[7];
        this.f46653k = new float[7];
        this.f46654l = new float[7];
        RuntimeShader runtimeShader = new RuntimeShader(org.telegram.messenger.i0.y2(null, 2131624239));
        this.f46648c = runtimeShader;
        e1(true);
        this.d = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
    }

    public final void e1(boolean z10) {
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        float f7;
        float radius;
        float f10;
        View view = (View) this.f2047a;
        if (!z10 && this.f46649f == view.getWidth() && this.f46650g == view.getHeight() && Math.abs(this.h - org.telegram.messenger.i0.f16025p) <= 0.01f) {
            return;
        }
        RuntimeShader runtimeShader = this.f46648c;
        int width = view.getWidth();
        this.f46649f = width;
        int height = view.getHeight();
        this.f46650g = height;
        runtimeShader.setFloatUniform("size", width, height);
        RuntimeShader runtimeShader2 = this.f46648c;
        float f11 = org.telegram.messenger.i0.f16025p;
        this.h = f11;
        runtimeShader2.setFloatUniform("density", f11);
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        RoundedCorner roundedCorner4 = null;
        if (rootWindowInsets == null) {
            roundedCorner = null;
        } else {
            roundedCorner = rootWindowInsets.getRoundedCorner(0);
        }
        if (rootWindowInsets == null) {
            roundedCorner2 = null;
        } else {
            roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
        }
        if (rootWindowInsets == null) {
            roundedCorner3 = null;
        } else {
            roundedCorner3 = rootWindowInsets.getRoundedCorner(3);
        }
        if (rootWindowInsets != null) {
            roundedCorner4 = rootWindowInsets.getRoundedCorner(2);
        }
        RuntimeShader runtimeShader3 = this.f46648c;
        float f12 = 0.0f;
        if (roundedCorner4 != null && (view == view.getRootView() || org.telegram.messenger.i0.f16021n <= 0)) {
            f7 = roundedCorner4.getRadius();
        } else {
            f7 = 0.0f;
        }
        if (roundedCorner2 == null) {
            radius = 0.0f;
        } else {
            radius = roundedCorner2.getRadius();
        }
        if (roundedCorner3 != null && (view == view.getRootView() || org.telegram.messenger.i0.f16021n <= 0)) {
            f10 = roundedCorner3.getRadius();
        } else {
            f10 = 0.0f;
        }
        if (roundedCorner != null) {
            f12 = roundedCorner.getRadius();
        }
        runtimeShader3.setFloatUniform("radius", f7, radius, f10, f12);
    }

    public final void f1() {
        RenderEffect renderEffect;
        boolean z10;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        boolean z11;
        boolean z12;
        boolean z13;
        View view = (View) this.f2047a;
        ArrayList arrayList = this.f46647b;
        boolean z14 = false;
        if (!arrayList.isEmpty()) {
            boolean z15 = true;
            if (this.e != Math.min(7, arrayList.size())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.e = Math.min(7, arrayList.size());
            int i10 = 0;
            while (true) {
                int i11 = this.e;
                fArr = this.f46654l;
                fArr2 = this.f46653k;
                fArr3 = this.f46652j;
                fArr4 = this.f46651i;
                if (i10 >= i11) {
                    break;
                }
                z8 z8Var = (z8) arrayList.get(i10);
                if (!z10 && Math.abs(fArr4[i10] - z8Var.d) <= 0.001f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                float f7 = z8Var.d;
                float f10 = z8Var.f47829c;
                float f11 = z8Var.f47828b;
                float f12 = z8Var.f47827a;
                fArr4[i10] = f7;
                if (!z11 && Math.abs(fArr3[i10] - f12) <= 0.001f) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                fArr3[i10] = f12;
                if (!z12 && Math.abs(fArr2[i10] - f11) <= 0.001f) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                fArr2[i10] = f11;
                if (!z13 && Math.abs(fArr[i10] - f10) <= 0.001f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                fArr[i10] = f10;
                i10++;
            }
            if (!z10 && this.f46649f == view.getWidth() && this.f46650g == view.getHeight() && Math.abs(this.h - org.telegram.messenger.i0.f16025p) <= 0.01f) {
                z15 = false;
            }
            if (z15) {
                this.f46648c.setIntUniform("count", this.e);
                this.f46648c.setFloatUniform("t", fArr4);
                this.f46648c.setFloatUniform("centerX", fArr3);
                this.f46648c.setFloatUniform("centerY", fArr2);
                this.f46648c.setFloatUniform("intensity", fArr);
                e1(false);
                this.d = RenderEffect.createRuntimeShaderEffect(this.f46648c, "img");
            }
            z14 = z15;
        }
        if (arrayList.isEmpty()) {
            renderEffect = null;
        } else {
            renderEffect = this.d;
        }
        view.setRenderEffect(renderEffect);
        if (z14) {
            view.invalidate();
        }
    }
}
