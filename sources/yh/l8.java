package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class l8 extends AnimatorListenerAdapter {
    public final int f51590a;
    public final int f51591b;
    public final int f51592c;
    public final int d;
    public final m8 f51593e;

    public l8(m8 m8Var, int i10, int i11, int i12, int i13) {
        this.f51593e = m8Var;
        this.f51590a = i10;
        this.f51591b = i11;
        this.f51592c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f51590a, this.f51591b);
        m8 m8Var = this.f51593e;
        m8Var.f51661r = d;
        m8Var.f51662s = i0.a.d(1.0f, this.f51592c, this.d);
        m8Var.f51665y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{m8Var.f51661r, m8Var.f51662s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        m8Var.invalidate();
    }
}
