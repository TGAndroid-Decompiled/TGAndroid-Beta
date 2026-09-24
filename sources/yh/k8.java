package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class k8 extends AnimatorListenerAdapter {
    public final int f47616a;
    public final int f47617b;
    public final int f47618c;
    public final int d;
    public final l8 e;

    public k8(l8 l8Var, int i10, int i11, int i12, int i13) {
        this.e = l8Var;
        this.f47616a = i10;
        this.f47617b = i11;
        this.f47618c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f47616a, this.f47617b);
        l8 l8Var = this.e;
        l8Var.f47680r = d;
        l8Var.f47681s = i0.a.d(1.0f, this.f47618c, this.d);
        l8Var.f47684y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{l8Var.f47680r, l8Var.f47681s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        l8Var.invalidate();
    }
}
