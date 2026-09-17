package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class j8 extends AnimatorListenerAdapter {
    public final int f52149a;
    public final int f52150b;
    public final int f52151c;
    public final int d;
    public final k8 f52152e;

    public j8(k8 k8Var, int i10, int i11, int i12, int i13) {
        this.f52152e = k8Var;
        this.f52149a = i10;
        this.f52150b = i11;
        this.f52151c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f52149a, this.f52150b);
        k8 k8Var = this.f52152e;
        k8Var.f52200r = d;
        k8Var.f52201s = i0.a.d(1.0f, this.f52151c, this.d);
        k8Var.f52204y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{k8Var.f52200r, k8Var.f52201s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        k8Var.invalidate();
    }
}
