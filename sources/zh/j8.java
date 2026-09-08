package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class j8 extends AnimatorListenerAdapter {
    public final int f52148a;
    public final int f52149b;
    public final int f52150c;
    public final int d;
    public final k8 f52151e;

    public j8(k8 k8Var, int i10, int i11, int i12, int i13) {
        this.f52151e = k8Var;
        this.f52148a = i10;
        this.f52149b = i11;
        this.f52150c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f52148a, this.f52149b);
        k8 k8Var = this.f52151e;
        k8Var.f52199r = d;
        k8Var.f52200s = i0.a.d(1.0f, this.f52150c, this.d);
        k8Var.f52203y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{k8Var.f52199r, k8Var.f52200s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        k8Var.invalidate();
    }
}
