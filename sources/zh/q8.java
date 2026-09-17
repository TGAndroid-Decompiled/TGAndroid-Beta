package zh;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class q8 extends b2.g {
    public final ArrayList f52487b;
    public final RuntimeShader f52488c;
    public RenderEffect d;
    public int f52489e;
    public int f52490f;
    public int f52491g;
    public float h;
    public final float[] f52492i;
    public final float[] f52493j;
    public final float[] f52494k;
    public final float[] f52495l;

    public q8(View view) {
        super(view);
        this.f52487b = new ArrayList();
        this.f52492i = new float[7];
        this.f52493j = new float[7];
        this.f52494k = new float[7];
        this.f52495l = new float[7];
        RuntimeShader runtimeShader = new RuntimeShader(AndroidUtilities.readRes(R.raw.superripple_effect));
        this.f52488c = runtimeShader;
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
        View view = (View) this.f2041a;
        if (!z10 && this.f52490f == view.getWidth() && this.f52491g == view.getHeight() && Math.abs(this.h - AndroidUtilities.density) <= 0.01f) {
            return;
        }
        RuntimeShader runtimeShader = this.f52488c;
        int width = view.getWidth();
        this.f52490f = width;
        int height = view.getHeight();
        this.f52491g = height;
        runtimeShader.setFloatUniform("size", width, height);
        RuntimeShader runtimeShader2 = this.f52488c;
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
        RuntimeShader runtimeShader3 = this.f52488c;
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
        View view = (View) this.f2041a;
        ArrayList arrayList = this.f52487b;
        boolean z14 = false;
        if (!arrayList.isEmpty()) {
            boolean z15 = true;
            if (this.f52489e != Math.min(7, arrayList.size())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f52489e = Math.min(7, arrayList.size());
            int i10 = 0;
            while (true) {
                int i11 = this.f52489e;
                fArr = this.f52495l;
                fArr2 = this.f52494k;
                fArr3 = this.f52493j;
                fArr4 = this.f52492i;
                if (i10 >= i11) {
                    break;
                }
                p8 p8Var = (p8) arrayList.get(i10);
                if (!z10 && Math.abs(fArr4[i10] - p8Var.d) <= 0.001f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                float f7 = p8Var.d;
                float f10 = p8Var.f52443c;
                float f11 = p8Var.f52442b;
                float f12 = p8Var.f52441a;
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
            if (!z10 && this.f52490f == view.getWidth() && this.f52491g == view.getHeight() && Math.abs(this.h - AndroidUtilities.density) <= 0.01f) {
                z15 = false;
            }
            if (z15) {
                this.f52488c.setIntUniform("count", this.f52489e);
                this.f52488c.setFloatUniform("t", fArr4);
                this.f52488c.setFloatUniform("centerX", fArr3);
                this.f52488c.setFloatUniform("centerY", fArr2);
                this.f52488c.setFloatUniform("intensity", fArr);
                Z0(false);
                this.d = RenderEffect.createRuntimeShaderEffect(this.f52488c, "img");
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
