package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class l8 extends AnimatorListenerAdapter {
    public final int f47378a;
    public final int f47379b;
    public final int f47380c;
    public final int d;
    public final m8 e;

    public l8(m8 m8Var, int i10, int i11, int i12, int i13) {
        this.e = m8Var;
        this.f47378a = i10;
        this.f47379b = i11;
        this.f47380c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f47378a, this.f47379b);
        m8 m8Var = this.e;
        m8Var.f47442r = d;
        m8Var.f47443s = i0.a.d(1.0f, this.f47380c, this.d);
        m8Var.f47446y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{m8Var.f47442r, m8Var.f47443s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        m8Var.invalidate();
    }
}
