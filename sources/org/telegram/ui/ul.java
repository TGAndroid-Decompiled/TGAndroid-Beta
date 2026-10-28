package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class ul extends AnimatorListenerAdapter {
    public final boolean f44046a;
    public final boolean f44047b;
    public final boolean f44048c;
    public final wn d;

    public ul(wn wnVar, boolean z10, boolean z11, boolean z12) {
        this.d = wnVar;
        this.f44046a = z10;
        this.f44047b = z11;
        this.f44048c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        wn wnVar = this.d;
        wnVar.Y2 = null;
        ImageView imageView = wnVar.V2;
        int i12 = 4;
        if (this.f44046a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = wnVar.X2;
        if (this.f44047b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = wnVar.W2;
        if (this.f44048c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
