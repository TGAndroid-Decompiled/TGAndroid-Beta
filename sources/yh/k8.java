package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class k8 extends AnimatorListenerAdapter {
    public final int f47310a;
    public final int f47311b;
    public final int f47312c;
    public final int d;
    public final l8 e;

    public k8(l8 l8Var, int i10, int i11, int i12, int i13) {
        this.e = l8Var;
        this.f47310a = i10;
        this.f47311b = i11;
        this.f47312c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f47310a, this.f47311b);
        l8 l8Var = this.e;
        l8Var.f47373r = d;
        l8Var.f47374s = i0.a.d(1.0f, this.f47312c, this.d);
        l8Var.f47377y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{l8Var.f47373r, l8Var.f47374s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        l8Var.invalidate();
    }
}
