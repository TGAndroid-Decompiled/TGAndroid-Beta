package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

public final class sk implements LayoutTransition.TransitionListener {

    public rk f42659a;

    public int f42660b;

    public final org.telegram.ui.ActionBar.z f42661c;
    public final rn d;

    public sk(rn rnVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = rnVar;
        this.f42661c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f42660b - 1;
        this.f42660b = i11;
        if (i11 != 0 || this.f42659a == null) {
            return;
        }
        this.f42661c.getViewTreeObserver().removeOnPreDrawListener(this.f42659a);
        this.f42659a = null;
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f42660b == 0 && this.f42659a == null) {
            this.f42659a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    ((org.telegram.ui.ActionBar.n2) this.f41949a.d).actionBar.invalidate();
                    return true;
                }
            };
            this.f42661c.getViewTreeObserver().addOnPreDrawListener(this.f42659a);
        }
        this.f42660b++;
    }
}
