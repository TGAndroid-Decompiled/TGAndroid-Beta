package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class d8 extends AnimatorListenerAdapter {
    public final int f52527a;
    public final int f52528b;
    public final int f52529c;
    public final int d;
    public final e8 f52530e;

    public d8(e8 e8Var, int i10, int i11, int i12, int i13) {
        this.f52530e = e8Var;
        this.f52527a = i10;
        this.f52528b = i11;
        this.f52529c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f52527a, this.f52528b);
        e8 e8Var = this.f52530e;
        e8Var.f52584r = d;
        e8Var.f52585s = i0.a.d(1.0f, this.f52529c, this.d);
        e8Var.f52588y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{e8Var.f52584r, e8Var.f52585s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        e8Var.invalidate();
    }
}
