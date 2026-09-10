package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class n8 extends AnimatorListenerAdapter {
    public final int f45780a;
    public final int f45781b;
    public final int f45782c;
    public final int d;
    public final o8 e;

    public n8(o8 o8Var, int i10, int i11, int i12, int i13) {
        this.e = o8Var;
        this.f45780a = i10;
        this.f45781b = i11;
        this.f45782c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f45780a, this.f45781b);
        o8 o8Var = this.e;
        o8Var.f45836r = d;
        o8Var.f45837s = i0.a.d(1.0f, this.f45782c, this.d);
        o8Var.f45840y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{o8Var.f45836r, o8Var.f45837s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        o8Var.invalidate();
    }
}
