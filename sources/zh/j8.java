package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class j8 extends AnimatorListenerAdapter {
    public final int f52117a;
    public final int f52118b;
    public final int f52119c;
    public final int d;
    public final k8 f52120e;

    public j8(k8 k8Var, int i10, int i11, int i12, int i13) {
        this.f52120e = k8Var;
        this.f52117a = i10;
        this.f52118b = i11;
        this.f52119c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f52117a, this.f52118b);
        k8 k8Var = this.f52120e;
        k8Var.f52168r = d;
        k8Var.f52169s = i0.a.d(1.0f, this.f52119c, this.d);
        k8Var.f52172y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{k8Var.f52168r, k8Var.f52169s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        k8Var.invalidate();
    }
}
