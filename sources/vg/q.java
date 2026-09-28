package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.yf0;
public final class q extends AnimatorListenerAdapter {
    public final float[] f44624a;
    public final float f44625b;
    public final float f44626c;
    public final boolean d;
    public final r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.f44624a = fArr;
        this.f44625b = f7;
        this.f44626c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f44624a;
        fArr[0] = 1.0f;
        r rVar = this.e;
        yf0 yf0Var = rVar.f44627a;
        yf0Var.f43226b.f43201i = AndroidUtilities.lerp(this.f44625b, this.f44626c, 1.0f);
        sg.a aVar = yf0Var.f43226b;
        float f7 = aVar.f43199f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f43199f = (f10 * i10) + f7;
        aVar.b();
        rVar.a(yf0Var.f43226b.f43201i);
        yf0Var.h(750L);
    }
}
