package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class yk implements LayoutTransition.TransitionListener {
    public xk f46034a;
    public int f46035b;
    public final org.telegram.ui.ActionBar.z f46036c;
    public final wn d;

    public yk(wn wnVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = wnVar;
        this.f46036c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f46035b - 1;
        this.f46035b = i11;
        if (i11 == 0 && this.f46034a != null) {
            this.f46036c.getViewTreeObserver().removeOnPreDrawListener(this.f46034a);
            this.f46034a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f46035b == 0 && this.f46034a == null) {
            this.f46034a = new xk(this, 0);
            this.f46036c.getViewTreeObserver().addOnPreDrawListener(this.f46034a);
        }
        this.f46035b++;
    }
}
