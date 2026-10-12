package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class d8 extends AnimatorListenerAdapter {
    public final int f52630a;
    public final int f52631b;
    public final int f52632c;
    public final int d;
    public final e8 f52633e;

    public d8(e8 e8Var, int i10, int i11, int i12, int i13) {
        this.f52633e = e8Var;
        this.f52630a = i10;
        this.f52631b = i11;
        this.f52632c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f52630a, this.f52631b);
        e8 e8Var = this.f52633e;
        e8Var.f52687r = d;
        e8Var.f52688s = i0.a.d(1.0f, this.f52632c, this.d);
        e8Var.f52691y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{e8Var.f52687r, e8Var.f52688s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        e8Var.invalidate();
    }
}
