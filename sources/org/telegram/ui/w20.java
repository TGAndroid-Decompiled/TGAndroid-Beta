package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w20 extends AnimatorListenerAdapter {
    public final int f50835a;
    public final org.telegram.ui.Components.voip.y f50836b;
    public final e40 f50837c;

    public w20(e40 e40Var, org.telegram.ui.Components.voip.y yVar, int i7) {
        this.f50835a = i7;
        this.f50837c = e40Var;
        this.f50836b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50835a) {
            case 0:
                org.telegram.ui.Components.voip.y yVar = this.f50836b;
                if (yVar.getParent() != null) {
                    this.f50837c.f28624b.removeView(yVar);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.voip.y yVar2 = this.f50836b;
                if (yVar2.getParent() != null) {
                    this.f50837c.f28624b.removeView(yVar2);
                    return;
                }
                return;
        }
    }
}
