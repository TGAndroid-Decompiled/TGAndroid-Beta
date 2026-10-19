package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class uk implements LayoutTransition.TransitionListener {
    public tk f42002a;
    public int f42003b;
    public final org.telegram.ui.ActionBar.y f42004c;
    public final qn d;

    public uk(qn qnVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = qnVar;
        this.f42004c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f42003b - 1;
        this.f42003b = i11;
        if (i11 == 0 && this.f42002a != null) {
            this.f42004c.getViewTreeObserver().removeOnPreDrawListener(this.f42002a);
            this.f42002a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f42003b == 0 && this.f42002a == null) {
            this.f42002a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.n2) uk.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f42004c.getViewTreeObserver().addOnPreDrawListener(this.f42002a);
        }
        this.f42003b++;
    }
}
