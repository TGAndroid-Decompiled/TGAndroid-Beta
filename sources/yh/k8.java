package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class k8 extends AnimatorListenerAdapter {
    public final int f47663a;
    public final int f47664b;
    public final int f47665c;
    public final int d;
    public final l8 e;

    public k8(l8 l8Var, int i10, int i11, int i12, int i13) {
        this.e = l8Var;
        this.f47663a = i10;
        this.f47664b = i11;
        this.f47665c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f47663a, this.f47664b);
        l8 l8Var = this.e;
        l8Var.f47722r = d;
        l8Var.f47723s = i0.a.d(1.0f, this.f47665c, this.d);
        l8Var.f47726y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{l8Var.f47722r, l8Var.f47723s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        l8Var.invalidate();
    }
}
