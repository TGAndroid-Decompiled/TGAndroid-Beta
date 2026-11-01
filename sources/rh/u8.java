package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class u8 extends AnimatorListenerAdapter {
    public final int f47565a;
    public final int f47566b;
    public final int f47567c;
    public final int d;
    public final v8 e;

    public u8(v8 v8Var, int i10, int i11, int i12, int i13) {
        this.e = v8Var;
        this.f47565a = i10;
        this.f47566b = i11;
        this.f47567c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.b.f(1.0f, this.f47565a, this.f47566b);
        v8 v8Var = this.e;
        v8Var.f47627r = f7;
        v8Var.f47628s = i0.b.f(1.0f, this.f47567c, this.d);
        v8Var.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{v8Var.f47627r, v8Var.f47628s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        v8Var.invalidate();
    }
}
