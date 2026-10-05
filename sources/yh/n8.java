package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class n8 extends AnimatorListenerAdapter {
    public final int f51715a;
    public final int f51716b;
    public final int f51717c;
    public final int d;
    public final o8 f51718e;

    public n8(o8 o8Var, int i10, int i11, int i12, int i13) {
        this.f51718e = o8Var;
        this.f51715a = i10;
        this.f51716b = i11;
        this.f51717c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f51715a, this.f51716b);
        o8 o8Var = this.f51718e;
        o8Var.f51761r = d;
        o8Var.f51762s = i0.a.d(1.0f, this.f51717c, this.d);
        o8Var.f51765y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{o8Var.f51761r, o8Var.f51762s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        o8Var.invalidate();
    }
}
