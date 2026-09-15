package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class m8 extends AnimatorListenerAdapter {
    public final int f47474a;
    public final int f47475b;
    public final int f47476c;
    public final int d;
    public final n8 e;

    public m8(n8 n8Var, int i10, int i11, int i12, int i13) {
        this.e = n8Var;
        this.f47474a = i10;
        this.f47475b = i11;
        this.f47476c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f47474a, this.f47475b);
        n8 n8Var = this.e;
        n8Var.f47534r = d;
        n8Var.f47535s = i0.a.d(1.0f, this.f47476c, this.d);
        n8Var.f47538y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{n8Var.f47534r, n8Var.f47535s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        n8Var.invalidate();
    }
}
