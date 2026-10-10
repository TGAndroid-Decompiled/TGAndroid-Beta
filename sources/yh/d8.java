package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class d8 extends AnimatorListenerAdapter {
    public final int f52450a;
    public final int f52451b;
    public final int f52452c;
    public final int d;
    public final e8 f52453e;

    public d8(e8 e8Var, int i10, int i11, int i12, int i13) {
        this.f52453e = e8Var;
        this.f52450a = i10;
        this.f52451b = i11;
        this.f52452c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f52450a, this.f52451b);
        e8 e8Var = this.f52453e;
        e8Var.f52519r = d;
        e8Var.f52520s = i0.a.d(1.0f, this.f52452c, this.d);
        e8Var.f52523y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{e8Var.f52519r, e8Var.f52520s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        e8Var.invalidate();
    }
}
