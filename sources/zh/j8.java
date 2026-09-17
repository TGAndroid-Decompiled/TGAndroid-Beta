package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class j8 extends AnimatorListenerAdapter {
    public final int f52118a;
    public final int f52119b;
    public final int f52120c;
    public final int d;
    public final k8 f52121e;

    public j8(k8 k8Var, int i10, int i11, int i12, int i13) {
        this.f52121e = k8Var;
        this.f52118a = i10;
        this.f52119b = i11;
        this.f52120c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f52118a, this.f52119b);
        k8 k8Var = this.f52121e;
        k8Var.f52169r = d;
        k8Var.f52170s = i0.a.d(1.0f, this.f52120c, this.d);
        k8Var.f52173y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{k8Var.f52169r, k8Var.f52170s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        k8Var.invalidate();
    }
}
