package yh;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class t8 extends b2.g {
    public final ArrayList f52051b;
    public final RuntimeShader f52052c;
    public RenderEffect d;
    public int f52053e;
    public int f52054f;
    public int f52055g;
    public float h;
    public final float[] f52056i;
    public final float[] f52057j;
    public final float[] f52058k;
    public final float[] f52059l;

    public t8(View view) {
        super(view);
        this.f52051b = new ArrayList();
        this.f52056i = new float[7];
        this.f52057j = new float[7];
        this.f52058k = new float[7];
        this.f52059l = new float[7];
        RuntimeShader runtimeShader = new RuntimeShader(AndroidUtilities.readRes(R.raw.superripple_effect));
        this.f52052c = runtimeShader;
        Z0(true);
        this.d = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
    }

    public final void Z0(boolean z10) {
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        float f7;
        float radius;
        float f10;
        float radius2;
        View view = (View) this.f3235a;
        if (!z10 && this.f52054f == view.getWidth() && this.f52055g == view.getHeight() && Math.abs(this.h - AndroidUtilities.density) <= 0.01f) {
            return;
        }
        RuntimeShader runtimeShader = this.f52052c;
        int width = view.getWidth();
        this.f52054f = width;
        int height = view.getHeight();
        this.f52055g = height;
        runtimeShader.setFloatUniform("size", width, height);
        RuntimeShader runtimeShader2 = this.f52052c;
        float f11 = AndroidUtilities.density;
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
        RuntimeShader runtimeShader3 = this.f52052c;
        if (roundedCorner4 != null && (view == view.getRootView() || AndroidUtilities.navigationBarHeight <= 0)) {
            f7 = roundedCorner4.getRadius();
        } else {
            f7 = 0.0f;
        }
        if (roundedCorner2 == null) {
            radius = 0.0f;
        } else {
            radius = roundedCorner2.getRadius();
        }
        if (roundedCorner3 != null && (view == view.getRootView() || AndroidUtilities.navigationBarHeight <= 0)) {
            f10 = roundedCorner3.getRadius();
        } else {
            f10 = 0.0f;
        }
        if (roundedCorner == null) {
            radius2 = 0.0f;
        } else {
            radius2 = roundedCorner.getRadius();
        }
        runtimeShader3.setFloatUniform("radius", f7, radius, f10, radius2);
    }

    public final void a1() {
        RenderEffect renderEffect;
        boolean z10;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        boolean z11;
        boolean z12;
        boolean z13;
        View view = (View) this.f3235a;
        ArrayList arrayList = this.f52051b;
        boolean z14 = false;
        if (!arrayList.isEmpty()) {
            boolean z15 = true;
            if (this.f52053e != Math.min(7, arrayList.size())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f52053e = Math.min(7, arrayList.size());
            int i10 = 0;
            while (true) {
                int i11 = this.f52053e;
                fArr = this.f52059l;
                fArr2 = this.f52058k;
                fArr3 = this.f52057j;
                fArr4 = this.f52056i;
                if (i10 >= i11) {
                    break;
                }
                s8 s8Var = (s8) arrayList.get(i10);
                if (!z10 && Math.abs(fArr4[i10] - s8Var.d) <= 0.001f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                float f7 = s8Var.d;
                float f10 = s8Var.f51984c;
                float f11 = s8Var.f51983b;
                float f12 = s8Var.f51982a;
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
            if (!z10 && this.f52054f == view.getWidth() && this.f52055g == view.getHeight() && Math.abs(this.h - AndroidUtilities.density) <= 0.01f) {
                z15 = false;
            }
            if (z15) {
                this.f52052c.setIntUniform("count", this.f52053e);
                this.f52052c.setFloatUniform("t", fArr4);
                this.f52052c.setFloatUniform("centerX", fArr3);
                this.f52052c.setFloatUniform("centerY", fArr2);
                this.f52052c.setFloatUniform("intensity", fArr);
                Z0(false);
                this.d = RenderEffect.createRuntimeShaderEffect(this.f52052c, "img");
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
