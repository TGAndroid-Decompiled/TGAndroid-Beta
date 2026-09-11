package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class u0 extends AnimatorListenerAdapter {
    public final int f40875a;
    public final int f40876b;
    public final Object f40877c;

    public u0(Object obj, int i10, int i11) {
        this.f40875a = i11;
        this.f40877c = obj;
        this.f40876b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40875a) {
            case 0:
                i4 i4Var = (i4) this.f40877c;
                i4Var.f37232u0[1].b();
                i4Var.f37232u0[1].setVisibility(8);
                i4Var.O0.T(i4Var.f37232u0[0].f38551b);
                org.telegram.ui.Cells.q9 q9Var = i4Var.O0;
                m3[] m3VarArr = i4Var.f37232u0;
                q9Var.E0 = m3VarArr[0].d;
                int i10 = this.f40876b;
                m3VarArr[i10].setBackgroundDrawable(null);
                i4Var.f37232u0[i10].setLayerType(0, null);
                i4Var.f37233v0 = null;
                i4Var.f37218f0.f21569f = false;
                return;
            case 1:
                ((ev) this.f40877c).f36185c.d.setColorFilter(new PorterDuffColorFilter(this.f40876b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f40877c;
                int i11 = this.f40876b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f40877c).z0(this.f40876b);
                return;
        }
    }
}
