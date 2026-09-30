package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.yf0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f44625a;
    public final float f44626b;
    public final float f44627c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f44625a = fArr;
        this.f44626b = f7;
        this.f44627c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f44625a;
        fArr[0] = 1.0f;
        r rVar = this.e;
        yf0 yf0Var = rVar.f44628a;
        yf0Var.f43227b.f43202i = AndroidUtilities.lerp(this.f44626b, this.f44627c, 1.0f);
        sg.a aVar = yf0Var.f43227b;
        float f7 = aVar.f43200f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f43200f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(yf0Var.f43227b.f43202i);
        yf0Var.h(750L);
    }
}
