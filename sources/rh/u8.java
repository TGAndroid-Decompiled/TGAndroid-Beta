package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class u8 extends AnimatorListenerAdapter {
    public final int f47558a;
    public final int f47559b;
    public final int f47560c;
    public final int d;
    public final v8 e;

    public u8(v8 v8Var, int i10, int i11, int i12, int i13) {
        this.e = v8Var;
        this.f47558a = i10;
        this.f47559b = i11;
        this.f47560c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.b.f(1.0f, this.f47558a, this.f47559b);
        v8 v8Var = this.e;
        v8Var.f47613r = f7;
        v8Var.f47614s = i0.b.f(1.0f, this.f47560c, this.d);
        v8Var.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{v8Var.f47613r, v8Var.f47614s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        v8Var.invalidate();
    }
}
