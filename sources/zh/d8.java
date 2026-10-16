package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class d8 extends AnimatorListenerAdapter {
    public final int f50394a;
    public final int f50395b;
    public final int f50396c;
    public final int d;
    public final e8 e;

    public d8(e8 e8Var, int i10, int i11, int i12, int i13) {
        this.e = e8Var;
        this.f50394a = i10;
        this.f50395b = i11;
        this.f50396c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f50394a, this.f50395b);
        e8 e8Var = this.e;
        e8Var.f50475r = d;
        e8Var.f50476s = i0.a.d(1.0f, this.f50396c, this.d);
        e8Var.f50479y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{e8Var.f50475r, e8Var.f50476s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        e8Var.invalidate();
    }
}
