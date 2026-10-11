package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class d8 extends AnimatorListenerAdapter {
    public final int f52493a;
    public final int f52494b;
    public final int f52495c;
    public final int d;
    public final e8 f52496e;

    public d8(e8 e8Var, int i10, int i11, int i12, int i13) {
        this.f52496e = e8Var;
        this.f52493a = i10;
        this.f52494b = i11;
        this.f52495c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f52493a, this.f52494b);
        e8 e8Var = this.f52496e;
        e8Var.f52550r = d;
        e8Var.f52551s = i0.a.d(1.0f, this.f52495c, this.d);
        e8Var.f52554y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{e8Var.f52550r, e8Var.f52551s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        e8Var.invalidate();
    }
}
