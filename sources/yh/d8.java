package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class d8 extends AnimatorListenerAdapter {
    public final int f52404a;
    public final int f52405b;
    public final int f52406c;
    public final int d;
    public final e8 f52407e;

    public d8(e8 e8Var, int i10, int i11, int i12, int i13) {
        this.f52407e = e8Var;
        this.f52404a = i10;
        this.f52405b = i11;
        this.f52406c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f52404a, this.f52405b);
        e8 e8Var = this.f52407e;
        e8Var.f52473r = d;
        e8Var.f52474s = i0.a.d(1.0f, this.f52406c, this.d);
        e8Var.f52477y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{e8Var.f52473r, e8Var.f52474s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        e8Var.invalidate();
    }
}
