package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class d8 extends AnimatorListenerAdapter {
    public final int f52406a;
    public final int f52407b;
    public final int f52408c;
    public final int d;
    public final e8 f52409e;

    public d8(e8 e8Var, int i10, int i11, int i12, int i13) {
        this.f52409e = e8Var;
        this.f52406a = i10;
        this.f52407b = i11;
        this.f52408c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f52406a, this.f52407b);
        e8 e8Var = this.f52409e;
        e8Var.f52475r = d;
        e8Var.f52476s = i0.a.d(1.0f, this.f52408c, this.d);
        e8Var.f52479y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{e8Var.f52475r, e8Var.f52476s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        e8Var.invalidate();
    }
}
