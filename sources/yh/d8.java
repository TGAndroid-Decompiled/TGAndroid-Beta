package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class d8 extends AnimatorListenerAdapter {
    public final int f52636a;
    public final int f52637b;
    public final int f52638c;
    public final int d;
    public final e8 f52639e;

    public d8(e8 e8Var, int i10, int i11, int i12, int i13) {
        this.f52639e = e8Var;
        this.f52636a = i10;
        this.f52637b = i11;
        this.f52638c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f52636a, this.f52637b);
        e8 e8Var = this.f52639e;
        e8Var.f52699r = d;
        e8Var.f52700s = i0.a.d(1.0f, this.f52638c, this.d);
        e8Var.f52703y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{e8Var.f52699r, e8Var.f52700s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        e8Var.invalidate();
    }
}
