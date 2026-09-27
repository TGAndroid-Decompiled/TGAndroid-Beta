package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class j8 extends AnimatorListenerAdapter {
    public final int f47637a;
    public final int f47638b;
    public final int f47639c;
    public final int d;
    public final k8 e;

    public j8(k8 k8Var, int i10, int i11, int i12, int i13) {
        this.e = k8Var;
        this.f47637a = i10;
        this.f47638b = i11;
        this.f47639c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f47637a, this.f47638b);
        k8 k8Var = this.e;
        k8Var.f47702r = d;
        k8Var.f47703s = i0.a.d(1.0f, this.f47639c, this.d);
        k8Var.f47706y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{k8Var.f47702r, k8Var.f47703s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        k8Var.invalidate();
    }
}
